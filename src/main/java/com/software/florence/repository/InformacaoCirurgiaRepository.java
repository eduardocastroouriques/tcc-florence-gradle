package com.software.florence.repository;

import com.software.florence.entity.Cirurgia;
import com.software.florence.entity.InformacaoCirurgia;
import com.software.florence.entity.ProcessoDoacao;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface InformacaoCirurgiaRepository extends CrudRepository<InformacaoCirurgia, Long>{

    List<InformacaoCirurgia> findByCirurgia(Cirurgia cirurgia);

}
