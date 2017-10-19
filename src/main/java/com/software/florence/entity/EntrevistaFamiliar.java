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

    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_ENTREVISTA")
    private Date dataEntrevista;

    @Temporal(TemporalType.TIME)
    @Column(name = "HORA_ENTREVISTA")
    private Date horaEntrevista;

    @Column(name = "RESULTADO")
    private int resultado;

    @Column(name = "ENTREVISTADOR")
    private String entrevistador;

    @Column(name = "MOTIVO_NEGATIVA")
    private String motivoNegativa;

    @Column(name = "OBSERVACAO")
    private String observacao;

    @OneToOne
    @JoinColumn(name = "PROCESSO_DOACAO_ID", unique = true, nullable = false)
    private ProcessoDoacao processoDoacao;

    @Override
    public Long getOid() {
        return oid;
    }

    @Override
    public void setOid(Long oid) {
        this.oid = oid;
    }

    public Date getDataEntrevista() {
        return dataEntrevista;
    }

    public void setDataEntrevista(Date dataEntrevista) {
        this.dataEntrevista = dataEntrevista;
    }

    public Date getHoraEntrevista() {
        return horaEntrevista;
    }

    public void setHoraEntrevista(Date horaEntrevista) {
        this.horaEntrevista = horaEntrevista;
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

    public ProcessoDoacao getProcessoDoacao() {
        return processoDoacao;
    }

    public void setProcessoDoacao(ProcessoDoacao processoDoacao) {
        this.processoDoacao = processoDoacao;
    }
}
