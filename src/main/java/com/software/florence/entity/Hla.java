package com.software.florence.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.software.florence.common.pattern.application.model.AbstractEntity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name = "HLA")
public class Hla extends AbstractEntity<Long>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long oid;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_INICIO")
    private Date dataInicio;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm:ss")
    @Temporal(TemporalType.TIME)
    @Column(name = "HORA_INICIO")
    private Date horaInicio;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm:ss")
    @Temporal(TemporalType.TIME)
    @Column(name = "HORA_TERMINO")
    private Date horaTermino;

    @Column(name = "LABORATORIO")
    private String laboratorio;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    @Column(name = "CROSS_HCPA_DATA_INICIO")
    private Date crossHcpaDataInicio;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm:ss")
    @Temporal(TemporalType.TIME)
    @Column(name = "CROSS_HCPA_HORA_INICIO")
    private Date crossHcpaHoraInicio;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    @Column(name = "CROSS_HCPA_DATA_FIM")
    private Date crossHcpaDataFim;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm:ss")
    @Temporal(TemporalType.TIME)
    @Column(name = "CROSS_HCPA_HORA_FIM")
    private Date crossHcpaHoraFim;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    @Column(name = "CROSS_ISCMPA_DATA_INICIO")
    private Date crossIscmpaDataInicio;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm:ss")
    @Temporal(TemporalType.TIME)
    @Column(name = "CROSS_ISCMPA_HORA_INICIO")
    private Date crossIscmpaHoraInicio;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    @Column(name = "CROSS_ISCMPA_DATA_FIM")
    private Date crossIscmpaDataFim;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm:ss")
    @Temporal(TemporalType.TIME)
    @Column(name = "CROSS_ISCMPA_HORA_FIM")
    private Date crossIscmpaHoraFim;

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

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraTermino() {
        return horaTermino;
    }

    public void setHoraTermino(Date horaTermino) {
        this.horaTermino = horaTermino;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public Date getCrossHcpaDataInicio() {
        return crossHcpaDataInicio;
    }

    public void setCrossHcpaDataInicio(Date crossHcpaDataInicio) {
        this.crossHcpaDataInicio = crossHcpaDataInicio;
    }

    public Date getCrossHcpaHoraInicio() {
        return crossHcpaHoraInicio;
    }

    public void setCrossHcpaHoraInicio(Date crossHcpaHoraInicio) {
        this.crossHcpaHoraInicio = crossHcpaHoraInicio;
    }

    public Date getCrossHcpaDataFim() {
        return crossHcpaDataFim;
    }

    public void setCrossHcpaDataFim(Date crossHcpaDataFim) {
        this.crossHcpaDataFim = crossHcpaDataFim;
    }

    public Date getCrossHcpaHoraFim() {
        return crossHcpaHoraFim;
    }

    public void setCrossHcpaHoraFim(Date crossHcpaHoraFim) {
        this.crossHcpaHoraFim = crossHcpaHoraFim;
    }

    public Date getCrossIscmpaDataInicio() {
        return crossIscmpaDataInicio;
    }

    public void setCrossIscmpaDataInicio(Date crossIscmpaDataInicio) {
        this.crossIscmpaDataInicio = crossIscmpaDataInicio;
    }

    public Date getCrossIscmpaHoraInicio() {
        return crossIscmpaHoraInicio;
    }

    public void setCrossIscmpaHoraInicio(Date crossIscmpaHoraInicio) {
        this.crossIscmpaHoraInicio = crossIscmpaHoraInicio;
    }

    public Date getCrossIscmpaDataFim() {
        return crossIscmpaDataFim;
    }

    public void setCrossIscmpaDataFim(Date crossIscmpaDataFim) {
        this.crossIscmpaDataFim = crossIscmpaDataFim;
    }

    public Date getCrossIscmpaHoraFim() {
        return crossIscmpaHoraFim;
    }

    public void setCrossIscmpaHoraFim(Date crossIscmpaHoraFim) {
        this.crossIscmpaHoraFim = crossIscmpaHoraFim;
    }

    public ProcessoDoacao getProcessoDoacao() {
        return processoDoacao;
    }

    public void setProcessoDoacao(ProcessoDoacao processoDoacao) {
        this.processoDoacao = processoDoacao;
    }
}
