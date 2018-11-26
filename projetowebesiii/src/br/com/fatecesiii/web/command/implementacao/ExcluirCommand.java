package br.com.fatecesiii.web.command.implementacao;

import br.com.fatecesiii.core.aplicacao.Resultado;
import br.com.fatecesiii.dominio.entidadedominio.EntidadeDominio;

public class ExcluirCommand extends AbstractCommand {

	public Resultado execute(EntidadeDominio entidade) {
		
		return fachada.excluir(entidade);
	}
}
