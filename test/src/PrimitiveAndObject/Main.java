package PrimitiveAndObject;

public class Main {
    public void main(String[] args){
        testString();
    }

    public static void testString(){
        String a = new String("bbb");
        String b = "bbb";
        String c = "bbb";
        System.out.println(a.equals(b));
        System.out.println(b == a);
        System.out.println(b == c);
    }
}


