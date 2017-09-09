package com.software.florence.common.util.reflexao;

import com.software.florence.common.util.objeto.ObjetoUtil;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;


/**
 * <b>Autor:</b><br>
 * <blockquote>Felipe Rudolfe Carvalho Pinheiro </blockquote><br>
 * <b>Data:</b><br>
 * <blockquote>24 de ago de 2016</blockquote>
 */
@SuppressWarnings({ "rawtypes", "unchecked" })
public class Reflexao {

	private static Map<String, Class> mapaDeClasses;
	private static Map<String, Map<String, Method>> mapaDeSets;
	private static Map<String, Map<String, Method>> mapaDeGets;

	private static final Map<String, Map<String, Method>> getMapaDeSets() {
		if (ObjetoUtil.ehNuloOuVazio(mapaDeSets)) {
			mapaDeSets = new HashMap();
		} // if
		return mapaDeSets;
	}// getMapaDeSets()

	public static Object getValorDoAtributoComposto(Object objeto, String atributo) {
		Object valorDoAtributo = objeto;
		StringTokenizer token = new StringTokenizer(atributo, ".");
		while (token.hasMoreTokens()) {
			if (ObjetoUtil.ehNuloOuVazio(valorDoAtributo)) {
				return null;
			} // if
			valorDoAtributo = getValorDoAtributo(valorDoAtributo, token.nextToken());
		} // while
		return valorDoAtributo;
	}// getValorDoAtributoComposto()

	private static final Map<String, Class> getMapaDeClasses() {
		if (ObjetoUtil.ehNuloOuVazio(mapaDeClasses)) {
			mapaDeClasses = new HashMap();
		} // if
		return mapaDeClasses;
	}// getMapaDeClasses()

	private static final String getNomeBaseDoMetodo(String nomeDoAtributo) {
		StringBuffer retorno = new StringBuffer();
		retorno.append(nomeDoAtributo.substring(0, 1).toUpperCase())
				.append(nomeDoAtributo.substring(1, nomeDoAtributo.length()));
		return retorno.toString();
	}// getNomeBaseDoMetodo()

	private static final String getNomeDoMetodoGet(String nomeDoAtributo) {
		return "get" + getNomeBaseDoMetodo(nomeDoAtributo);
	}// getNomeDoMetodoGet()

	private static final String getNomeDoMetodoSet(String nomeDoAtributo) {
		return "set" + getNomeBaseDoMetodo(nomeDoAtributo);
	}// getNomeDoMetodoSet()

	public static final Object criarInstancia(String nomeDaClasse) {
		return criarInstancia(getClasse(nomeDaClasse));
	}// criarInstancia()

	public static final <T> T criarInstancia(Class<T> classe) {
		T retorno = null;
		try {
			retorno = classe.newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		} // try-catch
		return retorno;
	}// criarInstancia()

	public static final <T> T criarInstancia(Class<T> classe, Object[] parametros) {
		T retorno = null;
		try {
			Class[] tipos = new Class[parametros.length];
			for (int i = 0; i < parametros.length; ++i) {
				tipos[i] = parametros[i].getClass();
			} // for
			Constructor construtor = classe.getConstructor(tipos);
			retorno = (T) construtor.newInstance(parametros);
		} catch (Exception e) {
			throw new RuntimeException(e);
		} // try-catch
		return retorno;
	}// criarInstancia()

	public static final Class getClasse(String nomeDaClasse) {
		return consultarCacheDeClasses(nomeDaClasse);
	}// getClasse()

	private static final Class consultarCacheDeClasses(String nomeDaClasse) {
		Class classe = (Class) getMapaDeClasses().get(nomeDaClasse);
		if (ObjetoUtil.ehNuloOuVazio(classe)) {
			classe = carregarCacheDeClasses(nomeDaClasse);
		} // if
		return classe;
	}// consultarCacheDeClasses()

	private static final Class carregarCacheDeClasses(String nomeDaClasse) {
		Class retorno = null;
		try {
			retorno = Class.forName(nomeDaClasse);
			getMapaDeClasses().put(nomeDaClasse, retorno);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		} // try-catch
		return retorno;
	}// carregarCacheDeClasses()

