package edu.matheus.segundasemana.tiposexcepcionais;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

//Excessões no JAVA.
//java.lang.NullPointerException: Quando tentamos obter alguma informação de uma variável nula.
//java.lang.ArithmeticExcepiton: Quando tentamos dividir um valor por zero.
//java.sql.SQLException: Quando existe algum erro relacionado a interação com banco de dados.
//java.io.FileNotFoundException: Quando tentamos ler ou escrever em uma arquivo que não existe.

//try: dispara o erro.
//catch: captura o erro.
//finally: opicional.

//Hierarquia de Exceções:
//Checked and Unchecked Exceptions

public class SobreMim {
    public static void main(String[] args) {
        
            try{

            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Digite seu nome: ");
            String nome = scanner.next();
        
            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.next();
        
            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();
        
            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();
        
        
            System.out.println("Opa, me chamo " + nome + " " + sobrenome);
            System.out.println("Tenho " + idade + "anos ");
            System.out.println("Minha altura é " + altura + "cm ");
        }
        catch(InputMismatchException e){
            System.out.println("ALERTA: Os campos idade e altura precisam ser numéricos.");
        }
    }
}
