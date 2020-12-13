/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tcd.dao;

import br.edu.ifnmg.tcd.entity.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author reinaldo
 */
public class ClienteDao extends AbstractDao<Cliente, Long> {

    @Override
    public String getDeclaracaoInsert() {
        return "INSERT INTO cliente(id, cpf, nome, telefone, endereco, placa, modelo fabricante, cor) VALUES (default, ?, ?, ?, ?, ?, ?, ?, ?);";
    }
    @Override
    public String getDeclaracaoSelectPorId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDeclaracaoSelectTodos() {
        return "SELET * FROM CLIENTE";
    }

    @Override
    public String getDeclaracaoUpdate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDeclaracaoDelete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ajustarIdDeclaracao(PreparedStatement pstmt, Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void montarDeclaracao(PreparedStatement pstmt, Cliente o) {
        try {
            if (o.getId() == null || o.getId() == 0) {
                pstmt.setString(1, o.getCpf());
                pstmt.setString(2, o.getNome());
                pstmt.setString(3, o.getTelefone());
                pstmt.setString(4, o.getEndereco());
                pstmt.setString(5, o.getPlaca());
                pstmt.setString(6, o.getModelo());
                pstmt.setString(7, o.getFabricante());
                pstmt.setString(8, o.getCor());
            } else {
                pstmt.setLong(1, o.getId());
                pstmt.setString(2, o.getCpf());
                pstmt.setString(3, o.getNome());
                pstmt.setString(4, o.getTelefone());
                pstmt.setString(5, o.getEndereco());
                pstmt.setString(6, o.getPlaca());
                pstmt.setString(7, o.getModelo());
                pstmt.setString(8, o.getFabricante());
                pstmt.setString(9, o.getCor());
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Cliente extrairObjeto(ResultSet resultSet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cliente> extrairObjetos(ResultSet resultSet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
