package array.stack;

public class LStackRunner {
    public static void main(String[] args) {
        LStack stack = new LStack();


        stack.push(12);
        stack.push(23);
        stack.push(32);
        stack.push(101);
        stack.push(90);
        stack.push(87);
        stack.push(76);
        stack.show();

        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("Peek element is : "+stack.peek());
        System.out.println("Total elements : "+stack.getSize());
        stack.show();


    }
}
