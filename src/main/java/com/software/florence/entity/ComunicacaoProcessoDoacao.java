package com.software.florence.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.software.florence.common.pattern.application.model.AbstractEntity;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "COMUNICACAO_PROCESSO_DOACAO")
public class ComunicacaoProcessoDoacao extends AbstractEntity<Long>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long oid;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_COMUNICACAO")
    private Date dataComunicacao;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm:ss")
    @Temporal(TemporalType.TIME)
    @Column(name = "HORA_COMUNICACAO")
    private Date horaComunicacao;

    @Column(name = "RGCT")
    private String rgct;

    @OneToOne
    @JoinColumn(unique = true, nullable = false)
    private ProcessoDoacao processoDoacao;

    @Override
    public Long getOid() {
        return oid;
    }

    @Override
    public void setOid(Long oid) {
        this.oid = oid;
    }

    public Date getDataComunicacao() {
        return dataComunicacao;
    }

    public void setDataComunicacao(Date dataComunicacao) {
        this.dataComunicacao = dataComunicacao;
    }

    public Date getHoraComunicacao() {
        return horaComunicacao;
    }

    public void setHoraComunicacao(Date horaComunicacao) {
        this.horaComunicacao = horaComunicacao;
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
