package com.software.florence.entity;

import com.software.florence.common.pattern.application.model.AbstractEntity;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "COMUNICACAO_PROCESSO_DOACAO")
public class ComunicacaoProcessoDoacao extends AbstractEntity<Long>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long oid;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATA_HORA")
    private Date dataHora;

    @Column(name = "RGCT")
    private String rgct;

    @OneToOne
    @JoinColumn(nullable = false, unique = true)
    private ProcessoDoacao processoDoacao;

    @Override
    public Long getOid() {
        return oid;
    }

    @Override
    public void setOid(Long oid) {
        this.oid = oid;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public String getRgct() {
        return rgct;
    }

    public void setRgct(String rgct) {
        this.rgct = rgct;
    }

    public ProcessoDoacao getProcessoDoacao() {
        return processoDoacao;
    }

    public void setProcessoDoacao(ProcessoDoacao processoDoacao) {
        this.processoDoacao = processoDoacao;
    }
}
