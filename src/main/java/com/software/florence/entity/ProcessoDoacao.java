package com.software.florence.entity;

import com.software.florence.common.pattern.application.model.AbstractEntity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

@Entity(name = "PROCESSO_DOACAO")
public class ProcessoDoacao extends AbstractEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", unique = true)
    private Long oid;

    @Column(name = "HOSPITAL", nullable = false)
    private String hospital;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATA_INTERNACAO", nullable = false)
    private Date dataInternacao;

    @Column(name = "SETOR", nullable = false)
    private String setor;

    @Column(name = "LEITO", nullable = false)
    private String leito;

    @Column(name = "TELEFONE", nullable = false)
    private String telefone;

    @Column(name = "INFORMANTE", nullable = false)
    private String informante;

    @Column(name = "NOME", nullable = false)
    private String nome;

    @Column(name = "RG", nullable = false)
    private String rg;

    @Column(name = "CPF", nullable = false, length = 13)
    private String cpf;

    @Column(name = "CNS", nullable = false)
    private String cns;

    @Column(name = "ENDERECO", nullable = false)
    private String endereco;

    @Column(name = "FILIACAO", nullable = false)
    private String filiacao;

    @Column(name = "ESTADO_CIVIL", nullable = false)
    private String estadoCivil;

    @Column(name = "TELEFONE_FAMILIAR", nullable = false)
    private String telefoneFamiliar;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_NASCIMENTO", nullable = false)
    private Date dataNascimento;

    @Column(name = "IDADE", nullable = false)
    private int idade;

    @Column(name = "SEXO", nullable = false)
    private String sexo;

    @Column(name = "TIPAGEM", nullable = false)
    private String tipagem;

    @Column(name = "PESO", nullable = false)
    private BigDecimal peso;

    @Column(name = "ALTURA", nullable = false)
    private BigDecimal altura;

    @Column(name = "PRONTUARIO_HOSPITAL", nullable = false)
    private String prontuarioHospital;

    @Column(name = "CAUSA_DA_MORTE", nullable = false)
    private String causaDaMorte;

    @Column(name = "CAUSA_DA_MORTE_OUTRA", nullable = false)
    private String causaDaMorteOutra;

    @Column(name = "CAUSA_DA_MORTE_DECORRENTE_DE", nullable = false)
    private String causaDaMorteDecorrenteDe;

    @Column(name = "CAUSA_DA_MORTE_CIRCUNSTANCIA", nullable = false)
    private String causaDaMorteCircunstancia;

    @Column(name = "CAUSA_DA_MORTE_CIRCUNSTANCIA_ACIDENTE", nullable = false)
    private String causaDaMorteCircunstanciaAcidente;

    @Column(name = "PROTOCOLO_SEDACAO", nullable = false)
    private String protocoloSedacao;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "PROTOCOLO_DATA_HORA_SUSPENSAO", nullable = false)
    private Date protocoloDataHoraSuspensao;

    @Column(name = "PROTOCOLO_TEMPERATURA", nullable = false)
    private float protocoloTemperatura;

    @Column(name = "PROTOCOLO_TA", nullable = false)
    private String protocoloTa;

    @OneToOne
    @JoinColumn(name = "DOENCA_ATUAL_ID")
    private DoencaAtual doencaAtual;

    @OneToOne
    @JoinColumn(name = "SOROLOGIA_ID")
    private Sorologia sorologia;

    @OneToOne
    @JoinColumn(name = "HLA_ID")
    private Hla hla;

    @OneToOne
    @JoinColumn(name = "CIRURGIA_ID")
    private Cirurgia cirurgia;

    @OneToMany
    @JoinColumn(name = "APROVACAO_ID")
    private List<Aprovacao> aprovacao;

    @OneToOne
    @JoinColumn(name = "ENTREVISTA_FAMILIAR_ID")
    private EntrevistaFamiliar entrevistaFamiliar;

    @OneToOne
    @JoinColumn(name = "OBITO_ID")
    private Obito obito;

    @OneToOne
    @JoinColumn(name = "COMUNICACAO_PROCESSO_DOACAO_ID")
    private ComunicacaoProcessoDoacao comunicacaoProcessoDoacao;

    @OneToMany
    @JoinColumn(name = "EXAME_COMPLEMENTAR_ID")
    private List<ExameComplementar> exameComplementar;

    @OneToMany
    @JoinColumn(name = "TESTE_CLINICO_ID")
    private List<TesteClinico> testeClinico;

    @Override
    public Long getOid() {
        return oid;
    }

    @Override
    public void setOid(Long oid) {
        this.oid = oid;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public Date getDataInternacao() {
        return dataInternacao;
    }

    public void setDataInternacao(Date dataInternacao) {
        this.dataInternacao = dataInternacao;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getLeito() {
        return leito;
    }

    public void setLeito(String leito) {
        this.leito = leito;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getInformante() {
        return informante;
    }

    public void setInformante(String informante) {
        this.informante = informante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCns() {
        return cns;
    }

    public void setCns(String cns) {
        this.cns = cns;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getFiliacao() {
        return filiacao;
    }

    public void setFiliacao(String filiacao) {
        this.filiacao = filiacao;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getTelefoneFamiliar() {
        return telefoneFamiliar;
    }

    public void setTelefoneFamiliar(String telefoneFamiliar) {
        this.telefoneFamiliar = telefoneFamiliar;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTipagem() {
        return tipagem;
    }

    public void setTipagem(String tipagem) {
        this.tipagem = tipagem;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public BigDecimal getAltura() {
        return altura;
    }

    public void setAltura(BigDecimal altura) {
        this.altura = altura;
    }

    public String getProntuarioHospital() {
        return prontuarioHospital;
    }

    public void setProntuarioHospital(String prontuarioHospital) {
        this.prontuarioHospital = prontuarioHospital;
    }

    public String getCausaDaMorte() {
        return causaDaMorte;
    }

    public void setCausaDaMorte(String causaDaMorte) {
        this.causaDaMorte = causaDaMorte;
    }

    public String getCausaDaMorteOutra() {
        return causaDaMorteOutra;
    }

    public void setCausaDaMorteOutra(String causaDaMorteOutra) {
        this.causaDaMorteOutra = causaDaMorteOutra;
    }

    public String getCausaDaMorteDecorrenteDe() {
        return causaDaMorteDecorrenteDe;
    }

    public void setCausaDaMorteDecorrenteDe(String causaDaMorteDecorrenteDe) {
        this.causaDaMorteDecorrenteDe = causaDaMorteDecorrenteDe;
    }

    public String getCausaDaMorteCircunstancia() {
        return causaDaMorteCircunstancia;
    }

    public void setCausaDaMorteCircunstancia(String causaDaMorteCircunstancia) {
        this.causaDaMorteCircunstancia = causaDaMorteCircunstancia;
    }

    public String getCausaDaMorteCircunstanciaAcidente() {
        return causaDaMorteCircunstanciaAcidente;
    }

    public void setCausaDaMorteCircunstanciaAcidente(String causaDaMorteCircunstanciaAcidente) {
        this.causaDaMorteCircunstanciaAcidente = causaDaMorteCircunstanciaAcidente;
    }

    public String getProtocoloSedacao() {
        return protocoloSedacao;
    }

    public void setProtocoloSedacao(String protocoloSedacao) {
        this.protocoloSedacao = protocoloSedacao;
    }

    public Date getProtocoloDataHoraSuspensao() {
        return protocoloDataHoraSuspensao;
    }

    public void setProtocoloDataHoraSuspensao(Date protocoloDataHoraSuspensao) {
        this.protocoloDataHoraSuspensao = protocoloDataHoraSuspensao;
    }

    public float getProtocoloTemperatura() {
        return protocoloTemperatura;
    }

    public void setProtocoloTemperatura(float protocoloTemperatura) {
        this.protocoloTemperatura = protocoloTemperatura;
    }

    public String getProtocoloTa() {
        return protocoloTa;
    }

    public void setProtocoloTa(String protocoloTa) {
        this.protocoloTa = protocoloTa;
    }

    public DoencaAtual getDoencaAtual() {
        return doencaAtual;
    }

    public void setDoencaAtual(DoencaAtual doencaAtual) {
        this.doencaAtual = doencaAtual;
    }

    public Sorologia getSorologia() {
        return sorologia;
    }

    public void setSorologia(Sorologia sorologia) {
        this.sorologia = sorologia;
    }

    public Hla getHla() {
        return hla;
    }

    public void setHla(Hla hla) {
        this.hla = hla;
    }

    public Cirurgia getCirurgia() {
        return cirurgia;
    }

    public void setCirurgia(Cirurgia cirurgia) {
        this.cirurgia = cirurgia;
    }

    public List<Aprovacao> getAprovacao() {
        return aprovacao;
    }

    public void setAprovacao(List<Aprovacao> aprovacao) {
        this.aprovacao = aprovacao;
    }

    public EntrevistaFamiliar getEntrevistaFamiliar() {
        return entrevistaFamiliar;
    }

    public void setEntrevistaFamiliar(EntrevistaFamiliar entrevistaFamiliar) {
        this.entrevistaFamiliar = entrevistaFamiliar;
    }

    public Obito getObito() {
        return obito;
    }

    public void setObito(Obito obito) {
        this.obito = obito;
    }

    public ComunicacaoProcessoDoacao getComunicacaoProcessoDoacao() {
        return comunicacaoProcessoDoacao;
    }

    public void setComunicacaoProcessoDoacao(ComunicacaoProcessoDoacao comunicacaoProcessoDoacao) {
        this.comunicacaoProcessoDoacao = comunicacaoProcessoDoacao;
    }

    public List<ExameComplementar> getExameComplementar() {
        return exameComplementar;
    }

    public void setExameComplementar(List<ExameComplementar> exameComplementar) {
        this.exameComplementar = exameComplementar;
    }

    public List<TesteClinico> getTesteClinico() {
        return testeClinico;
    }

    public void setTesteClinico(List<TesteClinico> testeClinico) {
        this.testeClinico = testeClinico;
    }
}
