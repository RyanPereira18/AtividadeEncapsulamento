/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contasPagas;

/**
 *
 * @author lucyv
 */
public class Programa {
    public static void main(String[] args) {
        Conta co1 = new Conta();
        Produto p1 = new Produto();
        Cliente cli1 = new Cliente();
    
        Conta co2 = new Conta();
        Produto p2 = new Produto();
        Cliente cli2 = new Cliente();
    
        
        cli1.setCpf("123.456.789-10");
        cli1.setNomeCliente("Rafael");
        p1.setDescricaoProduto("Notebook Dell Inspiron 15 3000 11°");
        p1.setValorProduto(1500.89);
        co1.setCli(cli1);
        co1.setPro(p1);
        co1.setDataPagamento("03/07/2011");
        co1.setDataVencimento("05/07/2011");
        co1.setIdConta(1);
        
        cli2.setCpf("987.654.321-01");
        cli2.setNomeCliente("Gabriela");
        p2.setDescricaoProduto("TV LED 42");
        p2.setValorProduto(2545.99);
        co2.setCli(cli2);
        co2.setPro(p2);
        co2.setDataPagamento("01/07/2012");
        co2.setDataVencimento("30/06/2012");
        co2.setIdConta(2);
        
        co1.visualizarConta();
        System.out.println("");
        co2.visualizarConta();
    }
}
