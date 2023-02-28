import java.util.Scanner;

public class PositivosINegativos {

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    int N1;

    System.out.println("Informe um numero: ");
    N1 = input.nextInt();

    if ( N1 > 0)
    {
    System.out.print(" + Positivo + ");

    } else if ( N1 < 0){
    System.out.print(" - Negativo - ");

    }else if ( N1 == 0){
    System.out.print(" = 0 = ");
    }

    }

    
}
