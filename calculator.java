// Question - 13:
// Write a program in Java to create a simple scientific calculator using Math Class.

import java.util.Scanner;
class calculator{
    public static void main(String[] args){

        double n1;
        double n2;
        double ans;
        char c;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();

        System.out.println("Enter an operator : ( + , - , * , / ): ");
        c = sc.next().charAt(0);

        switch(c){
            case '+':
            ans = n1 + n2;
                break;

            case '-':
            ans = n1 - n2;
                break;
            case '*':
            ans = n1 * n2;
                break;
            case '/':
            ans = n1 / n2;
                break;

            default :
            System.out.println("Error! Please, Enter correct operator ");
            return;
        }

        System.out.println("The result is given as follows");
        System.out.printf(n1 + " " + c + " " + n2 + " = " + ans);

    }
}
