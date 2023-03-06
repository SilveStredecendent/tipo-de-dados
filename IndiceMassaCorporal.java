import java.util.Scanner;

public class IndiceMassaCorporal {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double PS1, AL2, IMC;
        
        System.out.println("Informe seu pesso: ");
        PS1 = input.nextFloat();

        System.out.println("Informe sua altura: ");
        AL2 = input.nextFloat();

        IMC = PS1 / (AL2 * AL2)  ;

        if (IMC <= 18.5)
        {
            System.out.print("Seu IMC é " + IMC + ", ele ébaixo do peso normal ! \n");
        }
    
        else if (IMC > 18.5  && IMC <= 24.9)
        {
            System.out.print("Seu IMC é " + IMC + ", seu peso é normal ! \n");
        }
    
        else if(IMC > 25.0  && IMC <= 29.9)
        {
            System.out.print("Seu IMC é " + IMC + ", você tem excesso de peso \n");
        }
    
        else if(IMC > 30.0  && IMC <= 34.9)
        {
            System.out.print("Seu IMC é " + IMC + ", você tem besidade classe I \n");
        }

        else if(IMC > 35.0  && IMC <= 39.9)
        {
            System.out.print("Seu IMC é " + IMC + ", você tem besidade classe II \n");
        }

        else if(IMC > 40.0)
        {
            System.out.print("Seu IMC é " + IMC + ", você tem besidade classe III \n");
        }
    
    }
    
    
}
