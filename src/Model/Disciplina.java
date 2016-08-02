/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author btd1337
 */
public class Disciplina {

    String nome;
    String ementa;
    String bibliografia;

    public Disciplina(String nome) {
        this.nome = nome;
        ementa = null;
        bibliografia = null;
    }

    public Disciplina(String nome, String ementa, String bibliografia) {
        this.nome = nome;
        this.ementa = ementa;
        this.bibliografia = bibliografia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public String getBibliografia() {
        return bibliografia;
    }

    public void setBibliografia(String bibliografia) {
        this.bibliografia = bibliografia;
    }

}
