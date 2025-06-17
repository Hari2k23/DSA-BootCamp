public class SinglyLinkedList{
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }


    private Node head, tail;
    private int size;

    public SinglyLinkedList(){
        this.size = 0;
    }

    public void recursiveInsertion(int value, int position){
        head = recursiveInsertion(value, position, head);
    }

    private Node recursiveInsertion(int value, int position, Node current){
        if(position == 0){
            Node newNode = new Node(value, current);
            size++;
            return newNode;
        }

        current.next = recursiveInsertion(value, position - 1, current.next);
        return current;
    }

    public void insertAtFirst(int value){
        Node newNode = new Node(value);

        newNode.next = head;
        head = newNode;
        if(tail == null) tail = head;
        
        size++;
    }

    public void insertAtEnd(int value){
        Node newNode = new Node(value);

        if(head == null){
            head = tail = newNode;
        }

        else{
            tail.next = newNode;
            tail = newNode;
        }

    // --- Without tail - O(N) ---
        // Node temp = head;
        // while(temp.next != null) temp = temp.next;
        // temp.next = newNode;
        // tail = newNode;

        size++;
    }

    public void insertAtPosition(int value, int position){
        if(position == 0){
            insertAtFirst(value);
            return;
        }
        else if(position >= size){
            insertAtEnd(value);
            return;
        }
        
        Node temp = head;
        for(int i = 0; i < position - 1; i++) temp = temp.next;
        Node newNode = new Node(value, temp.next);
        temp.next = newNode;

        size++;
    }

    public int deleteAtFirst(){
        if(head == null){
            System.out.println("List is empty!");
            return -1;
        }

        int val = head.value;
        if(head == tail) head = tail = null;
        else head = head.next;

        size--;
        return val;
    }

    public int deleteAtEnd(){
        if(head == null){
            System.out.println("List is empty!");
            return -1;
        }

        if(size == 1) return deleteAtFirst();

        Node secondLast = getNode(size - 2);
        int val = tail.value;
        tail = secondLast; 
        tail.next = null;

    // --- Without getNode() - O(N) ---
        // Node temp = head;
        // while(temp.next.next != null){
        //     temp = temp.next;
        // }
        // int val = temp.next.value;
        // tail = temp;
        // tail.next = null; 
        
        size--;
        return val;
    }

    public int deleteAtPosition(int position){
        if(position == 0){
            return deleteAtFirst();
        }
        else if(position == size - 1){
            return deleteAtEnd();
        }
        
    // --- With getNode() - O(1) ---
        // Node prev = getNode(position - 1);
        // int val = prev.next.value;
        // prev.next = prev.next.next;
         
        Node temp = head;
        for(int i = 0; i < position - 1; i++){
            temp = temp.next;
        }
        int val = temp.next.value;
        temp.next = temp.next.next;

        size--;
        return val;
    }

    public Node getNode(int position){
        Node temp = head;
        for(int i = 0; i < position; i++) temp = temp.next;
        return temp;
    }

    public Node find(int value){
        Node temp = head;
        while(temp != null){
            if(temp.value == value) return temp;
            temp = temp.next;
        }
        return null;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public int getSize(){
        return size;
    }
}