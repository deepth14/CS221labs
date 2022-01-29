import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class distinctValues {
    public static void countDistrictVal(ArrayList<String> list)
    {

        // hash set is created and elements of
        // arraylist are insertd into it
        Set<String> st = new HashSet<String>(list);
        for (String s : st)
            System.out.println(s + ": " + Collections.frequency(list, s));
    }

    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Dean");
        list.add("Dave");
        list.add("Zaineh");
        list.add("Yasmeen");
        list.add("Yasmeen");
        countDistrictVal(list);
    }

}

