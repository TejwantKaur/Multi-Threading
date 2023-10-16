package multi;
public class _1_threadClass{
    public static void main(String[] args) {
        System.out.println("Main-Thread");

        myThread t = new myThread();
        t.start();
    }
}

class myThread extends Thread{
    public void run(){
        System.out.println("main-Child");
    }
}
    
