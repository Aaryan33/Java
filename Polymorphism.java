class Oops{

    String name;
    int age;

    void info(String name){
        System.out.println(name);
    }

    void info(int age){
        System.out.println(age);
    }

    void info(String name,int age){
        System.out.println(name + " " + age);
    }

}

public class polymorphism{

    public static void main(String[] args){

        Oops o1 = new Oops();

        o1.name = "Patel";
        o1.age = 20;
        
        o1.info(o1.name);
        o1.info(o1.name, o1.age);
    }
}