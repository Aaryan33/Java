class callref{

    int a;
    int b;

    void swapfun(callref t1){
        int t = t1.a;
        t1.a = t1.b;
        t1.b = t;
    }

    void setData(int a,int b){
        this.a = a;
        this.b = b;
    }
    void printData(){
        System.out.println(a);
        System.out.println(b);
    }

}

class swap{
    public static void main(String[]args){
        callref c = new callref();
        //c.a =
        //c.b = 
        c.setData(5,10);
        System.out.println("Before Swapping value ");
        c.printData();

        c.swapfun(c);
        System.out.println("After Swapping value ");
        c.printData();
    }
}
