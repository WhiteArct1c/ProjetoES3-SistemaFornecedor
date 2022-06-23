package model;

import java.util.ArrayList;
import java.util.List;

public class Resultado {
	List<EntidadeDominio> entidades = new ArrayList<>();
	private String resposta;
	
	public Resultado() {
		
	}

	public List<EntidadeDominio> getEntidades() {
		return entidades;
	}

	public void setEntidades(List<EntidadeDominio> entidades) {
		this.entidades = entidades;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	
}
