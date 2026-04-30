package OOPSPRACTICE.Polymorphism;

public class Shapes {
    void area() {
        System.out.println("I am in shapes");
    }

    static class Circles extends Shapes {
        @Override
        void area() {
            System.out.println("I am in CIRCLE");
        }
    }

    static class Triangle extends Shapes{
        @Override
        void area(){
            System.out.println("Triangle is here");
        }
    }
        public static void main(String[] args) {
            Shapes circle = new Circles();
            Shapes triangle = new Triangle();
            System.out.println(circle);
            triangle.area();
            circle.area();
        }

}