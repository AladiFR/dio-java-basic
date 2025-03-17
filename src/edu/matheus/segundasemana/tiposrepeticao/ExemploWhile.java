package edu.matheus.segundasemana.tiposrepeticao;

import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0){
            double valorDoces = valorAleatorio();
            if(valorDoces > mesada){
                valorDoces = mesada;
            }
            System.out.println("Doce do valor: R$" + valorDoces + " Adicionado no carrinho");

            mesada = mesada - valorDoces;
        }
        System.out.println("Mesada: R$" + mesada);
        System.out.println("Gastou toda sua mesada em doces.");
    }

    
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }

}