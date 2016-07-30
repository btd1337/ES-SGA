/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author btd1337
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int opMenu;
        
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
        
    }

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
                criaDepartamento();
                break;
            }
            case 2 : {
                listaDepartamentos();
                break;
            }
            case 3 : {
                criaCurso();
                break;
            }
            case 4 : {
                listaCursos();
                break;
            }
            case 5 : {
                criaProfessor();
                break;
            }
            case 6 : {
                listaProfessores();
                break;
            }
            case 7 : {
                criaDisciplina();
                break;
            }
            case 8 : {
                listaDisciplinas();
                break;
            }
            case 9 : {
                criaGrade();
                break;
            }
            case 10 : {
                listaGrade();
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
    
}
