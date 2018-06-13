package br.com.khaled.business.interfaces;

import java.util.List;

import br.com.khaled.dominio.Tabacaria;

public interface TabacariaInterface {
	
	
	public List<String> listarTabacarias();
	
	public void adicionaTabacaria(Tabacaria tabacaria);

}
