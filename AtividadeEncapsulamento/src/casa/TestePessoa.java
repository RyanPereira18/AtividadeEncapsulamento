/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa;

import java.util.Scanner;

/**
 *
 * @author lucyv
 */
public class TestePessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Insira o nome: ");
        p1.setNome(entrada.nextLine());
        System.out.println("Insira a idade: ");
        p1.setIdade(entrada.nextInt());
        
        p1.fazAniversario();
        System.out.println("Feliz aniversario, " + p1.getNome() + "!");
        p1.fazAniversario();
        System.out.println("Feliz aniversario, " + p1.getNome() + "!");
        
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());
    }
}
