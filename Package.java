package collection;

class Calculator{

    void Calculate(int a, int b){
        System.out.println("Calculation : " + a+b);
    }

}

class Sc_calculator{

    void Calculate(int a, int b){
        System.out.println("Calculation : " + Math.sin(a+b));
    }

}

class Hybrid_calculator{

    void Calculate(int a, int b){
        System.out.println("Calculation : "+ a+b);
        System.out.println("Calculation : " + Math.sin(a+b));
    }    

}

public class Package{
    public static void main(String [] args){

        System.out.println("Practice set on : Package ");

        Calculator c1 = new Calculator();
        c1.Calculate(3,8);

        Sc_calculator c2 = new Sc_calculator();
        c2.Calculate(3,8);

        Hybrid_calculator c3 = new Hybrid_calculator();
        c3.Calculate(3,8);

    }

}