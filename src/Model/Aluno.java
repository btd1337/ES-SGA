/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.swing.JTextField;

/**
 *
 * @author Mateus
 */
public class Aluno {
    private String nome;
    private String rg;
    private String cpf;
    private String logradouro;
    private String cep;
    private String bairro;
    private String numero;
    private String complemento;
    private String uf;
    private String matricula;
    private Curso curso;
    private String dataIngresso;
    private EstadoAluno estadoAluno;

    public Aluno(String nome, String rg, String cpf, String logradouro, String cep, String bairro, String numero, String complemento, String uf, String matricula, Curso curso, String dataIngresso) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.logradouro = logradouro;
        this.cep = cep;
        this.bairro = bairro;
        this.numero = numero;
        this.complemento = complemento;
        this.uf = uf;
        this.matricula = matricula;
        this.curso = curso;
        this.dataIngresso = dataIngresso;
        this.estadoAluno = EstadoAluno.Matriculado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso codCurso) {
        this.curso = curso;
    }

    public String getDataIngresso() {
        return dataIngresso;
    }

    public void setDataIngresso(String dataIngresso) {
        this.dataIngresso = dataIngresso;
    }

    public EstadoAluno getEstadoAluno() {
        return estadoAluno;
    }

    public void setEstadoAluno(EstadoAluno estadoAluno) {
        this.estadoAluno = estadoAluno;
    }
    
    
}

