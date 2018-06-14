package br.com.khaled.repositorio.dao;

import java.sql.SQLException;
import com.mysql.jdbc.Connection;

import br.com.khaled.dominio.Tabacaria;
import br.com.khaled.dominio.Usuario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TabacariaDAO {
	String nome, telefone, endereço, bairro, UF;
	private Connection connection;
	
	public TabacariaDAO(){ 
        this.connection = new Conexao().getConexao();
    } 
	
	public void adiciona(Tabacaria tabacaria){
		String sql = "INSERT INTO tabacaria(nome,telefone,endereco,bairro,uf) VALUES(?,?,?,?,?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, tabacaria.getNome());
            stmt.setString(2, tabacaria.getTelefone());
            stmt.setString(3, tabacaria.getEndereço());
            stmt.setString(4, tabacaria.getBairro());
            stmt.setString(5, tabacaria.getUF());
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
	}
	
	public boolean checarLogin(String email, String senha) throws SQLException {
		boolean ativo = false;
		String sql = "select *from usuarios where email=? AND senha=?";
		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setObject(1, email);
		stmt.setObject(2, senha);		
		ResultSet rs = stmt.executeQuery(); 
		
		while(rs.next()) {
			ativo = true;
			return ativo;
		}
		return ativo;
	}
}
