package cloning;

public class Main {
    public static void main(String[] args) {
        Human kunal = new Human(34, "Kunal Kushwaha");
        Human twin = new Human(kunal);

        System.out.println(twin.age);
        System.out.println(twin.name);
    }
}
