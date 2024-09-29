import java.util.Scanner;

public class Recurrence{

    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coefficients of a quadratic equation:");

        System.out.print("a: ");
        double a = sc.nextDouble();
        System.out.print("b: ");
        double b = sc.nextDouble();
        System.out.print("c: ");
        double c = sc.nextDouble();

        double root1;
        double root2;
        double Solution;

        System.out.print("Enter value of n : ");
        int n = sc.nextInt();

        double discriminant = b * b - 4 * a * c;

        System.out.println("Equation is : " + a +"x^2" + " " + "+" + " " + b + "x" + " "+ "+" + " " + c);


        if (discriminant > 0){

            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are " + root1 + " and " + root2);

            // double c1 = (n * root2) / (root2 - root1);
            // double c2 = (n * root1) / (root1 - root2);

            System.out.println("Solution : C1(" + root1 + ")^n" + " + " + "C2(" + root2 + ")^n");
            System.out.println("");
           // System.out.println("Solution for n = " + n + " : " + " " + c1 + "(" + root1 + ")^" + n + " + " + c2 + "(" + root2 + ")^" + n );
            
        } 

        else if (discriminant == 0){

            double root = -b / (2 * a);
            System.out.println("The root is " + root);

            System.out.println("Solution : (C1 + C2 n)" + root + "^n");

        }

        else{

            System.out.println("There are no real roots.");
        }


    }
}

