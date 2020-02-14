package array.stack;

public class StackArrayRunner {
    public static void main(String[] args) {
        StackArray stack = new StackArray();

        stack.push(12);
        stack.push(8);
        stack.push(78);
        stack.push(90);
        stack.push(36);
        stack.push(78);
        stack.push(45);
        stack.push(11);


        System.out.println("Peek element is : "+stack.peek());

        stack.show();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        stack.show();


    }
}
