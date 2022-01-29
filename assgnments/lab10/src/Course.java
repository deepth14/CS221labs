import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Course {
    private String cId;
    private String cName;
    private int creditHours;

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public Course(String cId, String cName, int creditHours) {
        this.cId = cId;
        this.cName = cName;
        this.creditHours = creditHours;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cId='" + cId + '\'' +
                ", cName='" + cName + '\'' +
                '}';
    }
    public static void list(List<Course > c){

        HashMap<String,Course > al= new HashMap();
        for (Course s: c) {

            al.put(s.getcId(),s);
        }

        System.out.println(al);
    }

    public static void main(String[] args) {

        Course  c1 = new Course ("CS201", "pp",4);
        Course  c2 = new Course ("CS230", "OOP",6);
        Course  c3 = new Course ("CS240", "Data structre",5);
        Course [] c= {c1,c2,c3};
        List<Course > cc= new ArrayList<>(List.of(c));
        list(cc);
    }
}
