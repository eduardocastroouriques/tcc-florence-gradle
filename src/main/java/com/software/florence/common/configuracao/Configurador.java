package com.software.florence.common.configuracao;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configurador {

	private static Properties props;
	private static String arquivoPropriedade = "/application.properties";

	private Configurador() {
		carrregarPropriedades();
	}// Configurador()

	public static String getValor(String chave) {
		if (props == null) {
			carrregarPropriedades();
		} // if
		return (String) props.getProperty(chave);
	}// getValor()

	private static void carrregarPropriedades() {
		try {
			props = new Properties();
			InputStream in = Configurador.class.getResourceAsStream(arquivoPropriedade);
			props.load(in);
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// carrregarPropriedades()
	
}// Configurador()