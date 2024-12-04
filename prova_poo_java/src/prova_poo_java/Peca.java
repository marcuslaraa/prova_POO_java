/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova_poo_java;

public class Peca {
    private Dente bordaCima;
    private Dente bordaBaixo;
    private Dente bordaEsquerda;
    private Dente bordaDireita;

    public Peca(Dente bordaCima, Dente bordaBaixo, Dente bordaEsquerda, Dente bordaDireita) {
        this.bordaCima = bordaCima;
        this.bordaBaixo = bordaBaixo;
        this.bordaEsquerda = bordaEsquerda;
        this.bordaDireita = bordaDireita;
    }

    public Dente getBordaCima() {
        return bordaCima;
    }

    public Dente getBordaBaixo() {
        return bordaBaixo;
    }

    public Dente getBordaEsquerda() {
        return bordaEsquerda;
    }

    public Dente getBordaDireita() {
        return bordaDireita;
    }

    public boolean podeEncaixarCom(Peca outraPeca) {
        return podeEncaixarBorda(this.bordaDireita, outraPeca.bordaEsquerda) &&
               podeEncaixarBorda(this.bordaBaixo, outraPeca.bordaCima);
    }

    private boolean podeEncaixarBorda(Dente borda1, Dente borda2) {
        return borda1 != null && borda2 != null && borda1.isEncaixavel() == borda2.isEncaixavel();
    }
}
