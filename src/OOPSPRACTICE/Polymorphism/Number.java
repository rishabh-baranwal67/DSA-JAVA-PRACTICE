package OOPSPRACTICE.Polymorphism;
//METHOD OVERLOADING

public class Number {
    static class Number1 {
        int a;
        int b;
        int c;
        Number1(){
            this.a = -1;
            this.b = -1;
            this.c = -1;
        }
        Number1(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        int sum() {
            return a + b;
        }

        int sum(int a, int b, int c) {
            return a + b + c;
        }

        public static void main(String[] args) {
            Number1 num = new Number1(4,5,6);
            Number1 num1 = new Number1();
            System.out.println(num1.sum());
            System.out.println(num.sum(23, 34, 2));

        }
    }
}
