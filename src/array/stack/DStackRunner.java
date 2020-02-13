package array.stack;
public class DStackRunner {
    public static void main(String[] args) {
        DStack stack = new DStack();
        stack.push(12);
        stack.push(23);
        stack.push(32);
        stack.push(44);
        stack.push(56);


        System.out.println("Now Total numbers of elements : "+stack.totalElements());
        System.out.println("Now the current size of the stack array : "+stack.sizeOfStackArray());
        stack.show();

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.push(78);
        stack.push(89);
        stack.push(63);
        stack.push(87);
        stack.push(877);
        stack.push(977);
        stack.push(477);
        stack.push(8888);
        stack.push(1616);
        stack.pop();
        stack.pop();


        System.out.println("Now Total numbers of elements : "+stack.totalElements());
        System.out.println("Now the current size of the stack array : "+stack.sizeOfStackArray());
        stack.show();


    }
}
