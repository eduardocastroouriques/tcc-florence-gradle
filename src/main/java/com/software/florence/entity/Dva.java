package com.software.florence.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.software.florence.common.pattern.application.model.AbstractEntity;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "DVA")
public class Dva extends AbstractEntity<Long>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long oid;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "AMP")
    private String amp;

    @Column(name = "ML_POR_HORA")
    private float mlPorHora;

    @Column(name = "KG")
    private double kg;

    @Column(name = "DOSE_MAXIMA_ML_POR_HORA")
    private String doseMaximaMlPorHora;

    @Column(name = "DOSE_MAXIMA_KG")
    private String doseMaximaKg;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm:ss")
    @Temporal(TemporalType.TIME)
    @Column(name = "INICIO")
    private Date inicio;

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAmp() {
        return amp;
    }

    public void setAmp(String amp) {
        this.amp = amp;
    }

    public float getMlPorHora() {
        return mlPorHora;
    }

    public void setMlPorHora(float mlPorHora) {
        this.mlPorHora = mlPorHora;
    }

    public double getKg() {
        return kg;
    }

    public void setKg(double kg) {
        this.kg = kg;
    }

    public String getDoseMaximaMlPorHora() {
        return doseMaximaMlPorHora;
    }

    public void setDoseMaximaMlPorHora(String doseMaximaMlPorHora) {
        this.doseMaximaMlPorHora = doseMaximaMlPorHora;
    }

    public String getDoseMaximaKg() {
        return doseMaximaKg;
    }

    public void setDoseMaximaKg(String doseMaximaKg) {
        this.doseMaximaKg = doseMaximaKg;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public ProcessoDoacao getProcessoDoacao() {
        return processoDoacao;
    }

    public void setProcessoDoacao(ProcessoDoacao processoDoacao) {
        this.processoDoacao = processoDoacao;
    }
}
