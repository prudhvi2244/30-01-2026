import java.util.TreeSet;

class MyComparator implements java.util.Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 < o2)
            return 1;
        else if (o1 > o2)
            return -1;
        else
            return 0;
    }

}

class TreeSetDemo3 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>(new MyComparator());
        ts.add(10);
        ts.add(5);
        ts.add(15);
        ts.add(10); // Duplicate, will not be added
        ts.add(7);

        System.out.println(ts);
    }
}