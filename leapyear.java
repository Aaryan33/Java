import java.util.Scanner;

public class leapyear{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year:");
        int year = sc.nextInt();

        if(year % 4 ==0 ){
            System.out.println("Year" + year +"is leap year");

        }
        else{
            System.out.println("Year" + year +"is not a leap year");
        }
    }
}