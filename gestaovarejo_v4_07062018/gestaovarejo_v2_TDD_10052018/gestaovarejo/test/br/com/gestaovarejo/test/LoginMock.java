/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gestaovarejo.test;

import br.com.gestaovarejo.business.ClienteBusiness;
import br.com.gestaovarejo.business.FornecedorBusiness;
import br.com.gestaovarejo.business.LoginBusiness;
import br.com.gestaovarejo.business.LoginBusinessOracle;
import br.com.gestaovarejo.business.LoginBusinessPostGree;
import br.com.gestaovarejo.business.LoginBusinessSOA;
import br.com.gestaovarejo.business.interfaces.ClienteInterface;
import br.com.gestaovarejo.business.interfaces.FornecedorInterface;
import br.com.gestaovarejo.business.interfaces.LoginInterface;
import br.com.gestaovarejo.dominio.Usuario;
import br.com.gestaovarejo.util.Util;
import javax.swing.JOptionPane;

/**
 *
 * @author internet
 */
public class LoginMock {
    
    public static void main(String agrs[]){
        
        Usuario novoUsuario = new Usuario();
        novoUsuario.setNomeUsuario("julio");
        novoUsuario.setSenha("teste123");
        novoUsuario.setFornecedor(true);
        
            
        if(!Util.validaUsuario(novoUsuario.getNomeUsuario())){
            JOptionPane.showMessageDialog(null, "Usuario Inválido");
        }
               
        LoginInterface loginBusiness = new LoginBusiness();
        ClienteInterface clienteBusiness = new ClienteBusiness();
        FornecedorInterface fornecedorBusiness = new FornecedorBusiness();
        
        
        if(loginBusiness.validaUsuario(novoUsuario)){
            if(clienteBusiness.buscarClientePorUsuario(novoUsuario)!=null){
                JOptionPane.showMessageDialog(null, "Usuario é um Cliente!");
            }
            if(fornecedorBusiness.buscarFornecedorPorUsuario(novoUsuario)!=null){
                JOptionPane.showMessageDialog(null, "Usuario é um Fornecedor!");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Usuario não encontrado!");
        }
    }
}




