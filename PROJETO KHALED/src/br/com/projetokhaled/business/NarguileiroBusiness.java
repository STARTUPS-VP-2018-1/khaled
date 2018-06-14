/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetokhaled.business;

import br.com.projetokhaled.business.interfaces.NarguileiroInterface;
import br.com.projetokhaled.dominio.Narguileiro;
import br.com.projetokhaled.repositorio.Repositorio;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author internet
 */
public class NarguileiroBusiness implements NarguileiroInterface {

    @Override
    public Narguileiro NarguileiroCliente(Narguileiro narguileiro) {
        Repositorio.narguileiroDBFake.add(narguileiro);
        return narguileiro;
    }

    @Override
    public Narguileiro NarguileiroPorEmail(String email) {
         for(Narguileiro narguileiro:Repositorio.narguileiroDBFake){
            if(narguileiro.getEmail() == email){
                return narguileiro;
            }
           
             
        } 
        return null;
    }

    @Override
    public List<Narguileiro> buscarNarguileiroPorNome(String nome) {
        
        List<Narguileiro> listaDeNarguileirosEncontrados = new ArrayList<Narguileiro>();        
        
        for(int i = 0; i< Repositorio.narguileiroDBFake.size();i++){
            Narguileiro narguileiro = Repositorio.narguileiroDBFake.get(i);
            if(Narguileiro.getNarguileiro().startsWith(nome)){
                listaDeNarguileirosEncontrados.add(narguileiro);
    }
        
    @Override
    public List<Narguileiro> buscarTodosNarguileiroS() {
        return Repositorio.narguileiroDBFake; 
    }
    
}
