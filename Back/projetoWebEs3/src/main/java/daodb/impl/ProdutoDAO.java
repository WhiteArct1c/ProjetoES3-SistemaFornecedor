
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
import model.Produto;

public class ProdutoDAO implements IDAO{
	
	private Connection connection = null;

	@Override
	public String salvar(EntidadeDominio entidade) {
		
		Produto produto = (Produto) entidade;
    	PreparedStatement pst = null;
    	
    	try {
    		connection = Conexao.getConnectionPostgres();
    		connection.setAutoCommit(false);
    		
    		StringBuilder sql = new StringBuilder();
    		sql.append("INSERT INTO projetoes3.\"Produto\"(prd_nome, prd_categoria, prd_tpunidade, prd_preco) VALUES (?,?,?,?)");
    		
    		
    		pst = connection.prepareStatement(sql.toString(), Statement.RETURN_GENERATED_KEYS);
    		
    		
    		pst.setString(1, produto.getNome());
    		pst.setString(2, produto.getCategoria());
    		pst.setString(3, produto.getTipoUnidade());
    		pst.setDouble(4, produto.getPreco());
    		
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
    	
		
		return "Produto salvo com sucesso!";
	}

	@Override
	public String alterar(EntidadeDominio entidade) {
		Produto produto = (Produto)entidade;
        PreparedStatement pst = null;
        
        try {
			
        	connection = Conexao.getConnectionPostgres();
        	connection.setAutoCommit(false);
        	
        	StringBuilder sql = new StringBuilder();
        	sql.append("UPDATE projetoes3.\"Produto\" SET prd_nome = ?, prd_categoria = ?, prd_tpunidade = ?, prd_preco = ?  WHERE (prd_id = ?)");
        	
        	pst = connection.prepareStatement(sql.toString(), Statement.RETURN_GENERATED_KEYS);
        	
        	pst.setString(1, produto.getNome());
    		pst.setString(2, produto.getCategoria());
    		pst.setString(3, produto.getTipoUnidade());
    		pst.setDouble(4, produto.getPreco());
        	pst.setInt(5, produto.getId());
        	
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
    	return "Produto alterado com sucesso!";
	}

	@Override
	public String excluir(EntidadeDominio entidade) {
		Produto produto = (Produto)entidade;
        PreparedStatement pst = null;
        
        try {
        	connection = Conexao.getConnectionPostgres();
        	connection.setAutoCommit(false);
        	
        	StringBuilder sql = new StringBuilder();
        	sql.append("DELETE FROM projetoes3.\"Produto\" WHERE prd_id = ?");
        	
        	pst = connection.prepareStatement(sql.toString());
        	
        	pst.setInt(1, produto.getId());
        	
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
        
        return "Produto exclu??do com sucesso!";
	}

	@Override
	public List<Produto> consultar() {
		Produto produto;
    	List<Produto> produtos = new ArrayList<>();
    	PreparedStatement pst = null;
    	
    	try {
    		
    		connection = Conexao.getConnectionPostgres();
    		
    		StringBuilder sql = new StringBuilder();
    		sql.append("SELECT * FROM projetoes3.\"Produto\"");
    		
    		pst = connection.prepareStatement(sql.toString(), Statement.RETURN_GENERATED_KEYS);
    		
    		ResultSet rs = pst.executeQuery();
    		
    		while(rs.next()) {
    			produto = new Produto(rs.getInt("prd_id"), rs.getString("prd_nome"), rs.getString("prd_categoria"),
    					rs.getString("prd_tpunidade"), rs.getDouble("prd_preco"));
    			
    			produtos.add(produto);
    		}
    		
    		return produtos;	
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
