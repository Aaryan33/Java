import java.util.*;

public class linkedlist1 {
    public static void main(String[] args) {

        String s1="123456";
        String s2="1239";

        LinkedList<Integer> l1 = new LinkedList<Integer>();
        LinkedList<Integer> l2 = new LinkedList<Integer>();
        LinkedList<Integer> l3 = new LinkedList<Integer>();

        //convert string to integer 
        for(int i=s1.length()-1;i>=0;i--){
            char c=s1.charAt(i);
            int a= c-'0';
            l1.add(a);
        }
        //convert string to integer 
        for(int i=s2.length()-1;i>=0;i--){
            char c=s2.charAt(i);
            int a= c-'0';
            l2.add(a);
        }
        //initilize carry to zero
        int carry=0;

        //while l1 is not empty and l1 is not empty till add element and store in b and remove element 
        // if addition elemnt is less than 10 so simply add them in l3 else store carry 
        // and then again check for carry 

        while(!l1.isEmpty() && !l2.isEmpty()){
            // System.out.println(l1.getFirst() + " " + l2.getFirst());
            int b=l1.getFirst() + l2.getFirst()+carry;
            l1.removeFirst();
            l2.removeFirst();
            //if not here the carry
            if(b<10){
                l3.add(b);
                carry=0;
            }
            //here is the carry 
            else{
                carry=b/10;
                l3.add(b%10);
            }
        }
        // this is specially for exception occurs when one of the link list is shorter so which element is remaining is for them we have to check again same thing 
        while(!l1.isEmpty()){
            int b=l1.getFirst();
            l1.removeFirst();
            if(b>=10){
                carry=b/10;
                l3.add(b%10); 
            }
            else{
                l3.add(b+carry);
                carry=0;
            }
        }
        // for link list 2 also 
        while(!l2.isEmpty()){
            int b=l2.getFirst();
            l2.removeFirst();
            if(b>=10){
                carry=b/10;
                l3.add(b%10); 
            }
            else{
                l3.add(b+carry);
                carry=0;
            }
        }

        // while l3 is not empty 
        while(!l3.isEmpty()){
            System.out.print(l3.getLast());
            l3.removeLast();
        }

    }
   
}
