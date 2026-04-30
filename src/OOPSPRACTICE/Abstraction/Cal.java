package OOPSPRACTICE.Abstraction;

interface first{
    int add(int a , int b);
}
interface second{
    int sub(int a , int b);
    int add(int a , int b);
}
class Rb implements second{
    public int add(int a , int b){
        return a * b;
    }
    public int sub(int a , int b ){
        return a - b;
    }
}
class Gfg implements first, second{
    public int add(int a , int b) {
        return a + b;
    }
    public int sub(int a , int b) {
        return a - b;
    }
}
public class Cal {
    public static void main(String[] args) {
        Gfg x = new Gfg();
        System.out.println(x.add(5, 4));
        Rb obj = new Rb();
        System.out.println(obj.add(5, 4));
    }
}