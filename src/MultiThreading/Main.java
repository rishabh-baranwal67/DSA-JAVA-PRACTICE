package MultiThreading;

class NewThreading extends Thread{
    private String task;
    NewThreading(String task){
        this.task = task;
    }
    public void run(){
        try{
            System.out.println("run method wiil implements and cook " + task);
            NewThreading.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("Exception occur");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        NewThreading nw = new NewThreading("Omlet");
        Thread tt = new Thread();
        System.out.println(tt);
        tt.setName("rb thread");
        System.out.println(tt);
        NewThreading nw1 = new NewThreading("EggCurry");

        nw.start();
        nw1.start();

        System.out.println("starting join");
        try{
            nw.join();
            nw1.join();
        } catch (InterruptedException e) {
            System.out.println("Exception occured");
        }
//        Thread t = Thread.currentThread();
//        Thread t1 = new Thread();
//        System.out.println(t1);
//        System.out.println("before"+ t);
//        t.setName("New Name");
//        System.out.println("after" + t);
    }
}
