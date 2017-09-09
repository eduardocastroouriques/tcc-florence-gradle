package com.software.florence.common.util.exception;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.util.log.LogUtil;
import com.software.florence.common.util.mensagem.MensagemNegocio;

import java.util.List;

public class MensagemUtil {

	public static void lancar(String tipo, String texto) throws NegocioException {
		throw new NegocioException(new MensagemNegocio(tipo, texto));
	}// lancar()

	public static void lancar(String tipo, List<String> mensagens) throws NegocioException {
		throw new NegocioException(tipo, mensagens);
	}// lancar()

	public static void lancar(MensagemNegocio mensagemNegocio) throws NegocioException {
		throw new NegocioException(mensagemNegocio);
	}// lancar()

	public static void lancar(NegocioException e) throws NegocioException {
		throw new NegocioException(e);
	}// lancar()

	public static void lancarErro(Class<?> classe, Throwable e) throws NegocioException {
		LogUtil.registrarError(classe, e);
		if (e instanceof NegocioException && !((NegocioException) e).getMensagens().isEmpty()) {
			throw new NegocioException(((NegocioException) e).getMensagens());
		} else {
			throw new NegocioException(MensagemNegocio.ERRO, MensagemNegocio.MSG_ERRO);
		}// if-else
	}// lancar()

	public static MensagemNegocio getMensagemOKPadrao() {
		return new MensagemNegocio(MensagemNegocio.SUCESSO, MensagemNegocio.MSG_SUCESSO);
	}// getMensagemOKPadrao()
	
	public static MensagemNegocio getMensagemSalvoSucesso(){
		return new MensagemNegocio(MensagemNegocio.SUCESSO, MensagemNegocio.MSG_SALVO_SUCESSO);
	}
	
	public static MensagemNegocio getMensagemExcluidoSucesso(){
		return new MensagemNegocio(MensagemNegocio.SUCESSO, MensagemNegocio.MSG_EXCLUIDO_SUCESSO);
	}
	
	public static MensagemNegocio montarMensagemErroGrave(String mensagem) {
		return new MensagemNegocio(MensagemNegocio.ERRO, new StringBuffer(MensagemNegocio.MSG_ERRO).append(": ").append(mensagem).toString());
	}// montarMensagemErroGrave()
	
}// MensagemUtil()