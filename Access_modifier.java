class C1{

    int a = 43;
    public int b = 62;
    protected int c = 31;
    private int d = 78;

    public void show(){

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}

public class Access_modifier{

    public static void main(String[]args){

        C1 c = new C1();
        c.show();
        // System.out.println(c.a);
        // System.out.println(c.b);
        // System.out.println(c.c);
        // System.out.println(c.d);    // error generates due to private variable 

    }
}