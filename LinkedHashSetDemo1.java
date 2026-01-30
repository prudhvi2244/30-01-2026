import java.util.LinkedHashSet;

class LinkedHashSetDemo1 {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        lhs.add("Prudhvi");
        lhs.add("Rajeev");
        lhs.add("John");
        lhs.add("Smith");
        lhs.add("Rajeev"); // Duplicate, will not be added
        lhs.add(null); // Adding null value
        System.out.println(lhs);
    }
}