package com.software.florence.entity;

import com.software.florence.common.pattern.application.model.AbstractEntity;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "ENTREVISTA_FAMILIAR")
public class EntrevistaFamiliar extends AbstractEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long oid;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATA_HORA")
    private Date dataHora;

    @Column(name = "RESULTADO")
    private int resultado;

    @Column(name = "ENTREVISTADOR")
    private String entrevistador;

    @Column(name = "MOTIVO_NEGATIVA")
    private String motivoNegativa;

    @Column(name = "OBSERVACAO")
    private String observacao;

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

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public String getEntrevistador() {
        return entrevistador;
    }

    public void setEntrevistador(String entrevistador) {
        this.entrevistador = entrevistador;
    }

    public String getMotivoNegativa() {
        return motivoNegativa;
    }

    public void setMotivoNegativa(String motivoNegativa) {
        this.motivoNegativa = motivoNegativa;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
