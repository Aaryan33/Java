import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int sum = 0;
        int counter = 0;
        int numOfDigits = String.valueOf(num).length();
        
        while(num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numOfDigits);
            num /= 10;
            counter++;
        }
        
        if(sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number");
        } 
	else {
            System.out.println(originalNum + " is not an Armstrong number");
        }

        System.out.println("Counter is " + counter);
    }
}
