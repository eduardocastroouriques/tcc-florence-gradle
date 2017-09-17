package com.software.florence.entity;

import com.software.florence.common.pattern.application.model.AbstractEntity;

import javax.persistence.*;
import java.util.List;

@Entity(name = "CIRURGIA")
public class Cirurgia extends AbstractEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long oid;

    @Column(name = "MOTIVO_NAO_REMOCAO")
    private String motivoNaoRemocao;

    @Column(name = "DESTINO")
    private String destino;

    @Column(name = "MOTIVO_NAO_IMPLANTE")
    private String motivoNaoImplante;

    @OneToOne
    @JoinColumn(name = "INFORMACAO_CIRURGIA_ID", unique = true)
    private InformacaoCirurgia informacaoCirurgia;

    @OneToMany
    @JoinColumn(name = "CIR_FK_ORG")
    private List<Orgao> orgao;

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

    public String getMotivoNaoRemocao() {
        return motivoNaoRemocao;
    }

    public void setMotivoNaoRemocao(String motivoNaoRemocao) {
        this.motivoNaoRemocao = motivoNaoRemocao;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getMotivoNaoImplante() {
        return motivoNaoImplante;
    }

    public void setMotivoNaoImplante(String motivoNaoImplante) {
        this.motivoNaoImplante = motivoNaoImplante;
    }

    public InformacaoCirurgia getInformacaoCirurgia() {
        return informacaoCirurgia;
    }

    public void setInformacaoCirurgia(InformacaoCirurgia informacaoCirurgia) {
        this.informacaoCirurgia = informacaoCirurgia;
    }

    public List<Orgao> getOrgao() {
        return orgao;
    }

    public void setOrgao(List<Orgao> orgao) {
        this.orgao = orgao;
    }

    public ProcessoDoacao getProcessoDoacao() {
        return processoDoacao;
    }

    public void setProcessoDoacao(ProcessoDoacao processoDoacao) {
        this.processoDoacao = processoDoacao;
    }
}
