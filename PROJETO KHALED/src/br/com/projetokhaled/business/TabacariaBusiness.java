/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetokhaled.business;

import br.com.projetokhaled.business.interfaces.TabacariaInterface;
import br.com.projetokhaled.dominio.Narguileiro;
import br.com.projetokhaled.dominio.Tabacaria;
import br.com.projetokhaled.repositorio.Repositorio;

/**
 *
 * @author internet
 */
public class TabacariaBusiness implements TabacariaInterface{

    @Override
    public Tabacaria buscarTabacariaPorRegiao(String região_sp) {
           for(Tabacaria tabacaria:Repositorio.tabacariaDBFake){
            if(tabacaria.getregião_sp() == região_sp){
                return tabacaria;
            }
           
             
        } 
        return null;
    }
    
}