	public static final Class[] getClassesDosParametros(Object[] parametros) {
		Class[] retorno = null;
		if (!ObjetoUtil.naoEhNuloOuVazio(parametros)) {
			retorno = new Class[parametros.length];
			for (int i = 0; i < retorno.length; ++i) {
				retorno[i] = parametros[i].getClass();
			} // for
		} // if
		return retorno;
	}// getClassesDosParametros()

	public static final Object executaMetodoEstatico(String nomeDaClasse, String nomeDoMetodo, Object[] parametros) {
		Object retorno = null;
		try {
			Class classe = getClasse(nomeDaClasse);
			Method metodo = classe.getMethod(nomeDoMetodo, getClassesDosParametros(parametros));
			retorno = metodo.invoke(classe, parametros);
		} catch (Exception e) {
			throw new RuntimeException(e);
		} // try-catch
		return retorno;
	}// executaMetodoEstatico()

	public static final Object executaMetodo(String nomeDaClasse, String nomeDoMetodo, Object[] parametros) {
		Object retorno = null;
		try {
			Object objeto = criarInstancia(nomeDaClasse);
			Method metodo = objeto.getClass().getMethod(nomeDoMetodo, getClassesDosParametros(parametros));
			retorno = metodo.invoke(objeto, parametros);
		} catch (Exception e) {
			throw new RuntimeException(e);
		} // try-catch
		return retorno;
	}// executaMetodo()

	public static final Object executaMetodo(Object objeto, String nomeDoMetodo, Object[] parametros)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException,
			SecurityException {

		Method metodo = getMetodo(objeto, nomeDoMetodo, parametros);
		return metodo.invoke(metodo, parametros);
	}// executaMetodo()

	private static final Method getMetodo(Object objeto, String nomeDoMetodo, Object[] parametros)
			throws NoSuchMethodException, SecurityException {

		Class[] tiposDosParametros = getTiposDosParametros(parametros);
		return objeto.getClass().getMethod(nomeDoMetodo, tiposDosParametros);
	}// getMetodo()

	private static Class[] getTiposDosParametros(Object[] parametros) {
		Class[] tiposDosParametros = new Class[parametros.length];
		for (int i = 0; i < parametros.length; ++i) {
			tiposDosParametros[i] = parametros[i].getClass();
		} // for
		return tiposDosParametros;
	}// getTiposDosParametros()

	public static final void setValorDoAtributo(Object objetoDestino, String nomeDoCampo, Object valor) {
		Method metodo = getMetodoSet(objetoDestino, nomeDoCampo);
		Object[] parametros = { valor };
		executaMetodo(objetoDestino, metodo, parametros);
	}// setValorDoAtributo(0

	public static final Object getValorDoAtributo(Object objeto, String nomeDoCampo) {
		Method metodo = getMetodoGet(objeto, nomeDoCampo);
		return executaMetodo(objeto, metodo, null);
	}// getValorDoAtributo()

	private static final Map<String, Map<String, Method>> getMapaDeGets() {
		if (ObjetoUtil.ehNuloOuVazio(mapaDeGets)) {
			mapaDeGets = new HashMap();
		} // if
		return mapaDeGets;
	}// getMapaDeGets()

	private static final Method getMetodoGet(Object objeto, String nomeDoCampo) {
		Map getsDaClasse = getGetsDaClasse(objeto.getClass().getName());
		Method metodoSet = (Method) getsDaClasse.get(nomeDoCampo);
		if (ObjetoUtil.ehNuloOuVazio(metodoSet)) {
			metodoSet = criaMetodoGetDoAtributo(objeto, nomeDoCampo);
			getsDaClasse.put(nomeDoCampo, metodoSet);
		} // if
		return metodoSet;
	}// getMetodoGet()

	private static final Method criaMetodoGetDoAtributo(Object objeto, String nomeDoCampo) {
		return criaMetodo(objeto.getClass(), getNomeDoMetodoGet(nomeDoCampo), null);
	}// criaMetodoGetDoAtributo()

