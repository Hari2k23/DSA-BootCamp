public class DoublyLinkedList {
    private class Node{
        Node prev;
        int value;
        Node next;

        private Node(int value){
            this.value = value;
        }
        private Node(Node prev, int value, Node next){
            this.prev = prev;
            this.value = value;
            this.next = next;
        }
    }

    private Node head;
    private int size;

    public DoublyLinkedList(){
        this.size = 0;
    }

    public void insertAtFirst(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
        }
        else{
            newNode.prev = null;
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        size++;
    }

    public void insertAtEnd(int value){
        Node newNode = new Node(value);

        if(head == null){
            head = newNode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
            newNode.next = null;
        }

        size++;
    }

    public void insertAtPosition(int after, int value){
        // if(position == 0){
        //     insertAtFirst(value);
        //     return;
        // }
        // else if(position >= size){
        //     insertAtEnd(value);
        //     return;
        // }
        
        // Node temp = head;
        // for(int i = 0; i < position - 1; i++) temp = temp.next;

        Node temp = find(after);
        if(temp == null){
            System.out.println("Node with value "+ after + " not found.");
            return;
        }
        Node newNode = new Node(temp, value, temp.next);
        temp.next = newNode;
        if(newNode.next != null) newNode.next.prev = newNode;

        size++;
    }

    public int deleteAtFirst(){
        if(head == null){
            System.out.println("List is empty!");
            return -1;
        }

        int val = head.value;
        if(head.next == null) head = null;
        else{
            head = head.next;
            head.prev = null;
        } 

        size--;
        return val;
    }

    public int deleteAtEnd(){
        if(head == null){
            System.out.println("List is empty!");
            return -1;
        }

        if(head.next == null) return deleteAtFirst();

        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        int val = temp.next.value;
        temp.next.prev = null;
        temp.next = null;
        
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
         
        Node temp = head;
        for(int i = 0; i < position - 1; i++){
            temp = temp.next;
        }
        int val = temp.next.value;
        temp.next = temp.next.next;
        if(temp.next != null){
            temp.next.prev = temp;
        }

        size--;
        return val;
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
        Node last = null;
        System.out.print("NULL <-> ");
        while(temp != null){
            last = temp;

            System.out.print(temp.value + " <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");

        System.out.println("Reverse traversal:");
        System.out.print("NULL <-> ");
        while(last != null){
            System.out.print(last.value + " <-> ");
            last = last.prev;
        }
        System.out.println("NULL");
    }

    public int getSize(){
        return size;
    }
}