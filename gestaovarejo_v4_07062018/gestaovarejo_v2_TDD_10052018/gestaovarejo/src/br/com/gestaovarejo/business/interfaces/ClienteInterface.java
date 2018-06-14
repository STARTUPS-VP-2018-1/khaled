/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gestaovarejo.business.interfaces;

import br.com.gestaovarejo.dominio.Cliente;
import br.com.gestaovarejo.dominio.Produto;
import br.com.gestaovarejo.dominio.Usuario;
import java.util.List;

/**
 *
 * @author internet
 */
public interface ClienteInterface {
       
    public Cliente salvarCliente(Cliente cliente);
    
    public Cliente buscarClientePorId(Integer id);
    
    public List<Cliente> buscarClientePorNome(String nome);
    
    public List<Cliente> buscarTodosClienteS();
    
    public Cliente buscarClientePorUsuario(Usuario usuario);
}
