package com.software.florence.entity;

import com.software.florence.common.pattern.application.model.AbstractEntity;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "SOROLOGIA")
public class Sorologia extends AbstractEntity<Long>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long oid;

    @Temporal(TemporalType.TIME)
    @Column(name = "HORA_INICIO")
    private Date horaInicio;

    @Temporal(TemporalType.TIME)
    @Column(name = "HORA_RESULTADO")
    private Date horaResultado;

    @Column(name = "LOCAL")
    private String local;

    @Column(name = "ANTI_HIV")
    private String antiHIV;

    @Column(name = "HBS_AG")
    private String hbsAg;

    @Column(name = "HTLV_PRIMEIRO")
    private String htlvPrimeiro;

    @Column(name = "HTLV_SEGUNDO")
    private String htlvSegundo;

    @Column(name = "ANTI_HBC")
    private String antiHbc;

    @Column(name = "ANTI_HCV")
    private String antiHcv;

    @Column(name = "ANTI_HBS")
    private String antiHbs;

    @Column(name = "TOXO_IGG")
    private String toxoIgg;

    @Column(name = "CHAGAS")
    private String chagas;

    @Column(name = "CMV_IGC")
    private String cmvIgc;

    @Column(name = "TOXO_IGM")
    private String toxoIgm;

    @Column(name = "LUES")
    private String lues;

    @Column(name = "CMVIGM")
    private String cmvim;

    @Column(name = "HEMODILUICAO")
    private String hemodiluicao;

    @Column(name = "CALCULO")
    private Double calculo;

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

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraResultado() {
        return horaResultado;
    }

    public void setHoraResultado(Date horaResultado) {
        this.horaResultado = horaResultado;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getAntiHIV() {
        return antiHIV;
    }

    public void setAntiHIV(String antiHIV) {
        this.antiHIV = antiHIV;
    }

    public String getHbsAg() {
        return hbsAg;
    }

    public void setHbsAg(String hbsAg) {
        this.hbsAg = hbsAg;
    }

    public String getHtlvPrimeiro() {
        return htlvPrimeiro;
    }

    public void setHtlvPrimeiro(String htlvPrimeiro) {
        this.htlvPrimeiro = htlvPrimeiro;
    }

    public String getHtlvSegundo() {
        return htlvSegundo;
    }

    public void setHtlvSegundo(String htlvSegundo) {
        this.htlvSegundo = htlvSegundo;
    }

    public String getAntiHbc() {
        return antiHbc;
    }

    public void setAntiHbc(String antiHbc) {
        this.antiHbc = antiHbc;
    }

    public String getAntiHcv() {
        return antiHcv;
    }

    public void setAntiHcv(String antiHcv) {
        this.antiHcv = antiHcv;
    }

    public String getAntiHbs() {
        return antiHbs;
    }

    public void setAntiHbs(String antiHbs) {
        this.antiHbs = antiHbs;
    }

    public String getToxoIgg() {
        return toxoIgg;
    }

    public void setToxoIgg(String toxoIgg) {
        this.toxoIgg = toxoIgg;
    }

    public String getChagas() {
        return chagas;
    }

    public void setChagas(String chagas) {
        this.chagas = chagas;
    }

    public String getCmvIgc() {
        return cmvIgc;
    }

    public void setCmvIgc(String cmvIgc) {
        this.cmvIgc = cmvIgc;
    }

    public String getToxoIgm() {
        return toxoIgm;
    }

    public void setToxoIgm(String toxoIgm) {
        this.toxoIgm = toxoIgm;
    }

    public String getLues() {
        return lues;
    }

    public void setLues(String lues) {
        this.lues = lues;
    }

    public String getCmvim() {
        return cmvim;
    }

    public void setCmvim(String cmvim) {
        this.cmvim = cmvim;
    }

    public String getHemodiluicao() {
        return hemodiluicao;
    }

    public void setHemodiluicao(String hemodiluicao) {
        this.hemodiluicao = hemodiluicao;
    }

    public Double getCalculo() {
        return calculo;
    }

    public void setCalculo(Double calculo) {
        this.calculo = calculo;
    }

    public ProcessoDoacao getProcessoDoacao() {
        return processoDoacao;
    }

    public void setProcessoDoacao(ProcessoDoacao processoDoacao) {
        this.processoDoacao = processoDoacao;
    }
}
