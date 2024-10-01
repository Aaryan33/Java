import java.util.Scanner;
import java.util.Arrays;

class string{

    public static void main(String []args){

        String name1 = "Patel";
        String name2 = "123";
        String name3 = name1 + name2;
        String name4 = "Hello World";

        System.out.println();

        System.out.println(name1 + " and " + name2 );   // Concatanation of string
        System.out.println(name3);

        System.out.println(name2.length());
        System.out.println(name1.charAt(1));
        System.out.println(name2.replace('1','4'));
        System.out.println(name4.substring(0,5));    // Substring is used to pop only wanted part of string
        System.out.println(name4.substring(6,11));   // Strings are immutable

        System.out.println();

        int marks[] = new int[3];
        boolean std[] = new boolean[2];

        marks[0] = 97;
        marks[1] = 94;
        marks[2] = 92;

        System.out.println(marks[0]);   // before sorting 
        System.out.println(marks.length);
        System.out.println(std[1]);   // default value for boolean is 'false'

        Arrays.sort(marks);
        System.out.println(marks[0]);   // after sorting

        int marks1[][] = {{97,91,93},{95,94,90}};  // 2-D Array
        System.out.println(marks1[1][2]);
        System.out.println();

        // explicit casting

        int a = 10;
        int b = a + (int)10.99;
        System.out.println(b); 

        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);

        System.out.println(Math.max(19,21));
        System.out.println(Math.min(19,21));
        System.out.println(Math.random()); // Math.random() always throws random value between 0.0 to 1.0
        System.out.println((int)(Math.random()*100));

        int x =0;
        while(true){

            if(x==1 || x==4){
                x++;
                continue;   // continue keyword
            }

            System.out.print(x);
            x++;

            if(x>6){
                break;    // break keyword
            }
        }

    }
}