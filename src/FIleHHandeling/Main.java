package FIleHHandeling;
public class Main extends Thread implements Runnable{
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("before"+ t);
        t.setName("New Name");
        System.out.println("after" + t);
    }
}
