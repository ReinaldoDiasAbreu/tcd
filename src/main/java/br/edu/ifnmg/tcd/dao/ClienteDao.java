/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tcd.dao;

import br.edu.ifnmg.tcd.entity.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author reinaldo
 */
public class ClienteDao extends AbstractDao<Cliente, Long> {

    @Override
    public String getDeclaracaoInsert() {
        return "INSERT INTO  CLIENTE(id, cpf, nome, telefone, endereco, placa, modelo fabricante, cor) VALUES (default, ?, ?, ?, ?, ?, ?, ?, ?)";
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
