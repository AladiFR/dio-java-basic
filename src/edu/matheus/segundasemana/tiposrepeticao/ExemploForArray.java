package edu.matheus.segundasemana.tiposrepeticao;

public class ExemploForArray {
    public static void main(String[] args) {
        /*indice em arrays sempre começa em 0.

        String alunos[] = {"Felipe", "Jonas", "Julia", "Marcos"};

        for(int i = 0; i < alunos.length; i ++){//length = tamanho. Se "i menor que o tamanho dos alunos". 
            System.out.println("O aluno no indice i = " + i + " é " + alunos[i]);
        }
        */

        String alunos[] = {"Felipe", "Jonas", "Julia", "Marcos"};

        for(String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }


    }   
}
