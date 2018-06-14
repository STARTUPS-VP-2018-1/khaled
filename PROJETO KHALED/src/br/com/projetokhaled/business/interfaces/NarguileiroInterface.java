/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetokhaled.business.interfaces;

import br.com.projetokhaled.dominio.Narguileiro;
import java.util.List;

/**
 *
 * @author internet
 */
public interface NarguileiroInterface {
    
    public Narguileiro NarguileiroCliente(Narguileiro narguileiro);
    
    public Narguileiro NarguileiroPorEmail(String email);
    
    public List<Narguileiro> buscarNarguileiroPorNome(String nome);
    
    public List<Narguileiro> buscarTodosNarguileiroS();
}
