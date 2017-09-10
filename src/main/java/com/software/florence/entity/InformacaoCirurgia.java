package com.software.florence.entity;

import com.software.florence.common.pattern.application.model.AbstractEntity;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "INFORMACAO_CIRURGIA")
public class InformacaoCirurgia extends AbstractEntity<Long>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long oid;

    @Temporal(TemporalType.TIME)
    @Column(name = "HORARIO_PREVISTO")
    private Date horarioPrevisto;

    @Temporal(TemporalType.TIME)
    @Column(name = "HORARIO_INICIO")
    private Date horarioInicio;

    @Temporal(TemporalType.TIME)
    @Column(name = "HORARIO_FIM")
    private Date horarioFim;

    @Column(name = "LOCAL_DA_RETIRADA")
    private String localDaRetirada;

    @Temporal(TemporalType.TIME)
    @Column(name = "DML_INICIO")
    private Date dmlInicio;

    @Temporal(TemporalType.TIME)
    @Column(name = "DML_FIM")
    private Date dmlFim;

    @Column(name = "OBSERVACAO")
    private String observacao;

    @OneToOne(cascade = CascadeType.ALL)
    private Cirurgia cirurgia;

    @Override
    public Long getOid() {
        return oid;
    }

    @Override
    public void setOid(Long oid) {
        this.oid = oid;
    }

    public Date getHorarioPrevisto() {
        return horarioPrevisto;
    }

    public void setHorarioPrevisto(Date horarioPrevisto) {
        this.horarioPrevisto = horarioPrevisto;
    }

    public Date getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(Date horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public Date getHorarioFim() {
        return horarioFim;
    }

    public void setHorarioFim(Date horarioFim) {
        this.horarioFim = horarioFim;
    }

    public String getLocalDaRetirada() {
        return localDaRetirada;
    }

    public void setLocalDaRetirada(String localDaRetirada) {
        this.localDaRetirada = localDaRetirada;
    }

    public Date getDmlInicio() {
        return dmlInicio;
    }

    public void setDmlInicio(Date dmlInicio) {
        this.dmlInicio = dmlInicio;
    }

    public Date getDmlFim() {
        return dmlFim;
    }

    public void setDmlFim(Date dmlFim) {
        this.dmlFim = dmlFim;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Cirurgia getCirurgia() {
        return cirurgia;
    }

    public void setCirurgia(Cirurgia cirurgia) {
        this.cirurgia = cirurgia;
    }
}
