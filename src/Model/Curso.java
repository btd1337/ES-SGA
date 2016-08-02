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
    private Professor coordenador;
    private TipoCurso tipoCurso;
    private Departamento departamento;
    private ArrayList<Grade> gradesAtivas;
    private ArrayList<Grade> gradesInativas;

    public Curso() {

    }

    public Curso(String cod, String nome, String descricao, int cargaHoraria, Professor coordenador/*, TipoCurso tipoCurso*/, Departamento departamento) {
        this.cod = cod;
        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.coordenador = coordenador;
        // this.tipoCurso = tipoCurso;
        this.departamento = departamento;
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

    public Professor getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Professor coordenador) {
        this.coordenador = coordenador;
    }

    public TipoCurso getTipoCurso() {
        return tipoCurso;
    }

    public void setTipoCurso(TipoCurso tipoCurso) {
        this.tipoCurso = tipoCurso;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
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

    public void addGradeAtiva(Grade novaGrade) {
        gradesAtivas.add(novaGrade);
    }

    public void addGradeInativa(Grade velhaGrade) {
        gradesInativas.add(velhaGrade);
    }

    //TODO remove grades
}
