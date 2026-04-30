package OOPSPRACTICE.Inheritance;

public class Box {
    double l;
    double h;
    double w;
    void study(){
        System.out.println("dgdgjofgfg");
    }
    Box(){
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }
    Box(double side){
        this.l = side;
        this.h = side;
        this.w = side;
    }
    Box(double l, double h, double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }
    Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }
    static class BoxWeight extends Box {
        double weight;

        public BoxWeight(){
            this.weight = -1;
        }

//        public BoxWeight(double l, double h, double w, double weight) {
          public BoxWeight(double side, double weight){
            super(side);
            this.weight = weight;
        }

    }
    public static void main(String[] args) {
       Box box = new Box();
        box.w = 10;
        Box box1 = new Box(5,6,7);
        Box box2 = new Box(box);
//        System.out.println(box1.l + " " + box1.h);
//        System.out.println(box2.w);

//       BoxWeight box4 = new BoxWeight(5, 6, 7, 8);
       BoxWeight box4 = new BoxWeight(5, 6);
        System.out.println(box4.h);
        BoxWeight box5= new BoxWeight();

        System.out.println(box5.weight);
        Box rb = new BoxWeight();
        rb.study();

    }
}
