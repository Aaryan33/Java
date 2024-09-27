import java.util.Scanner;

public class game1{

    public static void main(String []args){

        int a = (int)(Math.random()*100);
        int g = 0;

        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Guess the number : ");
            g = sc.nextInt();

            if(g>a){

                System.out.println("Lower number please!");
            }

            else if(g==a){

                System.out.println("Congrates! You guessed the correct number");
                break;
            }
            
            else{
                System.out.println("Higher number please!");
            }


        }while(g>=0);

        System.out.println();

        System.out.println("Number guessed is : " + g);
        System.out.println(); 

    }
}