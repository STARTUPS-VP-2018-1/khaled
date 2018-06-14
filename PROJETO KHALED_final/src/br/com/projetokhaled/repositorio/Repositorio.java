/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetokhaled.repositorio;

import br.com.projetokhaled.dominio.Narguileiro;
import br.com.projetokhaled.dominio.Tabacaria;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author internet
 */
public class Repositorio {

    public static List<Tabacaria> tabacariaDBFake = new ArrayList<>();
    public static List<Narguileiro> narguileiroDBFake = new ArrayList<>();

    static {
        Narguileiro novoNarguileiro = new Narguileiro();
        novoNarguileiro.setNome("Pedro");
        novoNarguileiro.setSenha("Pedro123");

        Tabacaria novoTabacaria = new Tabacaria();
        novoTabacaria.setnome_Tabaca("Khaled");
        novoTabacaria.setrua("TabacanewSP");
        novoTabacaria.setregiao_sp("Leste");

    }
}
