import java.util.Scanner;
import java.util.Random;

public class game{

    public static void main(String[] args){

        System.out.println("Enter 0 for rock, 1 for scissor and 2 for paper ");
        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();

        /*switch(user >= 3){
            case 1: 
                System.out.println("Error!");
                break;
        }*/

        if(user>=3){
            System.out.println("Error!");
            
        }

        System.out.println("You entered : " + user);

        Random r = new Random();
        int com = r.nextInt(3);
        System.out.println("Computer entered : " + com);

        if(user == com){

            System.out.println("Draw!");
        }

        else if(user == 0 && com == 1 || user == 1 && com == 2 || user == 2 && com == 0){

            System.out.println("You Win!");
        }

        else{

            System.out.println("Computer win!");
        }


    }
}