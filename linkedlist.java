class linkedlist{

    Node head;

    static class Node{

        int data;
        Node next;

        Node(int d){

            data = d;
            next = null;
        }
    }

    public static linkedlist insert(linkedlist list, int data){

        Node new_node = new Node(data);

        if(list.head == null){

            list.head = new_node;

        }

        else{

            Node last = list.head;

            while (last.next != null) { 
                last = last.next; 
            } 

            // Insert the new_node at last node 
            last.next = new_node; 
        } 
    
        // Return the list by head  
        return list; 
        }
        
        public static void printList(linkedlist list){

        Node currNode = list.head; 
     
        System.out.print("LinkedList: "); 
     
        while (currNode != null) { 
            // Print the data at current node 
            System.out.print(currNode.data + " "); 
     
            currNode = currNode.next; 
        } 
    } 
     
    public static void main(String[] args){ 

        linkedlist list = new linkedlist(); 
        linkedllist list1 = new linkedlist();

        list = insert(list, 31); 
        list = insert(list, 22); 
        list = insert(list, 43); 
        list = insert(list, 46); 
        list = insert(list, 95); 
        list = insert(list, 62); 
        list = insert(list, 77); 
        list = insert(list, 18);
    
        printList(list); 



    }
}