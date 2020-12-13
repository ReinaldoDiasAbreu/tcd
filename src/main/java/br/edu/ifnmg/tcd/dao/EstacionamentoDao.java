/* 
 * Material didático destinado ao curso
 * de Programação Orientada a Objetos do 
 * Bacharelado em Ciência da Computação 
 * do IFNMG - Câmpus Montes Claros
 */
package br.edu.ifnmg.tcd.dao;

import br.edu.ifnmg.tcd.entity.Estacionamento;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;


/**
 * Operações de persistência com a entidade Estacionamento.
 *
 * @author Reinaldo Junio Dias de Abreu
 * @version 0.0.1, 13/12/2020
 */
public class EstacionamentoDao extends AbstractDao<Estacionamento, Long> {

    @Override
    public String getDeclaracaoInsert() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDeclaracaoSelectPorId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDeclaracaoSelectTodos() {
        return "SELET * FROM ESTACIONAMENTO";
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
    public void montarDeclaracao(PreparedStatement pstmt, Estacionamento o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Estacionamento extrairObjeto(ResultSet resultSet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Estacionamento> extrairObjetos(ResultSet resultSet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
