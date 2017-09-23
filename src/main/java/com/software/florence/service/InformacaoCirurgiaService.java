package com.software.florence.service;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.service.Service;
import com.software.florence.entity.Cirurgia;
import com.software.florence.entity.InformacaoCirurgia;

public interface InformacaoCirurgiaService extends Service<InformacaoCirurgia, Long>{
    Iterable<InformacaoCirurgia> findByCirurgia(Cirurgia cirurgia) throws NegocioException;
}
