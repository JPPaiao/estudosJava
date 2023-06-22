/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.agenda.app;

import com.mycompany.dao.ContatoDAO;
import com.mycompany.model.Contato;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author USUARIO
 */
public class app {
    public static void main(String[] args) throws SQLException {
        ContatoDAO contatoDAO = new ContatoDAO();
        
        Contato contato = new Contato();
        contato.setNome("Marcos Vinicius");
        contato.setIdade(18);
        contato.setDateCadastro(new Date());
        
        // contatoDAO.save(contato);
        
        Contato cont = new Contato();
        cont.setId(2);
        cont.setNome("José Gustavo");
        cont.setIdade(50);
        cont.setDateCadastro(new Date());
        
        // contatoDAO.update(cont);
        
        contatoDAO.deleteByID(4);
        
        for (Contato c: contatoDAO.getContatos()) {
            System.out.println("Contato: " + c.getNome());        
        }
        
    }
}
