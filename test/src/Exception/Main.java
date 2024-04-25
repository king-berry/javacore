package Exception;

public class Main {
    public static void main(String[] args){
        TestExceptionPropagation obj = new TestExceptionPropagation();
        obj.p();
        System.out.println("normal flow...");
    }
}

class testException extends Exception{
    private String message;

    public testException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
class TestExceptionPropagation {
    void m() {
        int data = 50 / 0;
    }

    void n() {
        m();
    }

    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("exception handled");
        }
    }
}
