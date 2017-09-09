package com.software.florence.entity;

import com.software.florence.common.pattern.application.model.AbstractEntity;

import javax.persistence.*;

@Entity(name = "SUBSTANCIA_EXTRA")
public class SubstanciaExtra extends AbstractEntity<Long>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long oid;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "RESULTADO")
    private String resultado;

    @Column(name = "TIPO_QUANTO")
    private String tipoQuanto;

    @Column(name = "TEMPO")
    private String tempo;

    @OneToOne
    @JoinColumn(name = "DOENCA_PREVIA_ID")
    private DoencaPrevia doencaPrevia;

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

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getTipoQuanto() {
        return tipoQuanto;
    }

    public void setTipoQuanto(String tipoQuanto) {
        this.tipoQuanto = tipoQuanto;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    public DoencaPrevia getDoencaPrevia() {
        return doencaPrevia;
    }

    public void setDoencaPrevia(DoencaPrevia doencaPrevia) {
        this.doencaPrevia = doencaPrevia;
    }

    @Override
    public String toString() {
        return "SubstanciaExtra{" +
                "oid=" + oid +
                ", nome='" + nome + '\'' +
                ", resultado='" + resultado + '\'' +
                ", tipoQuanto='" + tipoQuanto + '\'' +
                ", tempo='" + tempo + '\'' +
                ", doencaPrevia=" + doencaPrevia +
                '}';
    }
}
