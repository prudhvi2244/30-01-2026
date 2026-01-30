import java.util.TreeSet;

class TreeSetDemo1 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>();
        ts.add(10);
        ts.add(5);
        ts.add(15);
        ts.add(7);
        ts.add(3);
        System.out.println(ts);
    }
}