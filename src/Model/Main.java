/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.JPanel;
import java.io.BufferedReader;
import java.io.FileReader;
/**
 *
 * @author btd1337
 */

public class Main {

    /**
     *
     */
    public static ArrayList< Departamento > ListadeDepartamentos = new ArrayList<>();
    public static ArrayList< Professor > ListadeProfessores = new ArrayList<>();
    public static ArrayList< Turma > listaTurmas=new ArrayList<>();
    public static ArrayList< Aluno > ListadeAlunos = new ArrayList<>();
    public static ArrayList< Disciplina > ListadeDisciplina = new ArrayList<>();
    public static ArrayList< Curso > ListadeCursos = new ArrayList<>();
    public static ArrayList< Grade > ListadeGrades = new ArrayList<>();
    public static CadastroDepartamento telaCadastroDepartamento = new CadastroDepartamento();
    public static CadastroProfessor telaCadastroProfessor = new CadastroProfessor();
    public static CadastroDisciplina telaCadastrDisciplina = new CadastroDisciplina();
    public static CadastroCurso telaCadastroCurso = new CadastroCurso();
    public static CadastroGrade telaCadastroGrade = new CadastroGrade();
    public static CadastroAluno telaCadastroAluno = new CadastroAluno();
    public static CadastroTurma telaCadastroTurma = new CadastroTurma();
    public static MatricularAlunos telaMatriculaAlunos = new MatricularAlunos();
    
     
     public static TelaMenu telaMenu = new TelaMenu();
     public static int opMenu;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        criaAlguns();
        telaMenu.setVisible(true);
        
        /*
        Scanner scanner = new Scanner(System.in);
        
       
        do{
            exibeMenu();
            try{
                opMenu = scanner.nextInt();
                getOpcaoEscolhida(opMenu);
            }catch(InputMismatchException ex){
                System.out.println("Valor inválido!");
                opMenu = -1;
            }
            
        }while(opMenu != 0);
        */
    }
   private static void criaAlguns(){
       Departamento dep=new Departamento("525","Departamento 1", "Nenhuma");
       ListadeDepartamentos.add(dep);
       Departamento dep2=new Departamento("535","Departamento 2", "Nenhuma");
        ListadeDepartamentos.add(dep2);
        Departamento dep3=new Departamento("755","Departamento 3", "Nenhuma");
         ListadeDepartamentos.add(dep3);
         Departamento dep4=new Departamento("545","Departamento 4", "Nenhuma");
          ListadeDepartamentos.add(dep4);
          Departamento dep5=new Departamento("560","Departamento 5", "Nenhuma");
           ListadeDepartamentos.add(dep5);
       Professor p1=new Professor("professor 1"," rg1", 4194184);
       ListadeProfessores.add(p1);
       Professor p2=new Professor("professor 2"," rg2", 41184);
       ListadeProfessores.add(p2);
       Professor p3=new Professor("professor 3"," rg3", 4194);
       ListadeProfessores.add(p3);
       Professor p4=new Professor("professor 4"," rg4", 41);
        ListadeProfessores.add(p3);
       Professor p5=new Professor("professor 4"," rg5", 4184);
       ListadeProfessores.add(p5);
       Curso c1=new Curso("741", "Curso 1", "nenhuma", 48948,p1,dep);
       ListadeCursos.add(c1);
       Curso c2=new Curso("742", "Curso 2", "nenhuma", 48948,p1,dep);
       ListadeCursos.add(c2);
       Curso c3=new Curso("743", "Curso 3", "nenhuma", 48948,p1,dep);
       ListadeCursos.add(c3);
       Curso c4=new Curso("744", "Curso 4", "nenhuma", 48948,p1,dep);
       ListadeCursos.add(c4);
       Curso c5=new Curso("745", "Curso 5", "nenhuma", 48948,p1,dep);
       ListadeCursos.add(c5);
       Aluno a1=new Aluno("aluno 1","rg1", "cpf1", "logradouro 1", "cep 1"," bairro 1", "numero 1", "complemento 1", "uf 1", "matricula 1",c1 , "dataIngresso 1");
       ListadeAlunos.add(a1);
        Aluno a2=new Aluno("aluno 2","rg2", "cpf2", "logradouro 2", "cep 2"," bairro 2", "numero 2", "complemento 2", "uf 2", "matricula 2",c2 , "dataIngresso 2");
       ListadeAlunos.add(a2);
        Aluno a3=new Aluno("aluno 3","rg3", "cpf2", "logradouro 3", "cep 3"," bairro 3", "numero 3", "complemento 3", "uf 1", "matricula 3",c3 , "dataIngresso 3");
       ListadeAlunos.add(a3);
        Aluno a4=new Aluno("aluno 4","rg4", "cpf3", "logradouro 4", "cep 4"," bairro 4", "numero 4", "complemento 4", "uf 1", "matricula 4",c4 , "dataIngresso 4");
       ListadeAlunos.add(a4);
        Aluno a5=new Aluno("aluno 5","rg5", "cpf4", "logradouro 5", "cep 5"," bairro 5", "numero 5", "complemento 5", "uf 1", "matricula 5",c5 , "dataIngresso 5");
       ListadeAlunos.add(a5);
        
       
   }
    /*
    private static void exibeMenu() {
         System.out.println("1 - Criar Departamento");
         System.out.println("2 - Listar Departamentos");
         System.out.println("3 - Criar Curso");
         System.out.println("4 - Listar Cursos");
         System.out.println("5 - Criar Professor");
         System.out.println("6 - Listar Professores");
         System.out.println("0 - Sair");
         System.out.print("Op: ");
    }

    private static void getOpcaoEscolhida(int opMenu) {
        switch(opMenu){
            case 1 : {
                telaCadastroDepartamento.setVisible(true);
             
                        
               // criaDepartamento();
                break;
            }
            case 2 : {
               // listaDepartamentos();
                break;
            }
            case 3 : {
               // criaCurso();
                break;
            }
            case 4 : {
                //listaCursos();
                break;
            }
            case 5 : {
             
                break;
            }
            case 6 : {
               // listaProfessores();
                break;
            }
            case 7 : {
               // criaDisciplina();
                break;
            }
            case 8 : {
                //listaDisciplinas();
                break;
            }
            case 9 : {
                //criaGrade();
                break;
            }
            case 10 : {
                //listaGrade();
                break;
            }
            case 0 : {
                System.out.println("\nSistema Encerrado!");
                break;
            }
            default:{
                System.out.println("Opção Inválida");
            }
        }
    }
    */
}
