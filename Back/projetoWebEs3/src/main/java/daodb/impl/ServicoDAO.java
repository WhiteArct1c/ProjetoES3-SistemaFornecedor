
package daodb.impl;

import daodb.IDAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.EntidadeDominio;
import model.Servico;

public class ServicoDAO implements IDAO{
	
	private Connection connection = null;

    @Override
    public String salvar(EntidadeDominio entidade) {
    	
    	Servico servico = (Servico) entidade;
    	PreparedStatement pst = null;
    	
    	try {

    		connection = Conexao.getConnectionPostgres();
    		connection.setAutoCommit(false);
    		
    		StringBuilder sql = new StringBuilder();
    		sql.append("INSERT INTO projetoes3.\"Servico\"(svc_codigo, svc_descricao, svc_preco, svc_dtinicio) VALUES (?,?,?,?)");
    		
    		
    		pst = connection.prepareStatement(sql.toString(), Statement.RETURN_GENERATED_KEYS);
    		
    		
    		pst.setString(1, servico.getCodigo());
    		pst.setString(2, servico.getDescricao());
    		pst.setDouble(3, servico.getPreco());
    		pst.setDate(4, (Date)servico.getDataInicio());// TODO: arrumar erro de conversão
    		
    		pst.executeUpdate();
    		
    		/*
    		ResultSet rs = pst.getGeneratedKeys();
    		int idServico = 0;
    		
    		
    		if(rs.next())
    				idServico = rs.getInt(1);
    		
    		servico.setId(idServico);
    		*/
    		
    		connection.commit();
    		
    	}catch(Exception e) {
    		
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
    	
    	return null;
    	
    }

    @Override
    public String alterar(EntidadeDominio entidade) {
    	Servico servico = (Servico)entidade;
        PreparedStatement pst = null;
        
        try {
			
        	connection = Conexao.getConnectionPostgres();
        	connection.setAutoCommit(false);
        	
        	StringBuilder sql = new StringBuilder();
        	sql.append("UPDATE projetoes3.\"Servico\" SET svc_codigo = ?, svc_descricao = ?, svc_preco = ?, svc_dtinicio = ? WHERE (svc_id = ?)");
        	
        	pst = connection.prepareStatement(sql.toString(), Statement.RETURN_GENERATED_KEYS);
        	
        	pst.setString(1, servico.getCodigo());
        	pst.setString(2, servico.getDescricao());
        	pst.setDouble(3, servico.getPreco());
        	pst.setDate(4, (Date)servico.getDataInicio());
        	pst.setInt(5, servico.getId());
        	
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
    	return null;
    }

    @Override
    public String excluir(EntidadeDominio entidade) {
        Servico servico = (Servico)entidade;
        PreparedStatement pst = null;
        
        try {
        	connection = Conexao.getConnectionPostgres();
        	connection.setAutoCommit(false);
        	
        	StringBuilder sql = new StringBuilder();
        	sql.append("DELETE FROM projetoes3.\"Servico\" WHERE svc_id = ?");
        	
        	pst = connection.prepareStatement(sql.toString());
        	
        	pst.setInt(1, servico.getId());
        	
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
        
        return null;
    }

    public List<Servico> consultar(){
    	Servico servico;
    	List<Servico> servicos = new ArrayList<>();
    	PreparedStatement pst = null;
    	
    	try {
    		connection = Conexao.getConnectionPostgres();
    		
    		StringBuilder sql = new StringBuilder();
    		sql.append("SELECT * FROM projetoes3.\"Servico\"");
    		
    		pst = connection.prepareStatement(sql.toString(), Statement.RETURN_GENERATED_KEYS);
    		
    		ResultSet rs = pst.executeQuery();
    		
    		while(rs.next()) {
    			servico = new Servico(rs.getInt("svc_id"), rs.getString("svc_codigo"), rs.getString("svc_descricao"),
    					rs.getDouble("svc_preco"), rs.getDate("svc_dtinicio"));
    			
    			servicos.add(servico);
    		}
    		
    		return servicos;	
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
