package MultiThreading;

public class NewThread implements Runnable{
    String name;
    Thread t;
    NewThread(String threadName){
        name = threadName;
        t = new Thread(this, name);
        System.out.println("New Thread :" + t);
    }
    public void run(){
        try{
            for(int i = 5; i > 0; i--){
                System.out.println(name + ":" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + "interrupted.");
        }
        System.out.println(name + " exiting.");
    }
}

class DemoJOIn{
    public static void main(String[] args) {
        NewThread nt1 = new NewThread("One");
        NewThread nt2 = new NewThread("two");
        NewThread nt3 = new NewThread("three");

        // start the thread
        nt1.t.start();
        nt2.t.start();
        nt3.t.start();

        System.out.println("THread one is alive: " + nt1.t.isAlive());
        System.out.println("THread two is alive: " + nt2.t.isAlive());
        System.out.println("THread three is alive: " + nt3.t.isAlive());

        // join() wait for threads to finish
        try {
            System.out.println("waiting for thread to finish");
            nt1.t.join();
            nt2.t.join();
            nt3.t.join();
        }catch (InterruptedException e){
            System.out.println("Main thread interrupted");
        }
        System.out.println("THread one is alive: " + nt1.t.isAlive());
        System.out.println("THread two is alive: " + nt2.t.isAlive());
        System.out.println("THread three is alive: " + nt3.t.isAlive());
            System.out.println("Main thread exiting");
    }
}
