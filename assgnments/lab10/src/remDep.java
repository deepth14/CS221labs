import java.util.LinkedHashSet;

public class remDep {
    public static void removeDuplicates(String[] a)
    {
        LinkedHashSet<String> set
                = new LinkedHashSet<String>();

        // adding elements to LinkedHashSet
        for (int i = 0; i < a.length; i++)
            set.add(a[i]);

        // Print the elements of LinkedHashSet
        System.out.print(set);
    }

    // Driver code
    public static void main(String[] args)
    {

        String [] a={"deaan","dave","Zaineh","Yasmeen","abe","abe"};

        removeDuplicates(a);
    }
}
