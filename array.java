import java.util.Scanner;

public class array{
    public static void main(String[] args){
        
        System.out.println("Input values for Matrix A : ");

        int [][] matrixA = new int [2][3];
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int b3 = sc.nextInt();

        matrixA[0][0] = a1;
        matrixA[0][1] = a2;
        matrixA[0][2] = a3;
        matrixA[1][0] = b1;
        matrixA[1][1] = b2;
        matrixA[1][2] = b3;

        System.out.println();

        System.out.println("matrix A : ");

        System.out.println();

        for(int i=0;i<matrixA.length;i++){

            for(int j=0;j<matrixA[i].length;j++){

                System.out.print( matrixA[i][j] );
                System.out.print(" ");
            }
            System.out.printf("\n");
        }

        System.out.println();

        System.out.println("Input values for Matrix B : ");

        int [][] matrixB = new int [3][2];
        Scanner ab = new Scanner(System.in);

        int p1 = ab.nextInt();
        int p2 = ab.nextInt();
        int p3 = ab.nextInt();
        int q1 = ab.nextInt();
        int q2 = ab.nextInt();
        int q3 = ab.nextInt();

        matrixB[0][0] = p1;
        matrixB[0][1] = p2;
        matrixB[1][0] = p3;
        matrixB[1][1] = q1;
        matrixB[2][0] = q2;
        matrixB[2][1] = q3;

        System.out.println();

        System.out.println("Matrix B : ");

        System.out.println();

        for(int i=0;i<matrixB.length;i++){
            
            for(int j=0;j<matrixB[i].length;j++){

                System.out.print( matrixB[i][j] );
                System.out.print(" ");
            
            }

            System.out.printf("\n");
        }
        System.out.println();

       int [][] matrixC = new int [2][2];

       for(int i=0;i<matrixA.length;i++){

        for(int j=0;j<matrixB[i].length;j++){

            matrixC [i][j] = matrixA[i][j] * matrixB[i][j];
        } 

    }

    System.out.println("Matrix C = Matrix A * Matrix B ");
    System.out.println();

       for(int i=0;i<matrixA.length;i++){

        for(int j=0;j<matrixB[i].length;j++){

            System.out.print(matrixC[i][j]);
            System.out.print(" ");
        }
        System.out.printf("\n");

    }

  }
}