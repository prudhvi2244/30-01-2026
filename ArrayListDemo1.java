import java.util.ArrayList;

class ArrayListDemo1 {

    public static void main(String[] args) {

        ArrayList al = new ArrayList<>();

        al.add("Prudhvi");
        al.add('A');
        al.add(10);
        al.add(null);
        al.add("Prudhvi");
        al.add(true);

        System.out.println(al);// ["Prudhvi",'A',10,null,"Prudhvi",true]

        System.out.println("Size of Array List :" + al.size());
        System.out.println("Element at 4th index position :" + al.get(4));
        System.out.println("Is Array List Empty ?" + al.isEmpty());

        System.out.println("Is Array List having Object true?" + al.contains(true));

        Object obj[] = al.toArray();

        al.remove(4);

        System.out.println(al);

        // al.clear();

        // System.out.println(al);

        // for (int i = 0; i < al.size(); i++) {
        // System.out.println(al.get(i));
        // }

    }

}