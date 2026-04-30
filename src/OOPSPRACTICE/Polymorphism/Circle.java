package OOPSPRACTICE.Polymorphism;

public class Circle extends Shapes{
    @Override
    void area (){
        System.out.println("I am in CIRCLE");
    }

    public static void main(String[] args) {
        Shapes circle = new Circle();
        circle.area();
    }
}
