package com.software.florence.entity;

import com.software.florence.common.pattern.application.model.AbstractEntity;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "APROVACAO")
public class Aprovacao extends AbstractEntity<Long>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long oid;

    @Column(name = "TIPO")
    private int tipo;

    @Column(name = "DATA_HORA")
    private Date dataHora;

    @Column(name = "HEMOGLOBINA")
    private double hemoglobina;

    @Column(name = "HEMATOCRITO")
    private double hematocrito;

    @Column(name = "LEUCOCITOS")
    private double leucocitos;

    @Column(name = "BASTOES")
    private double bastoes;

    @Column(name = "PLAQUETAS")
    private double plaquetas;

    @Column(name = "UREIAS")
    private double ureia;

    @Column(name = "CREATININA")
    private double creatinina;

    @Column(name = "SODIO")
    private double sodio;

    @Column(name = "POTASSIO")
    private double potassio;

    @Column(name = "GLICEMIA")
    private double glicemia;

    @Column(name = "CPK")
    private double cpk;

    @Column(name = "CKMB")
    private double ckmb;

    @Column(name = "AMILASE")
    private double amilase;

    @Column(name = "TGO")
    private double tgo;

    @Column(name = "TGP")
    private double tgp;

    @Column(name = "FOS_ALCALINA")
    private double fosfAlcalina;

    @Column(name = "GAMA_GT")
    private double gamaGt;

    @Column(name = "BIL_TOTAL")
    private double bilTotal;

    @Column(name = "BIL_DIRETA")
    private double bilDireta;

    @Column(name = "TP")
    private double tp;

    @Column(name = "KTTP")
    private double kttp;

    @Column(name = "PH")
    private double ph;

    @Column(name = "PO_2")
    private double po2;

    @Column(name = "CO_2")
    private double co2;

    @Column(name = "SAT")
    private double sat;

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

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public double getHemoglobina() {
        return hemoglobina;
    }

    public void setHemoglobina(double hemoglobina) {
        this.hemoglobina = hemoglobina;
    }

    public double getHematocrito() {
        return hematocrito;
    }

    public void setHematocrito(double hematocrito) {
        this.hematocrito = hematocrito;
    }

    public double getLeucocitos() {
        return leucocitos;
    }

    public void setLeucocitos(double leucocitos) {
        this.leucocitos = leucocitos;
    }

    public double getBastoes() {
        return bastoes;
    }

    public void setBastoes(double bastoes) {
        this.bastoes = bastoes;
    }

    public double getPlaquetas() {
        return plaquetas;
    }

    public void setPlaquetas(double plaquetas) {
        this.plaquetas = plaquetas;
    }

    public double getUreia() {
        return ureia;
    }

    public void setUreia(double ureia) {
        this.ureia = ureia;
    }

    public double getCreatinina() {
        return creatinina;
    }

    public void setCreatinina(double creatinina) {
        this.creatinina = creatinina;
    }

    public double getSodio() {
        return sodio;
    }

    public void setSodio(double sodio) {
        this.sodio = sodio;
    }

    public double getPotassio() {
        return potassio;
    }

    public void setPotassio(double potassio) {
        this.potassio = potassio;
    }

    public double getGlicemia() {
        return glicemia;
    }

    public void setGlicemia(double glicemia) {
        this.glicemia = glicemia;
    }

    public double getCpk() {
        return cpk;
    }

    public void setCpk(double cpk) {
        this.cpk = cpk;
    }

    public double getCkmb() {
        return ckmb;
    }

    public void setCkmb(double ckmb) {
        this.ckmb = ckmb;
    }

    public double getAmilase() {
        return amilase;
    }

    public void setAmilase(double amilase) {
        this.amilase = amilase;
    }

    public double getTgo() {
        return tgo;
    }

    public void setTgo(double tgo) {
        this.tgo = tgo;
    }

    public double getTgp() {
        return tgp;
    }

    public void setTgp(double tgp) {
        this.tgp = tgp;
    }

    public double getFosfAlcalina() {
        return fosfAlcalina;
    }

    public void setFosfAlcalina(double fosfAlcalina) {
        this.fosfAlcalina = fosfAlcalina;
    }

    public double getGamaGt() {
        return gamaGt;
    }

    public void setGamaGt(double gamaGt) {
        this.gamaGt = gamaGt;
    }

    public double getBilTotal() {
        return bilTotal;
    }

    public void setBilTotal(double bilTotal) {
        this.bilTotal = bilTotal;
    }

    public double getBilDireta() {
        return bilDireta;
    }

    public void setBilDireta(double bilDireta) {
        this.bilDireta = bilDireta;
    }

    public double getTp() {
        return tp;
    }

    public void setTp(double tp) {
        this.tp = tp;
    }

    public double getKttp() {
        return kttp;
    }

    public void setKttp(double kttp) {
        this.kttp = kttp;
    }

    public double getPh() {
        return ph;
    }

    public void setPh(double ph) {
        this.ph = ph;
    }

    public double getPo2() {
        return po2;
    }

    public void setPo2(double po2) {
        this.po2 = po2;
    }

    public double getCo2() {
        return co2;
    }

    public void setCo2(double co2) {
        this.co2 = co2;
    }

    public double getSat() {
        return sat;
    }

    public void setSat(double sat) {
        this.sat = sat;
    }
}