	private static final Map<String, Method> getGetsDaClasse(String nomeDoCampo) {
		Map getsDaClasse = (Map) getMapaDeGets().get(nomeDoCampo);
		if (ObjetoUtil.ehNuloOuVazio(getsDaClasse)) {
			getsDaClasse = new HashMap();
			getMapaDeGets().put(nomeDoCampo, getsDaClasse);
		} // if
		return getsDaClasse;
	}// getGetsDaClasse()

	private static final Object executaMetodo(Object objetoDestino, Method metodo, Object[] parametros) {
		Object retorno = null;
		try {
			retorno = metodo.invoke(objetoDestino, parametros);
		} catch (InvocationTargetException e) {
			throw new RuntimeException(e.getCause());
		} catch (Exception e) {
			throw new RuntimeException(e);
		} // try-catch
		return retorno;
	}// executaMetodo()

	public static final Method getMetodoSet(Object objetoDestino, String nomeDoCampo) {
		Map setsDaClasse = getSetsDaClasse(objetoDestino.getClass());
		Method retorno = (Method) setsDaClasse.get(nomeDoCampo);
		if (ObjetoUtil.ehNuloOuVazio(retorno)) {
			Class classeDoParametro = descobreClasseDoParametro(objetoDestino, nomeDoCampo);
			retorno = criaMetodoSetDoAtributo(objetoDestino, nomeDoCampo, classeDoParametro);
			setsDaClasse.put(nomeDoCampo, retorno);
		} // if
		return retorno;
	}// getMetodoSet()

	private static Class descobreClasseDoParametro(Object objetoDestino, String nomeDoCampo) {
		Class classeDoParametro = getMetodoGet(objetoDestino, nomeDoCampo).getReturnType();
		if (ObjetoUtil.ehNuloOuVazio(classeDoParametro)) {
			classeDoParametro = objetoDestino.getClass();
		} // if
		return classeDoParametro;
	}// descobreClasseDoParametro()

	private static final Method criaMetodoSetDoAtributo(Object objetoDestino, String nomeDoCampo,
			Class classeDoParametro) {
		Class[] classesDosParametros = { classeDoParametro };
		Method metodo = criaMetodo(objetoDestino.getClass(), getNomeDoMetodoSet(nomeDoCampo), classesDosParametros);
		return metodo;
	}// criaMetodoSetDoAtributo()

	private static final Method criaMetodo(Class<?> classeDoObjetoDestino, String nomeDoMetodo,
			Class[] classesDosParametros) {
		Method retorno;
		try {
			retorno = classeDoObjetoDestino.getMethod(nomeDoMetodo, classesDosParametros);
		} catch (Exception e) {
			throw new RuntimeException(e);
		} // try-catch
		return retorno;
	}// criaMetodo()

	private static final Map<String, Method> getSetsDaClasse(Class classe) {
		Map setsDaClasse = (Map) getMapaDeSets().get(classe);
		if (ObjetoUtil.ehNuloOuVazio(setsDaClasse)) {
			setsDaClasse = new HashMap();
			getMapaDeSets().put(classe.getName(), setsDaClasse);
		} // if
		return setsDaClasse;
	}// getSetsDaClasse()

	public static boolean existeGet(Object objeto, String nomeDoAtributo) {
		boolean retorno = false;
		if (ObjetoUtil.naoEhNuloOuVazio(nomeDoAtributo)) {
			try {
				objeto.getClass().getMethod(getNomeDoMetodoGet(nomeDoAtributo), new Class[0]);
				retorno = true;
			} catch (SecurityException e) {
				throw new RuntimeException(e);
			} catch (NoSuchMethodException e) {
				retorno = false;
			} // try-catch
		} // if
		return retorno;
	}// existeGet()

	public static boolean existeSet(Object objeto, String nomeDoCampo) {
		boolean retorno = false;
		if (ObjetoUtil.naoEhNuloOuVazio(nomeDoCampo)) {
			try {
				getMetodoSet(objeto, nomeDoCampo);
				retorno = true;
			} catch (SecurityException e) {
				throw new RuntimeException(e);
			} catch (RuntimeException e) {
				retorno = false;
			} // try-catch
		} // if
		return retorno;
	}// existeSet()

