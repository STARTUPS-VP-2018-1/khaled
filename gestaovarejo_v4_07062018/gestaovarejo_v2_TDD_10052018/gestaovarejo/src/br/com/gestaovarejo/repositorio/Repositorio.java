/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gestaovarejo.repositorio;

import br.com.gestaovarejo.dominio.Cliente;
import br.com.gestaovarejo.dominio.Fornecedor;
import br.com.gestaovarejo.dominio.Produto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author internet
 */
public class Repositorio {
    
    public static List<Produto> produtoDBFake = new ArrayList<Produto>();
    public static List<Cliente> clienteDBFake = new ArrayList<Cliente>();
    public static List<Fornecedor> fornecedorDBFake = new ArrayList<Fornecedor>();
    
    static{
        Cliente novoCliente = new Cliente();
        novoCliente.setNomeUsuario("julio");
        novoCliente.setSenha("teste123");       
        
        Cliente novoCliente2 = new Cliente("juca","teste123");
        
        Fornecedor novoFornecedor = new Fornecedor();
        novoFornecedor.setNomeUsuario("creiso");
        novoFornecedor.setSenha("teste123");
        
        clienteDBFake.add(novoCliente);
        clienteDBFake.add(novoCliente2);
        fornecedorDBFake.add(novoFornecedor);
    }
    
}
