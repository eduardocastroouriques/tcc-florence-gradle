package com.software.florence.service;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.service.GenericService;
import com.software.florence.common.util.exception.MensagemUtil;
import com.software.florence.entity.*;
import com.software.florence.repository.InfeccaoRepository;
import com.software.florence.repository.InformacaoCirurgiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class InformacaoCirurgiaServiceImpl extends GenericService<InformacaoCirurgia, Long> implements InformacaoCirurgiaService {

    @Autowired
    InformacaoCirurgiaRepository informacaoCirurgiaRepository;

    public InformacaoCirurgiaServiceImpl(CrudRepository<InformacaoCirurgia, Long> repository) {
        super(repository);
    }

    public Iterable<InformacaoCirurgia> findByCirurgia(Cirurgia cirurgia) throws NegocioException {
        Iterable<InformacaoCirurgia> retorno = null;
        try {
            retorno = this.informacaoCirurgiaRepository.findByCirurgia(cirurgia);
        } catch (Exception e) {
            MensagemUtil.lancarErro(getClass(), e);
        }
        return retorno;
    }
}
