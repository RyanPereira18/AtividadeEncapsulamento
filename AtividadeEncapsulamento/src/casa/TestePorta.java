/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa;

/**
 *
 * @author lucyv
 */
public class TestePorta {
    public static void main(String[] args) {
        Porta p1 = new Porta("Vermelho", 120, 250, 50);
        
        p1.fecha();
        p1.abre();
        p1.fecha();
        
        p1.getCor();
        p1.setCor("Azul");
        p1.getCor();
        p1.setCor("Amarelo");
        p1.getCor();
        
        System.out.println("Dimensao Y da porta: " + p1.getDimensaoY());
        p1.setDimensaoY(300);
        System.out.println("Dimensao Y da porta: " + p1.getDimensaoY());
        System.out.println("Dimensao X da porta: " + p1.getDimensaoX());
        p1.setDimensaoX(150);
        System.out.println("Dimensao Y da porta: " + p1.getDimensaoX());
        
        p1.estaAberta();
    }
}