import StacknQueue.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Stack mystack = new Stack();

        mystack.push(2);
        mystack.push(4);
        mystack.push(8);
        int myvar = mystack.pop();
        mystack.list();

        System.out.println("This is the removed element: " + myvar);
        System.out.println("T/F - The StacknQueue.Stack is Empty "+ mystack.isEmpty());
    }
}
