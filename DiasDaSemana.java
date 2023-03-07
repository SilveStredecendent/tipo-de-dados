import java.util.Scanner;
public class DiasDaSemana {
        public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int semana;
        
        System.out.println("Informe o número referente ao dia da semana");
        semana = input.nextInt();
        
        if (semana == 1)
        {
            System.out.printf( + semana + ", o dia da semana correspondente a Domingo \n");
        }
    
        else if (semana == 2)
        {
            System.out.printf( + semana + ", o dia da semana correspondente a Segunda-feira. \n");
        }
    
        else if(semana == 3)
        {
            System.out.printf( + semana + ", o dia da semana correspondente a Terça-feira. \n");
        }
    
        else if(semana == 4)
        {
            System.out.printf( + semana + ", o dia da semana correspondente a Quarta-feira. \n");
        }

        else if(semana == 5)
        {
            System.out.printf( + semana + ", o dia da semana correspondente a Quinta-feira. \n");
        }

        else if(semana == 6)
        {
            System.out.printf( + semana + ", o dia da semana correspondente a Sexta-feira. \n");
        }

        else if(semana == 7)
        {
            System.out.printf( + semana + ", o dia da semana correspondente a Sábado. \n");
        }

        else(semana < 1 && semana > 7)
        {
            System.out.printf( + semana + ", não corresponde a nada. \n");
        }
    
    }
}
