package CS221labs.assgnments.src.assgin3;

public class Student {
    private int id;
    private String name;
    private  int mark;
    public Student(int id,String name,int mark){
        this.id=id;
        this.name=name;
        this.mark=mark;

    }
    public void displayStudent(){
        System.out.println(this.name);
    }
    public int getId(){
        return this.id;

    }
    public int getMark(){
        return mark;

    }


}
