package com.software.florence.common.pattern.application.service;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.model.AbstractDomain;
import com.software.florence.common.util.exception.MensagemUtil;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;

public class GenericService<ENTITY extends AbstractDomain<PK>, PK extends Serializable> {

	private CrudRepository<ENTITY, PK> repository;

	public GenericService(CrudRepository<ENTITY, PK> repository) {
		this.repository = repository;
	}// GenericService()

	public ENTITY save(ENTITY entity) throws NegocioException {
		ENTITY retorno = null;
		try {
			retorno = this.repository.save(entity);
		} catch (Exception e) {
			MensagemUtil.lancarErro(getClass(), e);
		} // try-catch
		return retorno;
	}// save()

	public ENTITY update(ENTITY entity) throws NegocioException {
		ENTITY retorno = null;
		try {
			retorno = this.repository.save(entity);
		} catch (Exception e) {
			MensagemUtil.lancarErro(getClass(), e);
		} // try-catch
		return retorno;
	}// update()

	public void delete(PK id) throws NegocioException {
		try {
			this.repository.delete(id);
		} catch (Exception e) {
			MensagemUtil.lancarErro(getClass(), e);
		} // try-catch
	}// delete()

	public ENTITY findById(PK id) throws NegocioException {
		ENTITY retorno = null;
		try {
			retorno = this.repository.findOne(id);
		} catch (Exception e) {
			MensagemUtil.lancarErro(getClass(), e);
		} // try-catch
		return retorno;
	}// findById()

	public Iterable<ENTITY> findAll() throws NegocioException {
		Iterable<ENTITY> retorno = null;
		try {
			retorno = this.repository.findAll();
		} catch (Exception e) {
			MensagemUtil.lancarErro(getClass(), e);
		} // try-catch
		return retorno;
	}// findAll()

	public Long count() throws NegocioException {
		Long retorno = 0L;
		try {
			retorno = this.repository.count();
		} catch (Exception e) {
			MensagemUtil.lancarErro(getClass(), e);
		} // try-catch
		return retorno;
	}// count()

}// GenericService()