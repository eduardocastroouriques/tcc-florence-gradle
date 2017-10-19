package com.software.florence.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.software.florence.common.pattern.application.model.AbstractEntity;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "TESTE_CLINICO")
public class TesteClinico extends AbstractEntity<Long>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long oid;

    @Column(name = "NUMERO_TESTE")
    private int numeroTeste;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_TESTE_CLINICO")
    private Date dataTesteClinico;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm:ss")
    @Temporal(TemporalType.TIME)
    @Column(name = "HORA_TESTE_CLINICO")
    private Date horaTesteClinico;

    @Column(name = "MEDICO")
    private String medico;

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

    public int getNumeroTeste() {
        return numeroTeste;
    }

    public void setNumeroTeste(int numeroTeste) {
        this.numeroTeste = numeroTeste;
    }

    public Date getDataTesteClinico() {
        return dataTesteClinico;
    }

    public void setDataTesteClinico(Date dataTesteClinico) {
        this.dataTesteClinico = dataTesteClinico;
    }

    public Date getHoraTesteClinico() {
        return horaTesteClinico;
    }

    public void setHoraTesteClinico(Date horaTesteClinico) {
        this.horaTesteClinico = horaTesteClinico;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public ProcessoDoacao getProcessoDoacao() {
        return processoDoacao;
    }

    public void setProcessoDoacao(ProcessoDoacao processoDoacao) {
        this.processoDoacao = processoDoacao;
    }
}
