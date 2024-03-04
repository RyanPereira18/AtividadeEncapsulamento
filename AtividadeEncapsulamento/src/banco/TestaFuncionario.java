/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author lucyv
 */
public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        
        f1.setNome("Laura");
        f1.setSalario(2500.00);
        f1.bonifica(150.00);
        f1.setDataEntrada("25-10-2020");
        f1.setDepartamento("TI");
        f1.setRg("12.345-28");
        
        f1.mostra();
        
        f1.demite();
        
        f1.mostra();
        
    }
}
