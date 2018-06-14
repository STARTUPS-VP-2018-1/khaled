/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gestaovarejo.business;

import br.com.gestaovarejo.business.interfaces.LoginInterface;
import br.com.gestaovarejo.dominio.Usuario;

/**
 *
 * @author internet
 */
public class LoginBusinessSOA implements LoginInterface {

    @Override
    public boolean validaUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario validaUsuario(String nomeUsuario, String senha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
