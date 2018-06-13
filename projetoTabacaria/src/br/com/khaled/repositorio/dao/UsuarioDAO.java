package br.com.khaled.repositorio.dao;

import java.sql.SQLException;
import com.mysql.jdbc.Connection;

import br.com.khaled.dominio.Usuario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class UsuarioDAO {
	String nome, email, senha;
	private Connection connection;
	public UsuarioDAO(){ 
        this.connection = new Conexao().getConexao();
    } 
	public void adiciona(Usuario usuario){
		String sql = "INSERT INTO usuarios(nome,email,senha) VALUES(?,?,?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getSenha());
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
	
	//Teste Comentado da autenticação.
	//public static void main(String[] args) throws SQLException {
	//	UsuarioDAO dao = new UsuarioDAO();
	//	System.out.println(dao.checarLogin("joao","123")); -> retorna True
	//	System.out.println(dao.checarLogin("j","1")); -> retorna false
	//}
}
