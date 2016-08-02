/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author luisf
 */
class Turma {
    Disciplina disciplina;
    String descricao;
    Curso curso;
    ArrayList<Aluno> alunosMatriculados;
    Professor profResponsavel;
    String ano;
    String semestre;
    int numMaxAlunos;
    String sala;
    public Turma(Disciplina disc,String descricao,Curso curso,Professor prof,String ano,String semestre,int numMax,String sala)
    {
        this.disciplina=disc;
        this.descricao=descricao;
        this.curso=curso;
        this.profResponsavel=prof;
        this.ano=ano;
        this.semestre=semestre;
        this.numMaxAlunos=numMax;
        this.sala=sala;
        alunosMatriculados=new ArrayList<>();
    }
    public void matricularAluno(Aluno aluno){
        if(!alunosMatriculados.contains(aluno))
            alunosMatriculados.add(aluno);
    }
    public Disciplina getDisciplina() {
        return disciplina;
    }

    public String getDescricao() {
        return descricao;
    }

    public Curso getCurso() {
        return curso;
    }

    public ArrayList<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public Professor getProfResponsavel() {
        return profResponsavel;
    }

    public String getAno() {
        return ano;
    }

    public String getSemestre() {
        return semestre;
    }

    public int getNumMaxAlunos() {
        return numMaxAlunos;
    }

    public String getSala() {
        return sala;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void setAlunosMatriculados(ArrayList<Aluno> alunosMatriculados) {
        this.alunosMatriculados = alunosMatriculados;
    }

    public void setProfResponsavel(Professor profResponsavel) {
        this.profResponsavel = profResponsavel;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public void setNumMaxAlunos(int numMaxAlunos) {
        this.numMaxAlunos = numMaxAlunos;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
    
}
