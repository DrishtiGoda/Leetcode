package Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack(10);

        stack.push(3);
        stack.push(5);
        stack.push(9);
        stack.push(1);
        stack.push(12);
        stack.push(15);

        System.out.println("Element at the top of the stack : " +stack.peek());
        System.out.println("Elements: ");

        while (!stack.isEmpty()){
            int data = stack.pop();
            System.out.println(data);
        }

        System.out.println("Stack full: "+ stack.isFull());
        System.out.println("Stack empty: "+ stack.isEmpty());
    }
}
