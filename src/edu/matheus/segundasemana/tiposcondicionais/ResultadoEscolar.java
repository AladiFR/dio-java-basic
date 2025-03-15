package edu.matheus.segundasemana.tiposcondicionais;

/*Estrutura Condicional Composta:
public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;

        if(nota >= 7){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reporvado");
        }
    }
} 
*/

/*Estrutura Condicional Encadeada: (Mais de 3 condições) 
public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;

        if(nota >= 7){
            System.out.println("Aprovado");
        } else if(nota >= 5 && nota < 7) {
           System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    } 
}
*/

//Estrutura Condicional Ternária:
public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);
    } 
}
