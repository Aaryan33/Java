import java.util.Scanner;

class Course{

    int coursecode; 
    String coursename;
    Double marks;

    Course(int coursecode,String coursename,double marks){

        coursecode = coursecode;
        coursename = coursename;
        marks = marks;

    }

    Course(Course c){

        coursecode = c.coursecode;
        coursename =c.coursename;
        marks = c.marks;
    }

    Course(Course [] c){

        for(int i=0;i<3;i++){

            coursecode = c[i].coursecode;
            coursename = c[i].coursename;
            marks = c[i].marks;

        }
    }
}

class Student extends Course {

    int roll_no;
    String name;
    int total_marks;
    static int highest_marks;
    Course[] course_class = new Course[3];

    Student(int roll_no,String name,int total_marks,Course[]course_ab){
        super(course_ab);
    }
}

class Java_assign2{

    public static void main(String [] args){

        Student st []= new Student[10];
        int [] total_marks = new int [10];
        
        Scanner sc = new Scanner(System.in);

        for(int i =0;i<10;i++){

            System.out.print(i+1 + "." + " Enter your roll no : ");
            int x = sc.nextInt();

            System.out.print(i+1 + "." + " Enter your name : ");
            String y = sc.next();

            Course [] temp = new Course[3];

            int total =0;

            for(int j =0;j<3;j++){

                System.out.print(j+1 +  "." + " Enter your course_id (int) : ");
                int z = sc.nextInt();

                System.out.print(j+1 + "." + " Enter your course name : ");
                String w = sc.next();

                System.out.print(j+1 + "." + " Enter your marks : ");
                int v =sc.nextInt();

                total = total + v;

                temp[j] = new Course(z,w,v);
            }

            st[i] = new Student(x,y,total,temp);
            st[i].total_marks = total;
            total_marks[i] = total;
        }

        int totalprint = Max(total_marks);
        st[0].highest_marks = totalprint;
        System.out.println(Student.highest_marks);
    }

    static int Max(int[] array){
        int max = array[0];

        for(int i=1;i<array.length;i++){
            if(array[i]>max){
                max =array[i];
            }
        }
        return max;
    }
}