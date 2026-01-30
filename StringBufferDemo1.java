class StringBufferDemo1   
{
    public static void main(String[] args) {

        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer("India");

        System.out.println("Length of sb2 :" + sb2.length());

        sb2.reverse();

        System.out.println("Reversed String :" + sb2);

        sb2.append(90.9);
        sb2.append('A');

        System.out.println(sb2);

        sb2.deleteCharAt(4);

        System.out.println(sb2);

        sb2.delete(2, 5);
        
        System.out.println(sb2);

    }

}