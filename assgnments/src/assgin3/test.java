package CS221labs.assgnments.src.assgin3;

import javax.xml.stream.events.StartDocument;

public class test {
    public static void main(String[] args) {


        StudentArray s = new StudentArray(10);
        Student std= new Student(111,"omega",87);
        Student std1= new Student(112,"deebo",92);
        Student std2 = new Student(113,"alpha",90);



        s.insert(111,"derartu",91);
        s.insert(112,"maa",89);
        s.insert(112,"abel",100);
        s.find(111).displayStudent();
        s.deletes(112);
        System.out.println(s.deletes(111));
        s.displayAll();


        int msx = s.get(0).getMark();
        int index = 0;
        for (int i = 0; i <s.size() ; i++) {
            if(s.get(i).getMark()>msx){
                msx=s.get(i).getMark();
                index= i;

            }
        }
        int min= s.get(0).getMark();
        int index1=0;
        for (int i = 0; i <s.size() ; i++) {
            if(s.get(i).getMark()<min){
                min= s.get(i).getMark();
                index1=i;

            }
        }
    }
}
