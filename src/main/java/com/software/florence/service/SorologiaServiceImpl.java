package com.software.florence.service;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.service.GenericService;
import com.software.florence.common.util.exception.MensagemUtil;
import com.software.florence.entity.ProcessoDoacao;
import com.software.florence.entity.Sorologia;
import com.software.florence.repository.SorologiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SorologiaServiceImpl extends GenericService<Sorologia, Long> implements SorologiaService {

    @Autowired
    SorologiaRepository sorologiaRepository;

    public SorologiaServiceImpl(CrudRepository<Sorologia, Long> repository) {
        super(repository);
    }

    public List<Sorologia> findByProcessoDoacao(ProcessoDoacao processoDoacao) throws NegocioException {
        List<Sorologia> retorno = null;
        try {
            retorno = this.sorologiaRepository.findByProcessoDoacao(processoDoacao);
        } catch (Exception e) {
            MensagemUtil.lancarErro(getClass(), e);
        }
        return retorno;
    }
}
