public class ResultadoEscolar {
    public static void main(String[] args){
    
    /*int nota = 5;
    if(nota >= 7)
    System.out.println("Aprovado");

    else if (nota >= 5 && nota < 7)
    System.out.println("Prova de recuperação");

    else if (nota >= 2 && nota < 5)
    System.out.println("Prova de recuperação avançada");

    else
    System.out.println("Reprovado");
    */

    /*int nota = 5;

    String resultado = nota >=7 ? "Aprovado" : "Reprovado";

    System.out.println(resultado);
    }
    */

    int nota = 6;

    String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";

    System.out.println(resultado);
    }
}
