package com.software.florence.common.exception;

import com.software.florence.common.util.mensagem.MensagemNegocio;
import com.software.florence.common.util.objeto.ObjetoUtil;

import java.util.ArrayList;
import java.util.List;

public class NegocioException extends Exception {

    private static final long serialVersionUID = 6308428919963180308L;

    private List<MensagemNegocio> mensagens;

    public NegocioException(String tipo, String texto) {
        this.mensagens = new ArrayList<MensagemNegocio>();
        this.mensagens.add(new MensagemNegocio(tipo, texto));
    }

    public NegocioException(String tipo, List<String> mensagens) {
        this.mensagens = new ArrayList<MensagemNegocio>();
        for (String texto : mensagens) {
            this.mensagens.add(new MensagemNegocio(tipo, texto));
        }// for
    }// NegocioException()

    public NegocioException(NegocioException e) {
        this.mensagens = e.getMensagens();
    }// NegocioException()

    public NegocioException(List<MensagemNegocio> mensagens) {
        this.mensagens = mensagens;
    }// NegocioException()

    public NegocioException(MensagemNegocio mensagemNegocio) {
        this.mensagens = new ArrayList<MensagemNegocio>();
        this.mensagens.add(mensagemNegocio);
    }// NegocioException()

    public NegocioException(String... mensagens) {
        this.mensagens = new ArrayList<MensagemNegocio>();
        for (String texto : mensagens) {
            this.mensagens.add(new MensagemNegocio(MensagemNegocio.ERRO, texto));
        }// for
    }// NegocioException()

    public List<MensagemNegocio> getMensagens() {
        return mensagens;
    }// getMensagens()

    @Override
    public String getMessage() {
        StringBuilder retorno = new StringBuilder();
        String mensagem = super.getMessage();
        if (ObjetoUtil.naoEhNuloOuVazio(mensagem)) {
            retorno.append(mensagem);
        }// if
        for (MensagemNegocio mensagemNegocio : this.mensagens) {
            retorno.append(ObjetoUtil.ehNuloOuVazio(retorno.toString()) ? "" : "\n").append(mensagemNegocio.toString());
        }// for
        return retorno.toString();
    }// getMessage()

    @Override
    public String toString() {
        return super.toString() + getMessage();
    }// toString()

}// NegocioException()