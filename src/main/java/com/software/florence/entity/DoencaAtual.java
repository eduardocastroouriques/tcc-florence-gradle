package com.software.florence.entity;

import com.software.florence.common.pattern.application.model.AbstractEntity;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name = "DOENCA_ATUAL")
public class DoencaAtual extends AbstractEntity<Long>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long oid;

    @Column(name = "MEDICACAO_EM_USO")
    private String medicacaoEmUsoDesc;

    @Column(name = "TRAUMA_DE_TORAX")
    private String traumaDeTorax;

    @Column(name = "TRAUMA_DE_ABDOME")
    private String traumaDeAbdome;

    @Column(name = "CRANIOTOMIA", length = 1)
    private char craniotomia;

    @Column(name = "CHOQUE")
    private String choque;

    @Column(name = "VM_INICIO")
    private String vmInicio;

    @Column(name = "DDAVP")
    private String ddavp;

    @Column(name = "PCR", length = 1)
    private char pcr;

    @Column(name = "PCR_NUMERO")
    private int pcrNumero;

    @Column(name = "PCR_TEMPO_MAXIMO")
    private String pcrTempoMaximo;

    @Column(name = "IRA")
    private String ira;

    @Column(name = "DIALISE")
    private String dialise;

    @Column(name = "SECRECAO_TOT")
    private String secrecaoTot;

    @Column(name = "ASPECTO")
    private String aspecto;

    @Column(name = "DIURESE_ULTIMAS_VINTE_E_QUATRO_HORAS", length = 1)
    private char diureseUltimasVinteEQuatroHoras;

    @Column(name = "DIURESE_ULTIMAS_SEIS_HORAS", length = 1)
    private char diureseUltimasSeisHoras;

    @Column(name = "FEBRE")
    private String febre;

    @Column(name = "PRIMEIRA_CREATINA", length = 1)
    private char primeiraCreatinina;

    @Temporal(TemporalType.DATE)
    @Column(name = "PRIMEIRA_CREATININA_DATA")
    private Date primeiraCreatininaData;

    @Column(name = "OBSERVACAO")
    private String observacao;

    @OneToMany
    @JoinColumn(name = "DA_FK_INF")
    private List<Infeccao> infeccao;

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

    public String getMedicacaoEmUsoDesc() {
        return medicacaoEmUsoDesc;
    }

    public void setMedicacaoEmUsoDesc(String medicacaoEmUsoDesc) {
        this.medicacaoEmUsoDesc = medicacaoEmUsoDesc;
    }

    public String getTraumaDeTorax() {
        return traumaDeTorax;
    }

    public void setTraumaDeTorax(String traumaDeTorax) {
        this.traumaDeTorax = traumaDeTorax;
    }

    public String getTraumaDeAbdome() {
        return traumaDeAbdome;
    }

    public void setTraumaDeAbdome(String traumaDeAbdome) {
        this.traumaDeAbdome = traumaDeAbdome;
    }

    public char getCraniotomia() {
        return craniotomia;
    }

    public void setCraniotomia(char craniotomia) {
        this.craniotomia = craniotomia;
    }

    public String getChoque() {
        return choque;
    }

    public void setChoque(String choque) {
        this.choque = choque;
    }

    public String getVmInicio() {
        return vmInicio;
    }

    public void setVmInicio(String vmInicio) {
        this.vmInicio = vmInicio;
    }

    public String getDdavp() {
        return ddavp;
    }

    public void setDdavp(String ddavp) {
        this.ddavp = ddavp;
    }

    public char getPcr() {
        return pcr;
    }

    public void setPcr(char pcr) {
        this.pcr = pcr;
    }

    public int getPcrNumero() {
        return pcrNumero;
    }

    public void setPcrNumero(int pcrNumero) {
        this.pcrNumero = pcrNumero;
    }

    public String getPcrTempoMaximo() {
        return pcrTempoMaximo;
    }

    public void setPcrTempoMaximo(String pcrTempoMaximo) {
        this.pcrTempoMaximo = pcrTempoMaximo;
    }

    public String getIra() {
        return ira;
    }

    public void setIra(String ira) {
        this.ira = ira;
    }

    public String getDialise() {
        return dialise;
    }

    public void setDialise(String dialise) {
        this.dialise = dialise;
    }

    public String getSecrecaoTot() {
        return secrecaoTot;
    }

    public void setSecrecaoTot(String secrecaoTot) {
        this.secrecaoTot = secrecaoTot;
    }

    public String getAspecto() {
        return aspecto;
    }

    public void setAspecto(String aspecto) {
        this.aspecto = aspecto;
    }

    public char getDiureseUltimasVinteEQuatroHoras() {
        return diureseUltimasVinteEQuatroHoras;
    }

    public void setDiureseUltimasVinteEQuatroHoras(char diureseUltimasVinteEQuatroHoras) {
        this.diureseUltimasVinteEQuatroHoras = diureseUltimasVinteEQuatroHoras;
    }

    public char getDiureseUltimasSeisHoras() {
        return diureseUltimasSeisHoras;
    }

    public void setDiureseUltimasSeisHoras(char diureseUltimasSeisHoras) {
        this.diureseUltimasSeisHoras = diureseUltimasSeisHoras;
    }

    public String getFebre() {
        return febre;
    }

    public void setFebre(String febre) {
        this.febre = febre;
    }

    public char getPrimeiraCreatinina() {
        return primeiraCreatinina;
    }

    public void setPrimeiraCreatinina(char primeiraCreatinina) {
        this.primeiraCreatinina = primeiraCreatinina;
    }

    public Date getPrimeiraCreatininaData() {
        return primeiraCreatininaData;
    }

    public void setPrimeiraCreatininaData(Date primeiraCreatininaData) {
        this.primeiraCreatininaData = primeiraCreatininaData;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public List<Infeccao> getInfeccao() {
        return infeccao;
    }

    public void setInfeccao(List<Infeccao> infeccao) {
        this.infeccao = infeccao;
    }

    public ProcessoDoacao getProcessoDoacao() {
        return processoDoacao;
    }

    public void setProcessoDoacao(ProcessoDoacao processoDoacao) {
        this.processoDoacao = processoDoacao;
    }
}
