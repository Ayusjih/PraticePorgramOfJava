package OOP;


class demo{
    private String name;
     private int rollNo;
     private float marks;

    demo(){
        this.name ="aYUSH";
        this.rollNo=124;
        this.marks=1123;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }
}


public class Demo1 {
    public static void main(String[] args) {

        demo ayush= new demo();
        //ayush.name="Ayush";
        //ayush.marks=124;
        //ayush.rollNo=124123;
        //System.out.println(ayush.name+" "+  ayush.marks+" "+ayush.rollNo );
        ayush.setName("OJHA");
        System.out.println(ayush.getName());
        System.out.println("hello");

    }






}


