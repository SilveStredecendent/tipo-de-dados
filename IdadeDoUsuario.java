import java.util.Scanner;

public class IdadeDoUsuario {

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    int I1;
    String nome;

    System.out.println("Digite seu nome: ");
    nome = input.next();

    System.out.println("Informe a sua idade: ");
    I1 = input.nextInt();

    
    if (I1 >= 0 && I1 <= 12)
    {
    System.out.print("Olá " + nome + ",sua faixa etária se encontra entre 0 a 12 anos: Criança");

    } else if (I1 >= 13 && I1 <= 17) {
    System.out.print("Olá " + nome + ",sua faixa etária se encontra entre 13 a 17 anos: Adolescente");

    } else if (I1 >= 18 && I1 <= 59) {
    System.out.print("Olá " + nome + ",sua faixa etária se encontra entre 18 a 59 anos: Adulto ");

    } else if (I1 >= 60) {
    System.out.print("Mais de 60: Idoso \n");
    }

    else if (I1 <= 0) {
    System.out.print("ERRO \n");
    }
    
    }

    
}
