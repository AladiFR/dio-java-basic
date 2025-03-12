package edu.matheus.primeirasemana.escopos;

public class Conta {
     
    //variavel da classe conta
    double saldo = 10.0;

    public void sacar (Double valor){
        //variavel local de método
        double novoSaldo = saldo - valor;
    }
    public void imprimirSaldo(){
        //disponível em toda classe
        System.out.println(saldo);

        //somente o método "sacar()" conhece esta variável 
        //System.out.println(novoSaldo);
    }
    public double calcularDividaExponencial(){
        //variável local de método
        double valorParcela = 50.0;
        double valorMontante = 0.0;
        
        for(int i = 1; i <= 5; i++){
            //variável "i" sendo o escopo de fluxo
            double valorCalculado = valorParcela * i;
            valorMontante = valorMontante + valorCalculado;
        }

        return valorMontante;
    }
}
