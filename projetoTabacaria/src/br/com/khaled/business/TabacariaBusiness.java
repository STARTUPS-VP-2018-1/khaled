package br.com.khaled.business;

import java.util.List;

import br.com.khaled.business.interfaces.TabacariaInterface;
import br.com.khaled.dominio.Tabacaria;
import br.com.khaled.repositorio.dao.TabacariaDAO;

public class TabacariaBusiness implements TabacariaInterface{

	@Override
	public List<String> listarTabacarias() {
		
		TabacariaDAO tabacariaDAO = new TabacariaDAO();
		
		return null;
	}

	@Override
	public void adicionaTabacaria(Tabacaria tabacaria) {
		TabacariaDAO tabacariaDAO = new TabacariaDAO();
		tabacariaDAO.adiciona(tabacaria);		
	}

}
