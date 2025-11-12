package Encapsulation;

public class First {

    private int num;
    private String Name;
    public First(int num, String Name){
        this.num = num;
        this.Name = Name;
    }
    void display()
    {
        System.out.println(" "+num);
    }

    public int getNum() {
        return this.num;
    }

    public void setNum(int num) {
        this.num = num;
    }


    public void setName(String name) {
        this.Name = name;
    }
}
