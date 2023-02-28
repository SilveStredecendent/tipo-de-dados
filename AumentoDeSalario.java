import java.util.Scanner;

public class AumentoDeSalario {

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    double SA1, SN2;
    
    System.out.println("Informe o valor do salario atual: ");
    SA1 = input.nextFloat();

    if (SA1 >= 1000 && SA1 <= 2000)
    {
        SN2 = SA1 * 1.15;
        System.out.print("Aqui esta seu salario novo: " + SN2 + "\n");
    }

    else if (SA1 >= 2000 && SA1 <= 3000)
    {
        SN2 = SA1 * 1.10;
        System.out.print("Aqui esta seu salario novo: " + SN2 + "\n");
    }

    else if(SA1 > 3000)
    {
        SN2 = SA1 * 1.5;
        System.out.print("Aqui esta seu salario novo: " + SN2 + "\n");
    }

    else if(SA1 < 1000)
    {
        System.out.print("Você é estagiário, não reclame do salário. \n");
    }


    }

    
}
