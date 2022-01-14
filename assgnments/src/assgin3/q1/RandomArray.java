package q1;

import javax.management.StandardEmitterMBean;
import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    private static final int INITIAL_CAPACITY = 50;
    private static int[] a;
    private static int size = 0;
    private static int capacity;

    public static void main(String[] args) {

    }

    ////////a insert method
    public void insert() {
        int[] a = new int[50];
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            a[i] = random.nextInt(100);

        }
        System.out.println(Arrays.toString(a));
    }

    ////////b remove duplicates
    public void removeD() {
        int[] temp = new int[a.length];
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];

            }
        }
        temp[j++]=a[a.length-1];
        for (int i = 0; i <j ; i++) {
            a[i]=temp[i];
        }

    }
    ///c. remove all elemnets
    public void clear(){
        int [] b = new int[0];
        a=b;
    }
    /////d. size of an array
    public int getSize(){
        return size;

    }
    //e .get value by passing index
    public int get(int index){
        if(index<0&& index>=size){
            throw new ArrayIndexOutOfBoundsException();

        }
        return a[index];

    }
    //f. get the sublist by passing start and end index.
    public int[] subList(int start, int end){
        int[] range;
        int index = 0;
        if ((start < 0  && start >= size) || (end < 0  && end >= size))
            throw new ArrayIndexOutOfBoundsException();
        range = new int[(end - start) + 1];
        for (int i = start; i <= end; i++) {
            range[index] = a[i];
            index++;
        }

        return range;

    }
    //g. set the new value using index
    public int set(int index, int newValue){
        int oldValue;
        if(index<0 && index>=size)
            throw new ArrayIndexOutOfBoundsException();

        oldValue=a[index];
        a[index]=newValue;
        return  oldValue;

    }




}

}