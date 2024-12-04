/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova_poo_java;

import java.util.ArrayList;
import java.util.List;

public class QuebraCabeca {
    private List<Peca> pecas;
    private EspacoVazio espaco;

    public QuebraCabeca() {
        this.pecas = new ArrayList<>();
        this.espaco = new EspacoVazio(true);
    }

    public void adicionarPeca(Peca peca) {
        pecas.add(peca);
    }

    public void encaixarPecas() {
        for (int i = 0; i < pecas.size() - 1; i++) {
            for (int j = i + 1; j < pecas.size(); j++) {
                Peca peca1 = pecas.get(i);
                Peca peca2 = pecas.get(j);
                
                if (peca1.podeEncaixarCom(peca2)) {
                    System.out.println("Peça " + i + " encaixa com a peça " + j);
                } else {
                    System.out.println("Não é possível encaixar a peça " + i + " com a peça " + j);
                }
            }
        }
    }
}

