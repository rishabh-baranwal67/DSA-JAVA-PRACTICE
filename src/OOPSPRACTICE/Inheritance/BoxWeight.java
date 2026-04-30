package OOPSPRACTICE.Inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        this.weight = -1435;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);
        this.weight = weight;
    }

}
