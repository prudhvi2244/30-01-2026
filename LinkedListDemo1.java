import java.util.Iterator;
import java.util.LinkedList;

class LinkedListDemo1 {

    public static void main(String[] args) {

        LinkedList<String> l = new LinkedList<String>();

        l.add("Prudhvi");
        l.add("Rajeev");
        l.add("John");
        l.add("Smith");

        System.out.println(l);
        System.out.println("***************************");
        System.out.println("Peek :" + l.peek());

        System.out.println(l);
        System.out.println("Poll :" + l.poll());
        System.out.println(l);
        System.out.println("Pop : " + l.pop());
        System.out.println(l);

        // Iterator<String> iterator = l.iterator();

        // while (iterator.hasNext()) {
        // String s = iterator.next();
        // if (s.length() >= 5) {
        // System.out.println(s.toUpperCase());
        // }

        // }

    }

}