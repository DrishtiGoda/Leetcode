package Stack;

public class Stack {
    private int size;                   // size of stack
    private int[] intArray;             // stack storage
    private int top;                    // top of the stack

    public Stack(int size){
        this.size = size;
        intArray = new int[size];
        top = -1;
    }

    public void push(int data){
        if(!isFull()){
            intArray [++ top] = data;
        }else{
            System.out.println("Cannot add data. Stack is full");
        }
    }

    public int pop(){
        return intArray[top--];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == size-1);
    }

    public int peek(){
        return intArray[top];
    }
}
