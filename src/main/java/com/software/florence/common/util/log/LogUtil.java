package com.software.florence.common.util.log;


import com.software.florence.common.configuracao.Configurador;
import com.software.florence.common.exception.NegocioException;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.logging.*;

/**
 * @author frpinheiro
 * @since 01/09/2016
 * 
 */
public class LogUtil {

	private static Logger LOG_ERROR;
	private static Logger LOG_AUDITORIA;
	private static String ativo;
	
	static {
		try {
			ativo = Configurador.getValor("log.ativo");
			if (isAtivo()) {
				criarLogError();
				criarLogAuditoria();
			}// if
        } catch(IOException io) {
            LOG_ERROR.warning("O ficheiro hellologgin.xml nao pode ser criado");
        }// try-catch
	}// static

	public static void registrarError(Class<?> classe, Throwable throwable) {
		if (isAtivo()) {
			StringBuilder txt = new StringBuilder();
			txt.append("CLASSE: ").append(classe.getSimpleName()).append("\n");
			txt.append("EXCEPTION: ").append(throwable.getClass().getSimpleName()).append("\n");
			if (throwable instanceof NegocioException) {
				txt.append("MENSAGEM: " + ((NegocioException) throwable).getMensagens());
				LOG_ERROR.warning(txt.toString());
			} else {
				txt.append("MENSAGEM: " + throwable.getMessage());
				LOG_ERROR.severe(txt.toString());
			}// if-else
		}// if
	}// registrarError()
	
	private static boolean isAtivo() {
		return "S".equals(ativo);
	}// isAtivo()
	
	private static void criarLogError() throws IOException, UnsupportedEncodingException {
		Handler console = new ConsoleHandler();
		console.setLevel(Level.FINEST);
		
		Handler file = new FileHandler(Configurador.getValor("log.diretorio.erro"));
		file.setFormatter(new HTMLFormater());
		file.setLevel(Level.ALL);
		file.setEncoding("utf-8");
		
		LOG_ERROR = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		LOG_ERROR.addHandler(file);
		LOG_ERROR.addHandler(console);
		LOG_ERROR.setUseParentHandlers(false);
		LOG_ERROR.setLevel(Level.ALL);
	}// criarLogError()
	
	private static void criarLogAuditoria() throws IOException, UnsupportedEncodingException {
		Handler console = new ConsoleHandler();
		console.setLevel(Level.FINEST);
		
		Handler file = new FileHandler(Configurador.getValor("log.diretorio.auditoria"));
		file.setFormatter(new HTMLFormater());
		file.setLevel(Level.ALL);
		file.setEncoding("utf-8");
		
		LOG_AUDITORIA = Logger.getLogger("auditoria");
		LOG_AUDITORIA.addHandler(file);
		LOG_AUDITORIA.addHandler(console);
		LOG_AUDITORIA.setUseParentHandlers(false);
		LOG_AUDITORIA.setLevel(Level.ALL);
	}// criarLogAuditoria()
	
}// LogUtil()