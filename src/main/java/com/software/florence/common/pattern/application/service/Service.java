package com.software.florence.common.pattern.application.service;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.model.AbstractDomain;

import java.io.Serializable;

public interface Service<ENTITY extends AbstractDomain<PK>, PK extends Serializable> {

	ENTITY save(ENTITY entity) throws NegocioException;
	ENTITY update(ENTITY entity) throws NegocioException;
	void delete(PK id) throws NegocioException;
	ENTITY findById(PK id) throws NegocioException;
	Iterable<ENTITY> findAll() throws NegocioException;
	Long count() throws NegocioException;

}