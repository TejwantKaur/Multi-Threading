package multi;
import java.util.Scanner;

public class _2_multiThreadsCreate{
    public static void main(String[] args) {
        System.out.println("MainThread Started");
        
        calc t1 = new calc();
        msge t2 = new msge();

        t1.start();
        t2.start();
    }
}

class calc extends Thread{
    
    public void run(){
        System.out.println("Calculation Started");

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter 1st num: ");
            int num1 = sc.nextInt();
            
            System.out.print("Enter 2nd num: ");
            int num2 = sc.nextInt();

            int res = num1+num2;

            System.out.println(res);
        }
        System.out.println("Cal-Endd");
    }
}

class msge extends Thread{
    public void run(){
        System.out.print("Displaying imp msge");

        try{
            for(int i=0; i<5; i++){
                for(int j=0; j<i; j++){                    
                    System.out.print("*");
                    Thread.sleep(2000);
                } 
                System.out.println();
            }
        } catch (Exception e){
            System.out.println("Err");
        }
        System.out.println("Displaying import msge");
    }
}