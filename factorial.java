import java.util.*;
public class factorial{

     public static void main(String []args){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int fact=1;
        int counter = 0;

        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
            counter++;
        }
        
        System.out.println("Factorial of " + num + " is " +fact);
        System.out.println("Counter is " + counter);
          
     }  
}