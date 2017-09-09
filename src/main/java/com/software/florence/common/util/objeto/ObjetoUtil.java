package com.software.florence.common.util.objeto;

import com.software.florence.common.util.reflexao.Reflexao;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;

/**
 * <b>Autor:</b><br>
 * <blockquote>Felipe Rudolfe Carvalho Pinheiro </blockquote><br>
 * <b>Data:</b><br>
 * <blockquote>24 de ago de 2016</blockquote>
 */
public class ObjetoUtil {

	@SuppressWarnings("rawtypes")
	public static Boolean ehNuloOuVazio(Object obj) {
		Boolean retorno = true;
		if (!ehNulo(obj)) {
			if (isCollection(obj)) {
				retorno = ((Collection) obj).isEmpty();
			} else if (isDate(obj)) {
				retorno = false;
			} else if (isNumber(obj)) {
				if (isInteger(obj)) {
					retorno = ((Integer) obj).equals(0);
				} else if (isLong(obj)) {
					retorno = ((Long) obj).equals(0L);
				} else if (isFloat(obj)) {
					retorno = ((Float) obj).equals(0.0F);
				} else if (isDouble(obj)) {
					retorno = ((Double) obj).intValue() == 0;
				} else if(isBigDecimal(obj)) {
					retorno = BigDecimal.ZERO.equals(((BigDecimal) obj));
				}// if-else
			} else if (isString(obj)) {
				retorno = ((String) obj).trim().toString().equals("");
			} else if (isEnum(obj)) {
				retorno = ((Enum) obj).ordinal() < 0;
			} else {
				Boolean existGetter = false;
				Boolean gettersNulo = false;
				for (Field field : obj.getClass().getDeclaredFields()) {
					if (Reflexao.existeGet(obj, field.getName())) {
						existGetter = Boolean.valueOf(true);
						if (naoEhNuloOuVazio(Reflexao.getValorDoAtributo(obj, field.getName()))) {
							gettersNulo = Boolean.valueOf(true);
						} // if
						if ((existGetter.booleanValue()) && (gettersNulo.booleanValue())) {
							retorno = Boolean.valueOf(false);
							break;
						} // if
					} // if
				} // for
			} // if-else
		} // if
		return retorno;
	}// ehNuloOuVazio()
	
	public static boolean ehNulo(Object obj) {
		boolean retorno = true;
		if (obj instanceof Object) {
			retorno = false;
		} // if
		return retorno;
	}// ehNulo()

	public static Boolean naoEhNuloOuVazio(Object obj) {
		return Boolean.valueOf(!(ehNuloOuVazio(obj).booleanValue()));
	}// naoEhNuloOuVazio()

	public static boolean isCollection(Object obj) {
		return obj instanceof Collection;
	}// isCollection()
	
	public static boolean isDate(Object obj) {
		return obj instanceof Date;
	}// isDate()

	public static boolean isNumber(Object obj) {
		return obj instanceof Number;
	}// isNumber()

	public static boolean isInteger(Object obj) {
		return obj instanceof Integer;
	}// isInteger()

	public static boolean isLong(Object obj) {
		return obj instanceof Long;
	}// isLong()

	public static boolean isFloat(Object obj) {
		return obj instanceof Float;
	}// isFloat()

	public static boolean isDouble(Object obj) {
		return obj instanceof Double;
	}// isDouble()
	
	public static boolean isBigDecimal(Object obj) {
		return obj instanceof BigDecimal;
	}// isBigDecimal()

	public static boolean isString(Object obj) {
		return obj instanceof String;
	}// isString()

	public static boolean isEnum(Object obj) {
		return obj instanceof Enum;
	}// isEnum()

}// ObjetoUtil()