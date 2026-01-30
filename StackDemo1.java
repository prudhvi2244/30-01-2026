import java.util.Stack;

class StackDemo1 {

    public static void main(String[] args) {

        Stack<Integer> s1 = new Stack<Integer>();
        s1.add(10);
        s1.add(90);
        s1.add(80);
        s1.add(1);
        s1.push(3);

        for(var e:s1){
            System.out.println(e);
        }

        System.out.println("**************");
        System.out.println(s1.pop()); // Remove and return the top of the stack
        System.out.println(s1.peek()); // Returns the top of the stack


    }

}