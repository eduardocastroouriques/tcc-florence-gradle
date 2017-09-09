package com.software.florence.entity;

import com.software.florence.common.pattern.application.model.AbstractEntity;

import javax.persistence.*;

@Entity(name = "EXAME_DOACAO")
public class ExameDoacao extends AbstractEntity<Long>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long oid;

    @Column(name = "RX")
    private String rx;

    @Column(name = "ECQ")
    private String ecg;

    @Column(name = "ECO_CARDIO")
    private String ecocardio;

    @Column(name = "TCE_CO_ABD")
    private String tceCoAbd;

    @Column(name = "GASO_PULMAO")
    private String gasoPulmao;

    @ManyToOne(cascade = CascadeType.ALL)
    private ProcessoDoacao processoDoacao;

    @Override
    public Long getOid() {
        return oid;
    }

    @Override
    public void setOid(Long oid) {
        this.oid = oid;
    }

    public String getRx() {
        return rx;
    }

    public void setRx(String rx) {
        this.rx = rx;
    }

    public String getEcg() {
        return ecg;
    }

    public void setEcg(String ecg) {
        this.ecg = ecg;
    }

    public String getEcocardio() {
        return ecocardio;
    }

    public void setEcocardio(String ecocardio) {
        this.ecocardio = ecocardio;
    }

    public String getTceCoAbd() {
        return tceCoAbd;
    }

    public void setTceCoAbd(String tceCoAbd) {
        this.tceCoAbd = tceCoAbd;
    }

    public String getGasoPulmao() {
        return gasoPulmao;
    }

    public void setGasoPulmao(String gasoPulmao) {
        this.gasoPulmao = gasoPulmao;
    }

    public ProcessoDoacao getProcessoDoacao() {
        return processoDoacao;
    }

    public void setProcessoDoacao(ProcessoDoacao processoDoacao) {
        this.processoDoacao = processoDoacao;
    }
}
