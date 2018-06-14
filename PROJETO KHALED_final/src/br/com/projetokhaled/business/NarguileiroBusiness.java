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
        for (Narguileiro narguileiro : Repositorio.narguileiroDBFake) {
            if (narguileiro.getEmail() == email) {
                return narguileiro;
            }

        }
        return null;
    }



    @Override
    public boolean validaUsuario(Narguileiro usuario) {
        for (Narguileiro cliente : Repositorio.narguileiroDBFake) {
            if (cliente.getNome().
                    equals(usuario.getNome())
                    && cliente.getSenha().equals(cliente.getSenha())) {
                return true;
            }
        }

        return false;

    }

    @Override
    public Narguileiro validaUsuario(String nomeNarguileiro, String senha) {
        Narguileiro usuario = null;

        for (Narguileiro cliente : Repositorio.narguileiroDBFake) {
            if (cliente.getNome().
                    equals(nomeNarguileiro)
                    && cliente.getSenha().equals(senha)) {
                usuario = new Narguileiro();
                usuario.setNome(nomeNarguileiro);
                usuario.setSenha(senha);

            }
        }

        return usuario;
    }

    @Override
    public Narguileiro buscarNarguileiroPorUsuario(Narguileiro usuario) {
         for(Narguileiro cliente: Repositorio.narguileiroDBFake){
            if(cliente.getNome().equals(usuario.getNome())){
                return cliente;
            }
        }       
        return null;
    }

    @Override
    public List<Narguileiro> buscarNarguileiroPorNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     }

