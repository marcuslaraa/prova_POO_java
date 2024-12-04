/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prova_poo_java;

public class Prova_poo_java {
    public static void main(String[] args) {
        Dente d1 = new Dente(true);
        Dente d2 = new Dente(false);
        Dente d3 = new Dente(true);
        Dente d4 = new Dente(false);
        Dente d5 = new Dente(true);
        Dente d6 = new Dente(false);
        Dente d7 = new Dente(true);
        Dente d8 = new Dente(false);

        Peca peca1 = new Peca(d1, d2, d3, d4);
        Peca peca2 = new Peca(d3, d1, d4, d2);
        Peca peca3 = new Peca(d5, d6, d7, d8);
        Peca peca4 = new Peca(d6, d7, d8, d5);
        Peca peca5 = new Peca(d1, d3, d2, d7);

        QuebraCabeca quebraCabeca = new QuebraCabeca();
        quebraCabeca.adicionarPeca(peca1);
        quebraCabeca.adicionarPeca(peca2);
        quebraCabeca.adicionarPeca(peca3);
        quebraCabeca.adicionarPeca(peca4);
        quebraCabeca.adicionarPeca(peca5);

        System.out.println("Tentando encaixar as peças:");
        quebraCabeca.encaixarPecas();
        
        System.out.println("\nTentando encaixar a Peça 1 com a Peça 3:");
        verificarEncaixe(peca1, peca3);
       
        System.out.println("\nTentando encaixar a Peça 2 com a Peça 5:");
        verificarEncaixe(peca2, peca5);
    }

    private static void verificarEncaixe(Peca peca1, Peca peca2) {
        if (peca1.podeEncaixarCom(peca2)) {
            System.out.println("A Peça 1 pode encaixar com a Peça 2.");
        } else {
            System.out.println("A Peça 1 NÃO pode encaixar com a Peça 2.");
        }
    }
}
