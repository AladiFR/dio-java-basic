package edu.matheus.segundasemana.tiposrepeticao;

public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <= 5; numero++){
            if(numero == 3){
                continue;//Muda o fluxo, o 3 é lido mas não imprimido.
                        //No break ele corta antes de imprimir o valor.
            }
            System.out.println(numero);
        }
    }
}
