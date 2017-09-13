package com.software.florence.entity;

import com.software.florence.common.pattern.application.model.AbstractEntity;

import javax.persistence.*;

@Entity(name = "PROCESSO_DOACAO_SITUACAO_CLINICA")
public class ProcessoDoacaoSituacaoClinica extends AbstractEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", unique = true)
    private Long oid;

    @Column(unique = true)
    private Long situacaoClinicaId;

    @Column
    private Long processoDoacaoId;

    @Override
    public Long getOid() {
        return oid;
    }

    @Override
    public void setOid(Long oid) {
        this.oid = oid;
    }

    public Long getSituacaoClinicaId() {
        return situacaoClinicaId;
    }

    public void setSituacaoClinicaId(Long situacaoClinicaId) {
        this.situacaoClinicaId = situacaoClinicaId;
    }

    public Long getProcessoDoacaoId() {
        return processoDoacaoId;
    }

    public void setProcessoDoacaoId(Long processoDoacaoId) {
        this.processoDoacaoId = processoDoacaoId;
    }
}
