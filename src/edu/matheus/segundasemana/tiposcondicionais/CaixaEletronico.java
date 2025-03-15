package edu.matheus.segundasemana.tiposcondicionais;

//Estrutura Condicional Simples:
public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicidado = 25.0;
        
        if(valorSolicidado < saldo){
            saldo = saldo - valorSolicidado;
        } 
        System.out.println(saldo);
    }
}
