package Assignment_7;

import java.util.LinkedList;
import java.util.Queue;

public class App {

    public static void main(String[] args) {
        Queue<Customer> list = new LinkedList<>();
        list.add(new Customer("Andrew", 2, 30.00));
        list.add(new Customer("Teddy", 3, 45.00));
        list.add(new Customer("Yonas", 4, 60.00));
        list.offer(new Customer("Sammy", 4, 34.0));
       // System.out.println( list.peek().getWaitTime());
//        while(!list.isEmpty()){
//            System.out.println(list.poll().getWaitTime());
//        }

        System.out.println( "The first customer processing time is: " + processingTime(list.poll()) + " min");
        list.poll();
        System.out.println("The second customer Processing time: " + processingTime(list.poll()) + "min");
//        if(list.poll().getWaitTime()==0){
//            return 0;
//        }else{
//            return list.poll().getWaitTime();
    }
    public static double processingTime(Customer customer){
        final double MIN_WAIT = 15;
        if(customer.getWaitTime()<=MIN_WAIT){
            return 15;
        }else{
            return customer.getWaitTime() + MIN_WAIT;
        }
    }
}