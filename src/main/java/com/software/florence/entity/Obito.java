package com.software.florence.entity;

import com.software.florence.common.pattern.application.model.AbstractEntity;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "OBITO")
public class Obito extends AbstractEntity<Long>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long oid;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATA_HORA")
    private Date dataHora;

    @Column(name = "TIPO")
    private int tipo;

    @OneToOne
    @JoinColumn(nullable = false, unique = true)
    private ProcessoDoacao processoDoacao;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public ProcessoDoacao getProcessoDoacao() {
        return processoDoacao;
    }

    public void setProcessoDoacao(ProcessoDoacao processoDoacao) {
        this.processoDoacao = processoDoacao;
    }
}
