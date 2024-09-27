import java.util.Scanner;

public class arrays{
    public static void main(String[] args){
        
        System.out.println("Score input : ");

        int [][] score = new int [3][2];
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();

        score[0][0] = a1;
        score[0][1] = a2;
        score[1][0] = b1;
        score[1][1] = b2;
        score[2][0] = c1;
        score[2][1] = c2;

        System.out.println("Score : ");
        System.out.println();

        for(int i=0;i<score.length;i++){

            for(int j=0;j<score[i].length;j++){

                System.out.print( score[i][j] );
                System.out.print(" ");
            }
            System.out.printf("\n");
        }

        System.out.println();

        System.out.println("Enter marks for which you want to check whether it is present or not in array :");

        float [] marks = {70.0f,67.0f,79.5f,85.0f,83};
        Scanner ab = new Scanner(System.in);
        float num = ab.nextFloat();

        boolean isInArray = false;

        for(float element : marks){

            if(num == element){
                
                isInArray = true;
                break;
            }

        }
        if(isInArray){
            System.out.println("Your entered marks is present");
        }
        else{
            System.out.println("your entered marks is not present");
        }

    }
}