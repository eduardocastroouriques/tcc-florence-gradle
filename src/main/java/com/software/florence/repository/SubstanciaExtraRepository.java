package com.software.florence.repository;

import com.software.florence.entity.DoencaPrevia;
import com.software.florence.entity.SubstanciaExtra;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SubstanciaExtraRepository extends CrudRepository<SubstanciaExtra, Long>{

    List<SubstanciaExtra> findByDoencaPrevia(DoencaPrevia doencaPrevia);

}
