package LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertFirst(1,10);
        list.insertFirst(2, 20);
        list.insertFirst(3, 30);
        list.insertFirst(4, 1);
        list.insertFirst(5,50);
        list.insertFirst(6,56);

        // print original list
        System.out.print("Original list: ");
        list.display();
        System.out.println(" ");

        // delete list
        while(!list.isEmpty()){
            Link temp = list.deleteFirst();
            System.out.print("Deleted Value :");
            temp.display();
            System.out.println(" ");
        }
        System.out.print("List after deleting all items : ");
        list.display();

        // restore list again
        System.out.println(" ");
        list.insertFirst(1,10);
        list.insertFirst(2,20);
        list.insertFirst(3,30);
        list.insertFirst(4,1);
        list.insertFirst(5,40);
        list.insertFirst(6,56);
        System.out.print("Restored List : ");
        list.display();
        System.out.println(" ");

        // find an element
        Link foundLink = list.find(4);
        if(foundLink != null){
            System.out.print("Element found :");
            foundLink.display();
            System.out.println(" ");
        }else {
            System.out.println("Element not found.");
        }

        list.delete(4);
        System.out.println("List after deleting an item: ");
        list.display();
        System.out.println(" ");
        foundLink = list.find(4);
        if(foundLink != null){
            System.out.println("Element found: ");
            foundLink.display();
            System.out.println(" ");
        }else {
            System.out.println("Element not found {4,1}");
        }
        System.out.println(" ");
        list.sort();
        System.out.println("List after sorting out data: ");
        list.display();
        System.out.println(" ");
        System.out.println("Reverse of List: ");
        LinkedList list1 = list.reverse();
        list1.display();
        System.out.println();

        LinkedList list2 = new LinkedList();

        list2.insertFirst(9,50);
        list2.insertFirst(8,40);
        list2.insertFirst(7, 20);

        list.concatenate(list2);
        System.out.println("List after concatenation: ");
        list.display();
        System.out.println(" ");
    }
}
