package edu.matheus.primeirasemana.operadores;

public class Operadores {
    public static void main(String[] args) {
        //Operador soma (concatenar palavras)
        String nomeCompleto = "Linguagem " + "Java";
        System.out.println(nomeCompleto);
        
        //Operador negativo e positivo
        int numero = 4;
        System.out.println(numero);

        numero = - numero;
        System.out.println(numero);

        numero = numero * -1;
        System.out.println(numero);

        //repetição
        numero = 5;

        //numero = numero + 1:
        numero++;
        System.out.println(numero);
        System.out.println(++ numero);

        //numero = numero - 1:
        numero--;
        System.out.println(numero);
        System.out.println(-- numero);

        //true e false:
        boolean variavel = true;
        System.out.println(!variavel);//a variavel se torna falsa apenas nessa linha de comando
        System.out.println(variavel);

        //invertendo:
        variavel = !variavel;//fica falso

        //Operador ternário, true ou false:], sendo útil para string ou inteiro:
        int a, b;
        a = 5;
        b = 6;

        /*String resultado = a == b ?"verdadeiro" : "falso";
        int resultado = a == b ? 1 : 0;
        utilizando ?"" : ""; para conferir verdadeiro ou falso

        if(a == b){
            resultado = "verdadeiro";
        } else {
            resultado = "falso";
        }

        System.out.println(resultado);*/

        //para comparar objetos no java usamos o ".equals":
        String nome1 = "Matheus";//objeto1
        String nome2 = "Matheus";//objeto2
        System.out.println(nome1.equals(nome2));

        //comparação inteiros:
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2){
            System.out.println("A nossa condição é verdadeira");
        } 

        System.out.println("numero1 é igual a numero2? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numero1 é diferente do numero2? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numero1 é maior que o numero2? " + simNao);

        //&& (e); || (ou);
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && ( 7 > 4)){
            System.out.println("As duas são verdadeiras");
        } 
        if(condicao1 || condicao2){
            System.out.println("uma das condições é verdadeira");
        }

        System.out.println("fim");

    }
}
