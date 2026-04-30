package OOPSPRACTICE.Interfaces_java;

@FunctionalInterface
interface MyFunctionalInterface {
    void display(); // Single abstract method
}
public class Practice{
    public static void main(String[] args) {
        MyFunctionalInterface obj = () -> System.out.println("Hello from functional interface!");
        obj.display();
    }
}
