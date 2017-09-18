package com.software.florence.entity;

import com.software.florence.common.pattern.application.model.AbstractEntity;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "SITUACAO_CLINICA")
public class SituacaoClinica extends AbstractEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long oid;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATA_HORA")
    private Date dataHora;

    @Column(name = "TA")
    private String ta;

    @Column(name = "DIURESE")
    private String diurese;

    @Column(name = "SAT")
    private String sat;

    @Column(name = "PEEP")
    private String peep;

    @Column(name = "PINS")
    private String pins;

    @Column(name = "FR")
    private String fr;

    @Column(name = "FIO_DOIS")
    private String fioDois;

    @ManyToOne
    @JoinColumn
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

    public String getTa() {
        return ta;
    }

    public void setTa(String ta) {
        this.ta = ta;
    }

    public String getDiurese() {
        return diurese;
    }

    public void setDiurese(String diurese) {
        this.diurese = diurese;
    }

    public String getSat() {
        return sat;
    }

    public void setSat(String sat) {
        this.sat = sat;
    }

    public String getPeep() {
        return peep;
    }

    public void setPeep(String peep) {
        this.peep = peep;
    }

    public String getPins() {
        return pins;
    }

    public void setPins(String pins) {
        this.pins = pins;
    }

    public String getFr() {
        return fr;
    }

    public void setFr(String fr) {
        this.fr = fr;
    }

    public String getFioDois() {
        return fioDois;
    }

    public void setFioDois(String fioDois) {
        this.fioDois = fioDois;
    }

    public ProcessoDoacao getProcessoDoacao() {
        return processoDoacao;
    }

    public void setProcessoDoacao(ProcessoDoacao processoDoacao) {
        this.processoDoacao = processoDoacao;
    }
}
