package com.software.florence.entity;

import com.software.florence.common.pattern.application.model.AbstractEntity;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "DOENCA_PREVIA")
public class DoencaPrevia extends AbstractEntity<Long>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long oid;

    @Column(name = "HAS")
    private String has;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "HAS_DESDE")
    private Date hasDesde;

    @Column(name = "DM")
    private String dm;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DM_DESDE")
    private Date dmdesde;

    @Column(name = "IRC")
    private String irc;

    @Column(name = "DPOC")
    private String dpoc;

    @Column(name = "HAPETITE")
    private char hepatite;

    @Column(name = "HIV")
    private char HIV;

    @Column(name = "IAM")
    private String IAM;

    @Column(name = "DOENCA_SNC")
    private String doencaSnc;

    @Column(name = "DOENCA_OCULAR")
    private String doencaOcular;

    @Column(name = "ASMA")
    private String asma;

    @Column(name = "TUBERCULOSE")
    private String tuberculose;

    @Column(name = "TUBERCULOSE_TTO")
    private String tuberculoseTTO;

    @Column(name = "CIRURGIA_PREVIA")
    private String cirurgiaPrevia;

    @Column(name = "NEOPLASIA")
    private String neoplasia;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATA_DIAGN")
    private Date dataDiagn;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATA_CURA")
    private Date dataCura;

    @Column(name = "AP")
    private String ap;

    @Column(name = "APTTO")
    private String APTTO;

    @Column(name = "QUIMIO")
    private String quimio;

    @Column(name = "RADIO")
    private String radio;

    @Column(name = "DVP")
    private String DVP;

    @Column(name = "OUTRAS_DOENCAS")
    private String outrasDoencas;

    @Column(name = "TRANFUSAO")
    private String transfusao;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATA_TRANSFUSAO")
    private Date dataTransfusao;

    @Column(name = "VACINAS_RECENTES")
    private String vacinasRecentes;

    @Column(name = "SISTEMA_PRISIONAL")
    private String sistemaPrisional;

    @Column(name = "SISTEMA_PRISIONAL_QDO")
    private String sistemaPrisionalQDO;

    @Column(name = "PIERCING")
    private String piercing;

    @Column(name = "TATUAGEM")
    private String tatuagem;

    @Column(name = "MAQUIAGEM_DEFINITIVA")
    private String maquiagemDefinitiva;

    @Column(name = "HOMOSSEXUALISMO")
    private String homossexualismo;

    @Column(name = "INFORMANTE_NOME")
    private String informanteNome;

    @Column(name = "INFORMANTE_PARENTESCO")
    private String informanteParentesco;

    @ManyToOne
    private ProcessoDoacao processoDoacao;

    @Override
    public Long getOid() {
        return oid;
    }

    @Override
    public void setOid(Long oid) {
        this.oid = oid;
    }

    public String getHas() {
        return has;
    }

    public void setHas(String has) {
        this.has = has;
    }

    public Date getHasDesde() {
        return hasDesde;
    }

    public void setHasDesde(Date hasDesde) {
        this.hasDesde = hasDesde;
    }

    public String getDm() {
        return dm;
    }

    public void setDm(String dm) {
        this.dm = dm;
    }

    public Date getDmdesde() {
        return dmdesde;
    }

    public void setDmdesde(Date dmdesde) {
        this.dmdesde = dmdesde;
    }

    public String getIrc() {
        return irc;
    }

    public void setIrc(String irc) {
        this.irc = irc;
    }

    public String getDpoc() {
        return dpoc;
    }

    public void setDpoc(String dpoc) {
        this.dpoc = dpoc;
    }

    public char getHepatite() {
        return hepatite;
    }

    public void setHepatite(char hepatite) {
        this.hepatite = hepatite;
    }

    public char getHIV() {
        return HIV;
    }

    public void setHIV(char HIV) {
        this.HIV = HIV;
    }

    public String getIAM() {
        return IAM;
    }

    public void setIAM(String IAM) {
        this.IAM = IAM;
    }

    public String getDoencaSnc() {
        return doencaSnc;
    }

    public void setDoencaSnc(String doencaSnc) {
        this.doencaSnc = doencaSnc;
    }

    public String getDoencaOcular() {
        return doencaOcular;
    }

    public void setDoencaOcular(String doencaOcular) {
        this.doencaOcular = doencaOcular;
    }

    public String getAsma() {
        return asma;
    }

    public void setAsma(String asma) {
        this.asma = asma;
    }

    public String getTuberculose() {
        return tuberculose;
    }

    public void setTuberculose(String tuberculose) {
        this.tuberculose = tuberculose;
    }

    public String getTuberculoseTTO() {
        return tuberculoseTTO;
    }

    public void setTuberculoseTTO(String tuberculoseTTO) {
        this.tuberculoseTTO = tuberculoseTTO;
    }

    public String getCirurgiaPrevia() {
        return cirurgiaPrevia;
    }

    public void setCirurgiaPrevia(String cirurgiaPrevia) {
        this.cirurgiaPrevia = cirurgiaPrevia;
    }

    public String getNeoplasia() {
        return neoplasia;
    }

    public void setNeoplasia(String neoplasia) {
        this.neoplasia = neoplasia;
    }

    public Date getDataDiagn() {
        return dataDiagn;
    }

    public void setDataDiagn(Date dataDiagn) {
        this.dataDiagn = dataDiagn;
    }

    public Date getDataCura() {
        return dataCura;
    }

    public void setDataCura(Date dataCura) {
        this.dataCura = dataCura;
    }

    public String getAp() {
        return ap;
    }

    public void setAp(String ap) {
        this.ap = ap;
    }

    public String getAPTTO() {
        return APTTO;
    }

    public void setAPTTO(String APTTO) {
        this.APTTO = APTTO;
    }

    public String getQuimio() {
        return quimio;
    }

    public void setQuimio(String quimio) {
        this.quimio = quimio;
    }

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    public String getDVP() {
        return DVP;
    }

    public void setDVP(String DVP) {
        this.DVP = DVP;
    }

    public String getOutrasDoencas() {
        return outrasDoencas;
    }

    public void setOutrasDoencas(String outrasDoencas) {
        this.outrasDoencas = outrasDoencas;
    }

    public String getTransfusao() {
        return transfusao;
    }

    public void setTransfusao(String transfusao) {
        this.transfusao = transfusao;
    }

    public Date getDataTransfusao() {
        return dataTransfusao;
    }

    public void setDataTransfusao(Date dataTransfusao) {
        this.dataTransfusao = dataTransfusao;
    }

    public String getVacinasRecentes() {
        return vacinasRecentes;
    }

    public void setVacinasRecentes(String vacinasRecentes) {
        this.vacinasRecentes = vacinasRecentes;
    }

    public String getSistemaPrisional() {
        return sistemaPrisional;
    }

    public void setSistemaPrisional(String sistemaPrisional) {
        this.sistemaPrisional = sistemaPrisional;
    }

    public String getSistemaPrisionalQDO() {
        return sistemaPrisionalQDO;
    }

    public void setSistemaPrisionalQDO(String sistemaPrisionalQDO) {
        this.sistemaPrisionalQDO = sistemaPrisionalQDO;
    }

    public String getPiercing() {
        return piercing;
    }

    public void setPiercing(String piercing) {
        this.piercing = piercing;
    }

    public String getTatuagem() {
        return tatuagem;
    }

    public void setTatuagem(String tatuagem) {
        this.tatuagem = tatuagem;
    }

    public String getMaquiagemDefinitiva() {
        return maquiagemDefinitiva;
    }

    public void setMaquiagemDefinitiva(String maquiagemDefinitiva) {
        this.maquiagemDefinitiva = maquiagemDefinitiva;
    }

    public String getHomossexualismo() {
        return homossexualismo;
    }

    public void setHomossexualismo(String homossexualismo) {
        this.homossexualismo = homossexualismo;
    }

    public String getInformanteNome() {
        return informanteNome;
    }

    public void setInformanteNome(String informanteNome) {
        this.informanteNome = informanteNome;
    }

    public String getInformanteParentesco() {
        return informanteParentesco;
    }

    public void setInformanteParentesco(String informanteParentesco) {
        this.informanteParentesco = informanteParentesco;
    }

    public ProcessoDoacao getProcessoDoacao() {
        return processoDoacao;
    }

    public void setProcessoDoacao(ProcessoDoacao processoDoacao) {
        this.processoDoacao = processoDoacao;
    }
}
