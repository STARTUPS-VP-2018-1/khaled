/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetokhaled.util;

/**
 *
 * @author internet
 */
public class Util {
    
    
    public static boolean validaUsuario(String narguileior){
        if(narguileior.contains("@")){
            return false;
        }       
        return true;
    }
    
}
