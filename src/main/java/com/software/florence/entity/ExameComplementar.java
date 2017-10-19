package com.software.florence.entity;

import com.software.florence.common.pattern.application.model.AbstractEntity;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "EXAME_COMPLEMENTAR")
public class ExameComplementar extends AbstractEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long oid;

    @Column(name = "TIPO")
    private int tipo;

    @Column(name = "TIPO_OUTRO")
    private String tipoOutro;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_EXAME")
    private Date dataExame;

    @Temporal(TemporalType.TIME)
    @Column(name = "HORA_EXAME")
    private Date horaExame;

    @Column(name = "RESULTADO")
    private String resultado;

    @Column(name = "MEDICO")
    private String medico;

    @ManyToOne(fetch=FetchType.EAGER)
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

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getTipoOutro() {
        return tipoOutro;
    }

    public void setTipoOutro(String tipoOutro) {
        this.tipoOutro = tipoOutro;
    }

    public Date getDataExame() {
        return dataExame;
    }

    public void setDataExame(Date dataExame) {
        this.dataExame = dataExame;
    }

    public Date getHoraExame() {
        return horaExame;
    }

    public void setHoraExame(Date horaExame) {
        this.horaExame = horaExame;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
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
