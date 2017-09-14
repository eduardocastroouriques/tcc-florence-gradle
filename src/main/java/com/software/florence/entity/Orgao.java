package com.software.florence.entity;

import com.software.florence.common.pattern.application.model.AbstractEntity;

import javax.persistence.*;
import java.util.List;

@Entity(name = "ORGAO")
public class Orgao extends AbstractEntity<Long> {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long oid;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "MOTIVO_NAO_REMOCAO")
    private String motivoNaoRemocao;

    @Column(name = "DESTINO")
    private String destino;

    @Column(name = "MOTIVO_NAO_IMPLANTE")
    private String motivoNaoImplante;

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
}
