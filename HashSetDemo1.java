import java.util.HashSet;
import java.util.Iterator;

class HashSetDemo1 {

    public static void main(String[] args) {
        HashSet hs = new HashSet<>();

        hs.add("Prudhvi");
        hs.add('A');
        hs.add(10);
        hs.add(null);
        hs.add("Prudhvi");
        hs.add(true);

        System.out.println(hs);
        System.out.println("Size of Hash Set :" + hs.size());
        System.out.println("Is Hash Set Empty ?" + hs.isEmpty());
        System.out.println("Is Hash Set having Object true?" + hs.contains(true));

        System.out.println("Using Iterator Cursor");

        Iterator it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("Using For-Each Loop");

        for (var o : hs) {
            System.out.println(o);
        }

        // hs.clear();

    }

}