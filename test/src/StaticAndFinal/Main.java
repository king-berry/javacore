package StaticAndFinal;

public class Main {
    // khởi tạo biến và method static
    public static int staticVar = 10;
    public static void staticMethod(){
        System.out.println("static");
    }

    // khởi tạo biến và method final
    public final int finalVar = 10;
    public final void finalMethod(){
        System.out.println("final");
    }


    public static void main (String[] args){
        // trụy cập giá trị của static
        System.out.println("staticVar: " + Main.staticVar);
        Main.staticMethod();
        // truy cập giá trị của final
        Main Obj = new Main();
        System.out.println("finalVar: " + Obj.finalVar);
        Obj.finalMethod();
    }


}
