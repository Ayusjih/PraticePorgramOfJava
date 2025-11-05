package Polymorphism;

public class Overideing {
    int num;
    Overideing(int num){
        this.num = num;
    }
    public String toString(){
        return "num"+" = "+num;
    }
    public static void main(String[] args) {
        Overideing O1 = new Overideing(23);
        System.out.println(O1);
    }

}


