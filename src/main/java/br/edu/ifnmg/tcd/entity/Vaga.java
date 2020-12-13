package br.edu.ifnmg.tcd.entity;

public class Vaga {

    private Boolean disponivel;

    private Integer id;

    public void Vaga() {

    }

    public Vaga(Integer id, Boolean disponivel) {
        this.id = id;
        this.disponivel = disponivel;
    }

    /**
     * Torna a vaga disponivel.
     *
     * @return O Boolean da vaga.
     */
    public Boolean liberoVaga() {
        this.disponivel = true;
        return disponivel;
    }

    /**
     * Torna a vaga ocupada
     *
     * @return Boolean da vaga
     */
    public Boolean ocupaVaga() {
        this.disponivel = false;
        return false;
    }

    /**
     * Getters e Setters dos atributos da classe
     *
     * @return
     */
//<editor-fold defaultstate="collapsed" desc="Get/Set">
    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
//</editor-fold>

    @Override
    public String toString() {
        return "Vaga{" + "disponivel=" + disponivel + ", id=" + id + '}';
    }
}
