import java.util.Scanner;

/*public class reversearray{
    public static void main(String[] args){

        int [] array = {23,44,54,65,76,87};
        int l = array.length;
        int n = Math.floorDiv(array.length,2);
        int temp;
        int max =0;
        int min =100;

        for(int i=0;i<n;i++){

            temp = array[i];
            array[i] = array[l-i-1];
            array[l-i-1] = temp;

        }

        for(int element:array){
   
            System.out.print( element + " ");

        }
        System.out.println();

        for(int element:array){
            if(element>max){
                max = element;
            }
        }
        System.out.println("maximum element is : " + max);

        for(int element:array){
            if(element<min){
                min = element;
            }
        }
        System.out.println("minimum element is : " + min);
        
    }
}*/


// factorial,multiplication table  of a number :
public class reversearray{

    static int factorial(int n){
        
        if(n == 0 || n == 1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
    
    static void multiplication(int n){
        for(int i =1;i<=10;i++){
            
            System.out.printf("%d x %d = %d \n",n,i,n*i);
        }
        
    }

    static int fibonacci(int m){

        if(m == 1){
            return 0;
        }
        else if(m == 2){
            return 1;
        }
        else{
            return fibonacci(m-1) + fibonacci(m-2);
        }
    }

    public static void main(String[] args){

        Scanner ab = new Scanner(System.in);

        System.out.println("Enter a number for which you want factorial : ");
        int p = ab.nextInt();
        System.out.println("Factorial of " + p + " is " + factorial(p));

        System.out.println();

        System.out.println("Enter a number for which you want multiplicatin table : ");
        int q = ab.nextInt();

        System.out.println("Multiplication table of " + q );
        multiplication(q);

        System.out.println();
        
        // '*' pattern:

        Scanner pq = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = pq.nextInt();

        for(int i=n;i>=0;i--){
            
            for(int j=0;j<i;j++){

                System.out.print(" * ");

            }

            System.out.println();
        }

        System.out.println("Enter a number");
        Scanner xy = new Scanner(System.in);
        int r = xy.nextInt();

        System.out.println(r + " term of Fibonacci series is " + fibonacci(r));

    }
}