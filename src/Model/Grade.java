/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author btd1337
 */
public class Grade {
    int ano;
    Curso curso;
    ArrayList<Disciplina> disciplinasObrigatorias;
    boolean ativa;

    public Grade(int ano, Curso curso) {
        this.ano = ano;
        this.curso = curso;
    }

    public Grade(int ano, Curso curso, ArrayList<Disciplina> disciplinasObrigatorias, boolean isAtiva) {
        this.ano = ano;
        this.curso = curso;
        this.disciplinasObrigatorias = disciplinasObrigatorias;
        this.ativa = isAtiva;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public ArrayList<Disciplina> getDisciplinasObrigatorias() {
        return disciplinasObrigatorias;
    }

    public void setDisciplinasObrigatorias(ArrayList<Disciplina> disciplinasObrigatorias) {
        this.disciplinasObrigatorias = disciplinasObrigatorias;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setIsAtiva(boolean ativa) {
        this.ativa = ativa;
    }
    
    
}
