package com.mycompany.dao;

import com.mycompany.factory.ConnectionFactory;
import java.sql.Connection;

import com.mycompany.model.Contato;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContatoDAO {
    public void save(Contato contato) {
        String query = "INSERT INTO contatos(nome, idade, dataCadastro) VALUES (?, ?, ?)";

        Connection conn = null;
        PreparedStatement pstm = null;
        
        try {
            conn = ConnectionFactory.createConnectionToMySQL();
            
            pstm = conn.prepareStatement(query);
            pstm.setString(1, contato.getNome());
            pstm.setInt(2, contato.getIdade());
            pstm.setDate(3, new Date(contato.getDateCadastro().getTime()));
            pstm.execute();
            System.out.println("Salvo com sucesso");
        } catch (Exception e) {
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
            }
        }
        
    };
    
    public void deleteByID(int id) {
        String query = "DELETE FROM contatos WHERE id = ?";
        Connection conn = null;
        PreparedStatement pstm = null;
        
        try {
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = conn.prepareStatement(query);
            
            pstm.setInt(1, id);
            
            pstm.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    public void update(Contato contato) {
        String query = "UPDATE contatos SET nome = ?, idade = ?, dataCadastro = ? "+"WHERE id = ?;";
        Connection conn = null;
        PreparedStatement pstm = null;
        
        try {
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = conn.prepareStatement(query);
            
            pstm.setString(1, contato.getNome());
            pstm.setInt(2, contato.getIdade());
            pstm.setDate(3, new Date(contato.getDateCadastro().getTime()));
            pstm.setInt(4, contato.getId());
            
            pstm.execute();
        } catch (Exception e) {
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
            }
        }
    }
    
    public List<Contato> getContatos() throws SQLException{
        String query = "SELECT * FROM contatos;";
        
        List<Contato> contatos = new ArrayList<>();
        
        Connection conn = null;
        PreparedStatement pstm = null;
        
        ResultSet rset = null;
        
        try {
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = conn.prepareStatement(query);
            rset = pstm.executeQuery();
            
            while (rset.next()) {
                Contato contato = new Contato();
                
                contato.setId(rset.getInt("id"));
                contato.setNome(rset.getString("nome"));
                contato.setIdade(rset.getInt("idade"));
                contato.setDateCadastro(rset.getDate("dataCadastro"));
                
                contatos.add(contato);
            }
            
        } catch (Exception e) {
        } finally {
            try {
                if (rset != null) {
                    rset.close();
                }
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }                
            } catch (SQLException e) {                
            }
        }
        return contatos;
    }
}
