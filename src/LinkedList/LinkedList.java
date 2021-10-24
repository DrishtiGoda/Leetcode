package LinkedList;

public class LinkedList {
    private Link first;

    //create an empty linkedList
    public LinkedList() {
        first = null;
    }

    //insert link at first location
    public void insertFirst(int key, int data) {
        Link link = new Link(key, data);
        link.next = first;
        first = link;
    }

    // delete first item
    public Link deleteFirst() {
        Link tempLink = first;
        first = first.next;
        return tempLink;
    }

    //display the list
    public void display() {
        Link current = first;
        System.out.print("[ ");
        while (current != null) {
            current.display();
            current = current.next;
        }
        System.out.println(" ]");
    }

    // is list empty
    public boolean isEmpty() {
        return first == null;
    }

    //find the link
    public Link find(int key) {
        Link current = first;
        if (first == null) {
            return null;
        }
        while (current.key != key) {
            if (current.next == null) {
                return null;
            } else {
                current = current.next;
            }
        }
        return current;
    }

    // delete a link with given key
    public Link delete(int key) {
        Link current = first;
        Link previous = null;
        if (first == null) {
            return null;
        }
        while (current.key != key) {
            if (current.next == null) {
                return null;
            } else {
                previous = current;
                current = current.next;
            }
        }
        if (current == first) {
            first = first.next;
        } else {
            previous.next = current.next;
        }
        return current;
    }

    public int length() {
        int length = 0;
        for (Link current = first; current != null; current = current.next) {
            length++;
        }
        return length;
    }

    public void sort() {
        int i, j, tempKey, tempData;
        Link current, next;
        boolean swapped;
        int size = length();
        for (i = 0; i < size - 1; i++) {
            current = first;
            next = first.next;
            swapped = false;
            for (j = 1; j < size - i - 1; j++) {
                if (current.data > next.data) {
                    tempData = current.data;
                    current.data = next.data;
                    next.data = tempData;

                    tempKey = current.key;
                    current.key = next.key;
                    next.key = tempKey;
                    swapped = true;
                }
                current = current.next;
                next = next.next;
            }
            if (!swapped)
                break;
        }
    }

    public LinkedList reverse(){
        LinkedList reversedList = new LinkedList();
        Link nextLink;
        reversedList.insertFirst(first.key,first.data);

        Link currentLink = first;
        while (currentLink.next != null){
            nextLink = currentLink.next;
            reversedList.insertFirst(nextLink.key,nextLink.data);
            currentLink = currentLink.next;
        }
        return reversedList;
    }

    public void concatenate(LinkedList list){
        if(first==null){
            first = list.first;
        }
        if(list.first == null){
            return;
        }
        Link temp = first;

        while(temp.next!= null){
            temp = temp.next;
        }
        temp.next = list.first;
    }
}






