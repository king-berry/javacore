package PrimitiveAndObject;

public class Player {
    String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        Player cha1 = new Player("bs");
        Player cha2 = cha1;
        cha2.setName("another");
        System.out.println(cha1.getName());
    }
}
