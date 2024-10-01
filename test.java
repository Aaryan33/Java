import java.util.Scanner;

public class test{
    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of subjet 1 : ");
        int a = sc.nextInt();
        System.out.println("Enter marks of subjet 2 : ");
        int b = sc.nextInt();

        System.out.println("Enter credits of subjet 1 : ");
        int c = sc.nextInt();
        System.out.println("Enter credits of subjet 2 : ");
        int d = sc.nextInt();

        String grade;

        if(a>=80){
            grade = "O ";
            System.out.println("grade in sub 1 = 'O' ");}
        else if(a>=70 && a<80){
            grade = "A+ ";
            System.out.println("grade in sub 1 = 'A+' ");}
        else if(a>=60 && a<70){
            grade = "A ";
            System.out.println("grade in sub 1 = 'A' ");}
        else{
            grade = "B ";
            System.out.println("grade in sub 1 = 'B' ");

        }

    int gradepoint1 =0;
    int gradepoint2 =0;

    switch(grade){
        case "O ":
            gradepoint1 = 10;
            System.out.println("Gradepoint = " + gradepoint1);
            //System.out.println("Gradepoint = 10");
            break;

        case "A+ ":
            gradepoint1 = 9;
            System.out.println("Gradepoint = " + gradepoint1);
            //System.out.println("Gradepoint = 9");
            break;    
    
        case "A ":
            gradepoint1 = 8;
            System.out.println("Gradepoint = " + gradepoint1);
            //System.out.println("Gradepoint = 8");
            break;

        case "B ":
            gradepoint1 = 7;
            System.out.println("Gradepoint = " + gradepoint1);
            //System.out.println("Gradepoint = 7");
            break;
    }
    
    
    if(b>=80){
        grade = "O ";
        System.out.println("grade in sub 2 = 'O' ");}
    else if(b>=70 && b<80){
        grade = "A+ ";
        System.out.println("grade in sub 2 = 'A+' ");}
    else if(b>=60 && b<70){
        grade = "A ";
        System.out.println("grade in sub 2 = 'A' ");}
    else{
        grade = "B ";
        System.out.println("grade in sub 2 = 'B' ");

       }

    switch (grade){
        case "O ":
            gradepoint2 = 10;
            System.out.println("Gradepoint = " + gradepoint2);
            //System.out.println("Gradepoint = 10");
            break;

        case "A+ ":
            gradepoint2 = 9;
            System.out.println("Gradepoint = " + gradepoint2);
            //System.out.println("Gradepoint = 9");
            break;    
    
        case "A ":
            gradepoint2 = 8;
            System.out.println("Gradepoint = " + gradepoint2);
            //System.out.println("Gradepoint = 8");
            break;

        case "B ":
            gradepoint2 = 7;
            System.out.println("Gradepoint = " + gradepoint2);
            //System.out.println("Gradepoint = 7");
            break;
    }

   int SPI = ((c * gradepoint1 ) + (d * gradepoint2)) / (c+d);
   System.out.println("Your overall SPI is : " + SPI);
   
        
    }
}