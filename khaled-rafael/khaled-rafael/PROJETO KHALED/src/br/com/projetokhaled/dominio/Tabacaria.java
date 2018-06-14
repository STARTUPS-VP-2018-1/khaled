/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetokhaled.dominio;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author internet
 */
public class Tabacaria {
    
   
    private String nomeTabaca;
    private String rua;
    private int    avaliacao;
    private String região_sp;

    public String getNomeTabaca() {
        return nomeTabaca;
    }

    public String getRua() {
        return rua;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public String getRegião_sp() {
        return região_sp;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.nomeTabaca);
        hash = 23 * hash + Objects.hashCode(this.rua);
        hash = 23 * hash + this.avaliacao;
        hash = 23 * hash + Objects.hashCode(this.região_sp);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tabacaria other = (Tabacaria) obj;
        if (this.avaliacao != other.avaliacao) {
            return false;
        }
        if (!Objects.equals(this.nomeTabaca, other.nomeTabaca)) {
            return false;
        }
        if (!Objects.equals(this.rua, other.rua)) {
            return false;
        }
        if (!Objects.equals(this.região_sp, other.região_sp)) {
            return false;
        }
        return true;
    }

    public void setnome_Tabaca(String khaled) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setrua(String tabacanewSP) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setregiao_sp(String leste) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}

