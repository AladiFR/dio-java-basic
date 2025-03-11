package edu.matheus.primeirasemana;

public class MyClass {
    
// main = executável
public static void main(String [] args) {
    String primeiroNome = "Matheus";
    String segundoNome = "Luiz Rocha";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

    System.out.println(nomeCompleto);
}

//médodos:
//TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)

public static String nomeCompleto (String primeiroNome, String segundoNome){
    return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
}

} 


