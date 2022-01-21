package CS221labs.assgnments.src.assgin3;

public class StudentArray {
    private Student [] a;
    private int nElems;
    Student std;
    public StudentArray(int max){
        a= new Student[max];
        nElems=0;

    }
    public Student find(int id){
        for (int i = 0; i <a.length ; i++) {
            return a[i];
        }
        insert(id,null,0);
        return a[a.length];
    }
    public void insert(int id,String name,int mark){
        for (int i = 0; i <a.length ; i++) {
            if(a[i]!= null){
                if(a[i].getId()==id){
                    System.out.println("student that id already exist");
                }
            }
            std = new Student(id,name,mark);
            for(int j=0;j<a.length;j++){
                if(a[i]==null){
                    a[i]=std;
                    nElems++;
                }
            }
        }
    }


    public boolean deletes(int id){
        for(int i=0;i<a.length;i++){
            if(a[i].getId()==id){
                remove(i);
                return true;
            }
        }
        return false;
    }
    public void remove(int index){
        if(index<0||index>nElems){
            throw new ArrayIndexOutOfBoundsException();

        }
        Student hand=a[index];
        for (int i=index+1;i<nElems;i++){
            a[i-1]=a[i];

        }
        nElems--;
    }
    public int size(){
        return this.nElems;
    }

    public Student get(int index){
        if(index<0||index>nElems)
            throw new ArrayIndexOutOfBoundsException();
        for(int i=0;i<nElems;i++){
            if(i==index)
                return a[i];

        }
        return null;
    }
public void displayAll(){
    for (int i = 0; i <a.length ; i++) {
        if(a[i]!=null){
            a[i].displayStudent();
        }
    }
}
}
