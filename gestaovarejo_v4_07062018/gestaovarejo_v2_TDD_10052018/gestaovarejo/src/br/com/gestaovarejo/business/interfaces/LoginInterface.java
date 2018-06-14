/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gestaovarejo.business.interfaces;

import br.com.gestaovarejo.dominio.Usuario;

/**
 *
 * @author internet
 */
public interface LoginInterface {
    
    public boolean validaUsuario(Usuario usuario);
    
    public Usuario validaUsuario(String nomeUsuario, String senha);
            
    
}