	public static void copyProperties(Object dest, Object orig) {
		for (Field field : getInheritedFields(orig)) {
			if (existeGet(orig, field.getName())) {
				Object obj = getValorDoAtributo(orig, field.getName());
				setValorDoAtributo(dest, field.getName(), obj);
			} // if
		} // for
	}// copyProperties()

	public static List<Field> getInheritedFields(Object objeto) {
		List fields = new ArrayList();
		for (Field f : objeto.getClass().getDeclaredFields()) {
			fields.add(f);
		} // for
		for (Class klass : getAllSuperclasses(objeto.getClass())) {
			if (!("java.lang.Object".equalsIgnoreCase(klass.getName()))) {
				for (Field f : klass.getDeclaredFields()) {
					fields.add(f);
				} // for
			} // if
		} // for
		return fields;
	}// getInheritedFields()

	public static List<Class<?>> getAllSuperclasses(Class<?> clazz) {
		List classes = new ArrayList();
		Class superclass = clazz.getSuperclass();
		while (ObjetoUtil.naoEhNuloOuVazio(superclass)) {
			classes.add(superclass);
			superclass = superclass.getSuperclass();
		} // while
		return classes;
	}// getAllSuperclasses()

	public static Boolean ehAnnotationPresenteNoCampo(Field campo, Class<? extends Annotation> annotationClass) {
		return Boolean.valueOf(campo.isAnnotationPresent(annotationClass));
	}// ehAnnotationPresenteNoCampo()

	public static Boolean ehAnnotationPresenteNoMetodoDoCampo(Object objeto, Field campo,
			Class<? extends Annotation> annotationClass) {

		Boolean resultado = Boolean.valueOf(false);
		for (Method metodo : objeto.getClass().getMethods()) {
			if (ehGetterCampo(metodo, campo).booleanValue()) {
				resultado = Boolean.valueOf(metodo.isAnnotationPresent(annotationClass));
			} // if
		} // for

		return resultado;
	}// ehAnnotationPresenteNoMetodoDoCampo()

	private static Boolean ehGetterCampo(Method metodo, Field campo) {
		String nomeMetodo = metodo.getName();
		String nomeCampo = campo.getName();
		Boolean retorno = Boolean.valueOf(false);
		if (nomeMetodo.startsWith("get")) {
			nomeMetodo = nomeMetodo.replaceFirst("get", "").toLowerCase();
			if (nomeMetodo.equals(nomeCampo)) {
				retorno = Boolean.valueOf(true);
			} // if
		} // if
		return retorno;
	}// ehGetterCampo()

	public static Boolean ehCampoVazio(Field campo, Object objeto) {
		Boolean retorno = Boolean.valueOf(false);
		try {
			campo.setAccessible(true);
			Object conteudoCampo = campo.get(objeto);
			retorno = Boolean.valueOf(ObjetoUtil.ehNuloOuVazio(conteudoCampo));
		} catch (Exception e) {
			retorno = Boolean.valueOf(false);
		} // try-catch
		return retorno;
	}// ehCampoVazio()

	public static Collection<Field> getFieldsObjeto(Object objeto) {
		Class clazz = objeto.getClass();
		Class superClazz = clazz.getSuperclass();
		Collection fields = new ArrayList();
		for (Field field : superClazz.getDeclaredFields()) {
			if (existeGet(objeto, field.getName())) {
				fields.add(field);
			} // if
		} // for
		for (Field field : clazz.getDeclaredFields()) {
			if (existeGet(objeto, field.getName())) {
				fields.add(field);
			} // if
		} // if
		return fields;
	}// getFieldsObjeto()

	public static String buildGetMethodName(String fieldName) {
		StringBuilder methodName = new StringBuilder("get");
		methodName.append(fieldName.substring(0, 1).toUpperCase());
		methodName.append(fieldName.substring(1, fieldName.length()));
		return methodName.toString();
	}// buildGetMethodName()

	public static String buildSetMethodName(String fieldName) {
		StringBuilder methodName = new StringBuilder("set");
		methodName.append(fieldName.substring(0, 1).toUpperCase());
		methodName.append(fieldName.substring(1, fieldName.length()));
		return methodName.toString();
	}// buildSetMethodName()

}// Reflexao()