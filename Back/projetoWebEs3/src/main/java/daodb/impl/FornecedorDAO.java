package daodb.impl;

import daodb.IDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.EntidadeDominio;
import model.Fornecedor;

public class FornecedorDAO implements IDAO{
	
	private Connection connection = null;

	@Override
	public String salvar(EntidadeDominio entidade) {
		
		Fornecedor fornecedor = (Fornecedor) entidade;
    	PreparedStatement pst = null;
    	
    	try {
    		connection = Conexao.getConnectionPostgres();
    		connection.setAutoCommit(false);
    		
    		StringBuilder sql = new StringBuilder();
    		sql.append("INSERT INTO projetoes3.\"Fornecedor\"(fnc_cnpj, fnc_rzsocial, fnc_email) VALUES (?,?,?)");
    		
    		
    		pst = connection.prepareStatement(sql.toString(), Statement.RETURN_GENERATED_KEYS);
    		
    		
    		pst.setString(1, fornecedor.getCnpj());
    		pst.setString(2, fornecedor.getRazaoSocial());
    		pst.setString(3, fornecedor.getEmail());
    		
    		pst.executeUpdate();
    		
    		connection.commit();
    		
		} catch(Exception e) {
    		try {
    			connection.rollback();
    		}catch(Exception error) {
    			error.printStackTrace();	
    		}
    		e.printStackTrace();
    		return "Erro ao salvar!";
    	}finally{
    		try {
    			connection.close();
    			pst.close();
    		}catch(SQLException e) {
    			e.printStackTrace();
    		}
    	}
    			
		return "Fornecedor salvo com sucesso!";
	}

	@Override
	public String alterar(EntidadeDominio entidade) {
		Fornecedor fornecedor = (Fornecedor) entidade;
        PreparedStatement pst = null;
        
        try {
			
        	connection = Conexao.getConnectionPostgres();
        	connection.setAutoCommit(false);
        	
        	StringBuilder sql = new StringBuilder();
        	sql.append("UPDATE projetoes3.\"Fornecedor\" SET fnc_cnpj = ?, fnc_rzsocial = ?, fnc_email = ?  WHERE (fnc_id = ?)");
        	
        	pst = connection.prepareStatement(sql.toString(), Statement.RETURN_GENERATED_KEYS);
        	
        	pst.setString(1, fornecedor.getCnpj());
    		pst.setString(2, fornecedor.getRazaoSocial());
    		pst.setString(3, fornecedor.getEmail());
        	pst.setInt(4, fornecedor.getId());
        	
        	pst.executeUpdate();
        	
        	connection.commit();
        	
		} catch (Exception e) {
			try {
    			connection.rollback();
    		}catch(Exception error) {
    			error.printStackTrace();
    			
    		}
    		e.printStackTrace();
    		return "Erro ao alterar!";
		}finally{
    		
    		try {
    			connection.close();
    			pst.close();
    		}catch(SQLException e) {
    			e.printStackTrace();
    		}
    	}
    	return "Fornecedor alterado com sucesso!";
	}

	@Override
	public String excluir(EntidadeDominio entidade) {
		Fornecedor fornecedor = (Fornecedor) entidade;
        PreparedStatement pst = null;
        
        try {
        	connection = Conexao.getConnectionPostgres();
        	connection.setAutoCommit(false);
        	
        	StringBuilder sql = new StringBuilder();
        	sql.append("DELETE FROM projetoes3.\"Fornecedor\" WHERE fnc_id = ?");
        	
        	pst = connection.prepareStatement(sql.toString());
        	
        	pst.setInt(1, fornecedor.getId());
        	
        	pst.executeUpdate();
        	
        	connection.commit();
        	
		} catch (Exception e) {
			try {
    			connection.rollback();
    		}catch(Exception error) {
    			error.printStackTrace();
    			
    		}
    		e.printStackTrace();
    		return "Erro ao excluir!";
		}finally{
    		
    		try {
    			connection.close();
    			pst.close();
    		}catch(SQLException e) {
    			e.printStackTrace();
    		}
    	}
        
        return "Fornecedor excluido com sucesso!";
	}

	@Override
	public List<Fornecedor> consultar() {
		Fornecedor fornecedor;
    	List<Fornecedor> fornecedores = new ArrayList<>();
    	PreparedStatement pst = null;
    	
    	try {
    		
    		connection = Conexao.getConnectionPostgres();
    		
    		StringBuilder sql = new StringBuilder();
    		sql.append("SELECT * FROM projetoes3.\"Fornecedor\"");
    		
    		pst = connection.prepareStatement(sql.toString(), Statement.RETURN_GENERATED_KEYS);
    		
    		ResultSet rs = pst.executeQuery();
    		
    		while(rs.next()) {
    			fornecedor = new Fornecedor(rs.getInt("fnc_id"), rs.getString("fnc_cnpj"), rs.getString("fnc_rzsocial"),
    					rs.getString("fnc_email"));
    			
    			fornecedores.add(fornecedor);
    		}
    		
    		return fornecedores;	
		} catch (Exception e) {
			
			e.printStackTrace();
			return null;
			
		}	finally{
    		try {
    
    			connection.close();
    			pst.close();
    			
    		}catch(SQLException e) {
    			e.printStackTrace();
    		}
    	}
	}

}
