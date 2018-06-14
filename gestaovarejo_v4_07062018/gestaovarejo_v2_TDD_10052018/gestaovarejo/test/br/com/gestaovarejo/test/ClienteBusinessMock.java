/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gestaovarejo.test;

import br.com.gestaovarejo.business.ClienteBusiness;
import br.com.gestaovarejo.business.interfaces.ClienteInterface;
import br.com.gestaovarejo.dominio.Cliente;
import java.util.ArrayList;

/**
 *
 * @author internet
 */
public class ClienteBusinessMock {
    
    public static void main(String[] args){
        Cliente novoCliente = new Cliente();
        novoCliente.setNome("Saulo");
        novoCliente.setSobrenome("Santos");
        
        novoCliente.setTelefones(new ArrayList<Integer>());
        novoCliente.getTelefones().add(965877458);
        novoCliente.getTelefones().add(95877458);
        novoCliente.getTelefones().add(965877458);
        
        ClienteInterface clienteBusiness = new ClienteBusiness(); 
        
        Cliente segundoNovoCliente = null;
        try{
            clienteBusiness.salvarCliente(novoCliente);
            clienteBusiness.salvarCliente(segundoNovoCliente);
        }catch(UnsupportedOperationException exc){
            System.out.println(exc.getMessage());
        }        
                
    }    
}
