package com.software.florence.entity;

import com.software.florence.common.pattern.application.model.AbstractEntity;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "HLA")
public class Hla extends AbstractEntity<Long>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long oid;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_INICIO")
    private Date dataInicio;

    @Temporal(TemporalType.TIME)
    @Column(name = "HORA_INICIO")
    private Date horaInicio;

    @Temporal(TemporalType.TIME)
    @Column(name = "HORA_TERMINO")
    private Date horaTermino;

    @Column(name = "LABORATORIO")
    private String laboratorio;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CROSS_HCPA_DATA_HORA_INICIO")
    private Date crossHcpaDataHoraInicio;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "HCPA_DATA_HORA_FIM")
    private Date hcpaDataHoraFim;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CROSS_ISCMPA_DATA_HORA_INICIO")
    private Date crossIscmpaDataHoraInicio;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "ISCMPA_DATA_HORA_FIM")
    private Date iscmpaDataHoraFim;

    public Long getOid() {
        return oid;
    }

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

    public Date getCrossHcpaDataHoraInicio() {
        return crossHcpaDataHoraInicio;
    }

    public void setCrossHcpaDataHoraInicio(Date crossHcpaDataHoraInicio) {
        this.crossHcpaDataHoraInicio = crossHcpaDataHoraInicio;
    }

    public Date getHcpaDataHoraFim() {
        return hcpaDataHoraFim;
    }

    public void setHcpaDataHoraFim(Date hcpaDataHoraFim) {
        this.hcpaDataHoraFim = hcpaDataHoraFim;
    }

    public Date getCrossIscmpaDataHoraInicio() {
        return crossIscmpaDataHoraInicio;
    }

    public void setCrossIscmpaDataHoraInicio(Date crossIscmpaDataHoraInicio) {
        this.crossIscmpaDataHoraInicio = crossIscmpaDataHoraInicio;
    }

    public Date getIscmpaDataHoraFim() {
        return iscmpaDataHoraFim;
    }

    public void setIscmpaDataHoraFim(Date iscmpaDataHoraFim) {
        this.iscmpaDataHoraFim = iscmpaDataHoraFim;
    }
}
