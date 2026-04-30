package OOPSPRACTICE.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        box.w = 10;
        Box box1 = new Box(5, 6, 7);
        Box box2 = new Box(box);
//        System.out.println(box1.l + " " + box1.h);
//        System.out.println(box2.w);

        BoxWeight box4 = new BoxWeight(5, 6, 7, 8);
        System.out.println(box4.w);
        BoxWeight box5 = new BoxWeight();

        System.out.println(box5.weight);

    }
}
