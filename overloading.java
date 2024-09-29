// Question - 12:
// Write a Java Program to find area of Geometric figures using method Overloading.

import java.util.Scanner;

class shapearea{

    static int area(int l){
        return l*l;
    }
    static double area(double a,double b){
        return a*b;
    }
    static float area(float p,float q,float h ){
       return (p+q) * h / 2 ;
    
    }
}

class overloading{

    public static void main(String[]args){

        System.out.println("Enter the length of square : ");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.println("l = " + m);

        System.out.println("Area of Square is : " + shapearea.area(m,m));
        //System.out.println(shapearea.area(3,3));
        System.out.println();

        System.out.println("Enter the length of Rectangle : ");
        double n = sc.nextDouble();
        System.out.println("Enter the width of Rectangle : ");
        double o = sc.nextDouble();

        System.out.println("a = " + n);
        System.out.println("b = " + o);

        System.out.println("Area of Rectangle is : " + shapearea.area(n,o));
        //System.out.println(shapearea.area(3.33,3.44));
        System.out.println();

        System.out.println("Enter the  length of base1 of Trapezoid : ");
        float x = sc.nextFloat();
        System.out.println("Enter the  length of base2 of Trapezoid : ");
        float y = sc.nextFloat();
        System.out.println("Enter the  height of Trapezoid : ");
        float z = sc.nextFloat();

        System.out.println("p = " + x);
        System.out.println("q = " + y);
        System.out.println("h = " + z);

        System.out.println("Area of Trapezoid is : " + shapearea.area(x,y,z));
        //System.out.println(shapearea.area(3.1f,3.2f));

    }
}