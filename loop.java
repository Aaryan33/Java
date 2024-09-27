/*import java.util.Scanner;

public class loop{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();

        for(int i=n;i>=0;i--){
            
            for(int j=0;j<i;j++){

                System.out.print(" * ");

            }

            System.out.println();
        }

    }
}*/

// sum of first even number
/*import java.util.Scanner;

public class loop{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int sum =0;

        for(int i=0;i<n;i++){
            sum = sum + 2*i;         // for odd number : sum = sum + (2*i) + 1;
        }

        System.out.println("Sum of first " + n + " even number is : " + sum);
    } 
}*/

// factorial of number
import java.util.Scanner;

public class loop{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();

        int factorial = 1;

        for(int i=1;i<=n;i++){
            
            factorial = factorial * i;
        }

        System.out.println("Factorial of " + n + " is " + factorial);
    }
}        

// array :    int [] marks = new int[3];
//            marks[0] = 9; marks[1] = 8; marks[2] = 7;