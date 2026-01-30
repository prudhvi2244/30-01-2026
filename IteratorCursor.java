import java.util.ArrayList;
import java.util.Iterator;

class IteratorCursor {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<Integer>();

        for (int i = 1; i <= 10; i++) {
            al.add(i);
        }

        for(Integer i1:al){
            System.out.println(i1);
        }

       //System.out.println(al);

        // Iterator<Integer> iterator = al.iterator();

        // while (iterator.hasNext()) {
        //     Integer i = iterator.next();
        //     System.out.println(i);
        // }

    }

}