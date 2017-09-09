package com.software.florence.common.pattern.application.resource;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.model.AbstractDomain;
import com.software.florence.common.pattern.application.service.Service;
import com.software.florence.common.util.mensagem.MensagemNegocio;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.Serializable;
import java.util.List;

public abstract class AbstractResource<ENTITY extends AbstractDomain<PK>, PK extends Serializable> {

	private Service<ENTITY, PK> service;
	
	public AbstractResource(Service<ENTITY, PK> service) {
		this.service = service;
	}// AbstractWS()

	@SuppressWarnings("unchecked")
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Resposta> save(@RequestBody ENTITY entity) {
		ENTITY retorno = null;
		try {
			retorno = this.service.save(entity);
		} catch (NegocioException e) {
			return this.criarRespostaErro(e);
		} // try-catch
        return this.criarResposta(HttpStatus.CREATED, retorno);
	}// save()

	@SuppressWarnings("unchecked")
	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ENTITY> update(@RequestBody ENTITY entity) {
		ENTITY retorno = null;
		try {
			retorno = this.service.update(entity);
		} catch (NegocioException e) {
			return this.criarRespostaErro(e);
		} // try-catch
        return this.criarResposta(HttpStatus.OK, retorno);
	}// update()

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<ENTITY> delete(@PathVariable("id") PK id) {
		try {
			this.service.delete(id);
			;
		} catch (NegocioException e) {
			return this.criarRespostaErro(e);
		} // try-catch
        return this.criarResposta(HttpStatus.OK);
	}// delete()

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<ENTITY> findById(@PathVariable PK id) {
		ENTITY retorno = null;
		try {
			retorno = this.service.findById(id);
		} catch (NegocioException e) {
			return this.criarRespostaErro(e);
		} // try-catch
		return this.criarResposta(HttpStatus.OK, retorno);
	}// findById()

	@SuppressWarnings("unchecked")
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<Iterable<ENTITY>> findAll() {
		Iterable<ENTITY> retorno = null;
		try {
			retorno = this.service.findAll();
		} catch (NegocioException e) {
			return this.criarRespostaErro(e);
		} // try-catch
		return this.criarResposta(HttpStatus.OK, retorno);
	}// findAll()

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/count", method = RequestMethod.GET)
	public ResponseEntity<Long> count() {
		Long retorno = null;
		try {
			retorno = this.service.count();
		} catch (NegocioException e) {
			return this.criarRespostaErro(e);
		} // try-catch
		return this.criarResposta(HttpStatus.OK, retorno);
	}// count()

	@SuppressWarnings("rawtypes")
	protected ResponseEntity criarRespostaOK() {
		return this.criarResponse(new Resposta(HttpStatus.OK));
	}// criarRespostaOK()

	@SuppressWarnings("rawtypes")
	protected ResponseEntity criarRespostaOK(Object data) {
		return this.criarResponse(new Resposta(HttpStatus.OK, data));
	}// criarRespostaOK()

	@SuppressWarnings("rawtypes")
	protected ResponseEntity criarRespostaOK(MensagemNegocio mensagem) {
		return this.criarResponse(new Resposta(HttpStatus.OK, mensagem));
	}// criarRespostaOK()

	@SuppressWarnings("rawtypes")
	protected ResponseEntity criarRespostaOK(List<MensagemNegocio> mensagens) {
		return this.criarResponse(new Resposta(HttpStatus.OK, mensagens));
	}// criarRespostaOK()

	@SuppressWarnings("rawtypes")
	protected ResponseEntity criarRespostaOK(Object data, MensagemNegocio mensagem) {
		return this.criarResponse(new Resposta(HttpStatus.OK, data, mensagem));
	}// criarRespostaOK()

	@SuppressWarnings("rawtypes")
	protected ResponseEntity criarRespostaOK(Object data, List<MensagemNegocio> mensagens) {
		return this.criarResponse(new Resposta(HttpStatus.OK, data, mensagens));
	}// criarRespostaOK()

	@SuppressWarnings("rawtypes")
	protected ResponseEntity criarRespostaOK(Object data, String tipoMensagem, String mensagem) {
		return this.criarResponse(new Resposta(HttpStatus.OK, data, tipoMensagem, mensagem));
	}// criarRespostaOK()

	@SuppressWarnings("rawtypes")
	protected ResponseEntity criarRespostaOK(Object data, String tipoMensagem, List<String> mensagens) {
		return this.criarResponse(new Resposta(HttpStatus.OK, data, tipoMensagem, mensagens));
	}// criarRespostaOK()

	@SuppressWarnings("rawtypes")
	protected ResponseEntity criarRespostaErro(NegocioException e) {
		return this.criarResponse(new Resposta(e));
	}// criarRespostaErro()

	@SuppressWarnings("rawtypes")
	protected ResponseEntity criarRespostaErro(HttpStatus status, NegocioException e) {
		return this.criarResponse(new Resposta(status, e));
	}// criarRespostaErro()

	@SuppressWarnings("rawtypes")
	protected ResponseEntity criarResposta(HttpStatus status) {
		return this.criarResponse(new Resposta(status));
	}// criarResposta()

	@SuppressWarnings("rawtypes")
	protected ResponseEntity criarResposta(HttpStatus status, Object data) {
		return this.criarResponse(new Resposta(status, data));
	}// criarResposta()

	@SuppressWarnings("rawtypes")
	protected ResponseEntity criarResposta(HttpStatus status, Object data, String tipoMensagem, String mensagem) {
		return this.criarResponse(new Resposta(status, data, tipoMensagem, mensagem));
	}// criarResposta()

	@SuppressWarnings("rawtypes")
	protected ResponseEntity criarResposta(HttpStatus status, Object data, String tipoMensagem,
                                           List<String> mensagens) {
		return this.criarResponse(new Resposta(status, data, tipoMensagem, mensagens));
	}// criarResposta()

	@SuppressWarnings("rawtypes")
	protected ResponseEntity criarResposta(HttpStatus status, Object data, MensagemNegocio mensagem) {
		return this.criarResponse(new Resposta(status, data, mensagem));
	}// criarResposta()

	@SuppressWarnings("rawtypes")
	protected ResponseEntity criarResposta(HttpStatus status, Object data, List<MensagemNegocio> mensagens) {
		return this.criarResponse(new Resposta(status, data, mensagens));
	}// criarResposta()

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private ResponseEntity criarResponse(Resposta resposta) {
		ResponseEntity retorno = new ResponseEntity(resposta, this.getHeaders(), resposta.getStatus());
		return retorno;
	}// criarResponse()

	private HttpHeaders getHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Access-Control-Allow-Origin", "*");
		headers.add("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT");
		headers.add("Access-Control-Allow-Headers", "X-Requested-With, Content-Type, X-Codingpedia");
		return headers;
	}// getHeaders()

}// AbstractWS()