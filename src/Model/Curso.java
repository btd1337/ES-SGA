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
public class Curso {
    private String cod;
    private String nome;
    private String descricao;
    private int cargaHoraria;
    private String coordenador;
    private String tipoCurso;
    private ArrayList<Grade> gradesAtivas;
    private ArrayList<Grade> gradesInativas;

    public Curso(String cod, String nome, String descricao) {
        this.cod = cod;
        this.nome = nome;
        this.descricao = descricao;
    }

    public Curso(String cod, String nome, String descricao, int cargaHoraria, String coordenador, String tipoCurso, ArrayList<Grade> gradesAtivas, ArrayList<Grade> gradesInativas) {
        this.cod = cod;
        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.coordenador = coordenador;
        this.tipoCurso = tipoCurso;
        this.gradesAtivas = gradesAtivas;
        this.gradesInativas = gradesInativas;
    }
    
    public Curso(String cod, String nome, String descricao, int cargaHoraria, String coordenador, String tipoCurso) {
        this.cod = cod;
        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.coordenador = coordenador;
        this.tipoCurso = tipoCurso;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(String coordenador) {
        this.coordenador = coordenador;
    }

    public String getTipoCurso() {
        return tipoCurso;
    }

    public void setTipoCurso(String tipoCurso) {
        this.tipoCurso = tipoCurso;
    }

    public ArrayList<Grade> getGradesAtivas() {
        return gradesAtivas;
    }

    public void setGradesAtivas(ArrayList<Grade> gradesAtivas) {
        this.gradesAtivas = gradesAtivas;
    }

    public ArrayList<Grade> getGradesInativas() {
        return gradesInativas;
    }

    public void setGradesInativas(ArrayList<Grade> gradesInativas) {
        this.gradesInativas = gradesInativas;
    }
    
    public void addGradeAtiva(Grade novaGrade){
        gradesAtivas.add(novaGrade);
    }
    
    
    public void addGradeInativa(Grade velhaGrade){
        gradesInativas.add(velhaGrade);
    }
    
    //TODO remove grades
}
