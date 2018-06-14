/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gestaovarejo.business;

import br.com.gestaovarejo.business.interfaces.ProdutoInterface;
import br.com.gestaovarejo.dominio.Produto;
import br.com.gestaovarejo.repositorio.Repositorio;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author internet
 */
public class ProdutoBusiness implements ProdutoInterface{

    @Override
    public Produto salvarProduto(Produto produto) {
        Repositorio.produtoDBFake.add(produto);
        return produto;
    }

    @Override
    public Produto buscarProdutoPorId(Integer id) {
        for(Produto produto: Repositorio.produtoDBFake){
            if(produto.getId() == id){
                return produto;
            }
        } 
        return null;
    }
   
    @Override
    public List<Produto> buscarProdutoPorNome(String nome) {           
        List<Produto> listaDeProdutosEncontrados = new ArrayList<Produto>();        
        
        for(int i = 0; i< Repositorio.produtoDBFake.size();i++){
            Produto produto = Repositorio.produtoDBFake.get(i);
            if(produto.getNomeProduto().startsWith(nome)){
                listaDeProdutosEncontrados.add(produto);
            }           
        }
        return listaDeProdutosEncontrados;
    }

    @Override
    public List<Produto> buscarTodosProdutos() {
      return Repositorio.produtoDBFake;  
    }

}
