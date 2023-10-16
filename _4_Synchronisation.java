package multi;
public class _4_Synchronisation {
    public static void main(String[] args) {
        
        Car c = new Car();

        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        Thread t3 = new Thread(c);

        t1.setName("One 1 ");
        t2.setName("Two 2 ");
        t3.setName("Three 3 ");

        t1.start();
        t2.start();
        t3.start();

        // all three threads trying to access single resource, 
        // this is problem that is also called race condition
    }
}

class Car implements Runnable{
    public void run(){
        try{
            System.out.println(Thread.currentThread().getName() + 
            "Entered Parking");
            Thread.sleep(2000);

            synchronized(this){
                System.out.println(Thread.currentThread().getName() + 
                "Got Car and started Driving");
                Thread.sleep(2000);

                System.out.println(Thread.currentThread().getName() + 
                "Came back");
            }
        } catch (Exception e){
            System.out.println("Error");
        }
    }
}