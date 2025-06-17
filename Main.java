public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtFirst(1);
        list.insertAtFirst(2);
        list.insertAtFirst(3);
        list.insertAtFirst(4);
        list.insertAtEnd(5);
        list.insertAtPosition(7, 3);
        list.display();
        list.deleteAtPosition(2);
        list.display();
        list.deleteAtPosition(0);
        list.display();
        list.deleteAtPosition(list.getSize() - 1);
        list.display();
        list.recursiveInsertion(88, 2);
        list.display();
        System.out.println();

        DoublyLinkedList dlist = new DoublyLinkedList();
        dlist.insertAtFirst(3);
        dlist.insertAtFirst(2); 
        dlist.insertAtFirst(8);
        dlist.insertAtFirst(17);
        dlist.insertAtEnd(99);
        dlist.insertAtPosition(8, 65);
        dlist.display();
        System.out.println();

        CircularLinkedList clist = new CircularLinkedList();
        clist.insertAtEnd(23);
        clist.insertAtEnd(3); 
        clist.insertAtEnd(19);
        clist.insertAtEnd(75);
        clist.display();
        clist.delete(23);
        clist.display();
    }
}