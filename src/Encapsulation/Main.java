package Encapsulation;

public class Main {
    public static void main(String[] args) {
        First obj = new First(12,"123");
        //obj.num;// can not be accessed due to private
        obj.display();
        System.out.println(obj.getNum());

    }
}
