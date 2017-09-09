package com.software.florence.common.pattern.application.resource;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.util.mensagem.MensagemNegocio;
import org.springframework.http.HttpStatus;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>Autor:</b><br>
 * Felipe Rudolfe Carvalho Pinheiro<br>
 * <b>Data:</b><br>
 * 19 de mai de 2016
 */
public class Resposta {

	private HttpStatus status;
	private Object data;
	private List<MensagemNegocio> mensagens;

	public Resposta(HttpStatus status) {
		this.status = status;
	}// Resposta()

	public Resposta(HttpStatus status, Object data) {
		this.status = status;
		this.data = data;
	}// Resposta()

	public Resposta(HttpStatus status, MensagemNegocio mensagem) {
		this.status = status;
		this.mensagens = new ArrayList<>();
		this.mensagens.add(mensagem);
	}// Resposta()

	public Resposta(HttpStatus status, List<MensagemNegocio> mensagens) {
		this.status = status;
		this.mensagens = mensagens;
	}// Resposta()

	public Resposta(HttpStatus status, String tipo, String mensagem) {
		this.status = status;
		this.mensagens = new ArrayList<MensagemNegocio>();
		this.mensagens.add(new MensagemNegocio(tipo, mensagem));
	}// Resposta()

	public Resposta(HttpStatus status, String tipo, List<String> mensagens) {
		this.status = status;
		this.mensagens = new ArrayList<MensagemNegocio>();
		for (String mensagem : mensagens) {
			this.mensagens.add(new MensagemNegocio(tipo, mensagem));
		} // for
	}// Resposta()

	public Resposta(HttpStatus status, Object data, String tipo, String mensagem) {
		this.status = status;
		this.data = data;
		this.mensagens = new ArrayList<MensagemNegocio>();
		this.mensagens.add(new MensagemNegocio(tipo, mensagem));
	}// Resposta()

	public Resposta(HttpStatus status, Object data, String tipo, List<String> mensagens) {
		this.status = status;
		this.data = data;
		this.mensagens = new ArrayList<MensagemNegocio>();
		for (String mensagem : mensagens) {
			this.mensagens.add(new MensagemNegocio(tipo, mensagem));
		} // for
	}// Resposta()

	public Resposta(HttpStatus status, Object data, MensagemNegocio mensagem) {
		this.status = status;
		this.data = data;
		this.mensagens = new ArrayList<MensagemNegocio>();
		this.mensagens.add(mensagem);
	}// Resposta()

	public Resposta(HttpStatus status, Object data, List<MensagemNegocio> mensagens) {
		this.status = status;
		this.data = data;
		this.mensagens = mensagens;
	}// Resposta()

	public Resposta(NegocioException e) {
		this.status = HttpStatus.BAD_REQUEST;
		this.mensagens = e.getMensagens();
	}// Resposta()

	public Resposta(HttpStatus status, NegocioException e) {
		this.status = status;
		this.mensagens = e.getMensagens();
	}// Resposta()

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public List<MensagemNegocio> getMensagens() {
		return mensagens;
	}

	public void setMensagens(List<MensagemNegocio> mensagens) {
		this.mensagens = mensagens;
	}

}// Resposta()