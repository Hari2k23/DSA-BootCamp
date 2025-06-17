public class CircularLinkedList {
    private class Node{
        int value;
        Node next;

        private Node(int value){
            this.value = value;
        }
        private Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    private Node head, tail;
    private int size;

    public CircularLinkedList(){
        this.size = 0;
    }

    public void insertAtFirst(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = tail = newNode;
            tail.next = head;
        }
        else{
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }

        size++;
    }

    public void insertAtEnd(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = tail = newNode;
            tail.next = head;
        }
        else{
            newNode.next = head;
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    public void delete(int val){
        if(head == null) {
            System.out.println("List is empty!");
        }
        
        Node current = head;
        if(current.value == val){
            head = head.next;
            tail.next = head;
        }        
        else{
            while(true){
                if(current.next.value == val){
                    current.next = current.next.next;
                    break;
                } 
                current = current.next;
                if(current == head){
                    System.out.println("Value not found!");
                    return;
                }
            }
        }

        size--;
    }

    public void display(){
        if(head == null) {
            System.out.println("List is empty!");
            return;
        }

        Node current = head;
        do{
            System.out.print(current.value + " -> ");
            if(current.next != null) current = current.next;
        } while(current != head);
        
        // current = head;
        // while(true){
        //     System.out.print(current.value + " -> ");
        //     current = current.next;
        //     if(current == head) break;
        // }

        System.out.println("HEAD");
    }

    public int getSize(){
        return size;
    }
}