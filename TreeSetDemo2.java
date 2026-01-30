import java.util.TreeSet;

class TreeSetDemo2 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("Prudhvi");
        ts.add("Rajeev");
        ts.add("John");
        ts.add("Smith");
        System.out.println(ts);

        System.out.println(Integer.valueOf(10).compareTo(Integer.valueOf(5)));
        System.out.println(Integer.valueOf(10).compareTo(Integer.valueOf(15)));
        System.out.println(Integer.valueOf(15).compareTo(Integer.valueOf(15)));
    }
}