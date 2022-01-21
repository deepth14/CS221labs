package CS221labs.assgnments.src.assgin3.q3;

import java.util.ArrayList;

public class Marketing {
    String empName;
    String productName;
    double saleAmount;

    @Override
    public String toString() {
        return super.toString();
    }

    public Marketing(String empName, String productName, double saleAmount){
        this.empName=empName;
        this.productName=productName;
        this.saleAmount=saleAmount;

    }

    public static void main(String[] args) {
        ArrayList<Marketing> marketing= new ArrayList<>();
        Marketing marketing1 = new Marketing("abe","macBookAir",1200);
        Marketing marketing2 = new Marketing("ses","HP",700);
        Marketing marketing3 = new Marketing("deebz","Asus",500);
        Marketing marketing4 = new Marketing("tmoney","toshiba",400);
        marketing.add(marketing1);
        marketing.add(marketing2);
        marketing.add(marketing3);
        marketing.add(marketing4);
        System.out.println(marketing.get(2).productName);

        //to get the size
        System.out.println(marketing.size());
        //deleting an object
        marketing.remove(marketing2);
        System.out.println(marketing);
        for (int i = 0; i <marketing.size() ; i++) {
            System.out.println(marketing.get(i).empName+ " ");
        }

    }
}
