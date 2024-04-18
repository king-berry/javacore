package String;

public class Main {
    public static void main(String[] args){
        // tạo biến string
        String str1 = new String("String");
        String str2 = "String";

        //so sánh String
        String str3 = "String";

        System.out.println(str3 == str2); // cùng tham chiếu đến cùng 1 địa chỉ
        System.out.println(str3 == str1); // cùng giá trị nhưng không cùng tham chiếu đến cùng 1 địa chỉ
        System.out.println(str3.equals(str1)); // chỉ so sánh giá trị của 2 chuỗi
    }
}
