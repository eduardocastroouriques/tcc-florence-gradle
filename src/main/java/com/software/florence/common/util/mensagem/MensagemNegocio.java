package com.software.florence.common.util.mensagem;

/**
 * <b>Autor:</b><br>
 * <blockquote>Felipe Rudolfe Carvalho Pinheiro </blockquote><br>
 * <b>Data:</b><br>
 * <blockquote>24 de ago de 2016</blockquote>
 */
public class MensagemNegocio {
	
	public static final String ALERTA = "warning";
	public static final String ERRO = "error";
	public static final String INFORMACAO = "info";
	public static final String SUCESSO = "success";
	public static final String QUESTAO = "question";
	
	public static final String MSG_ERRO = "Ocorreu um erro ao executar esta operação";
	public static final String MSG_SUCESSO = "Operação realizada com sucesso";
	
	public static final String MSG_SALVO_SUCESSO = "Informação salva com sucesso";
	public static final String MSG_EXCLUIDO_SUCESSO = "Informação excluída com sucesso";

	private String tipo;
	private String texto;

	public MensagemNegocio(String tipo, String texto) {
		this.tipo = tipo;
		this.texto = texto;
	}// MensagemNegocio()

	public String getTipo() {
		return tipo;
	}// getTipo()

	public String getTexto() {
		return texto;
	}// getTexto()

	@Override
	public String toString() {
		return "mensagem : {tipo : '" + this.tipo + "', texto : '" + this.texto + "'}";
	}// toString()

}// MensagemNegocio()