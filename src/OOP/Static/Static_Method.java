package OOP.Static;




public class Static_Method {

    public static void main(String[] args) {

        Static_Method.Greet();

       Static_Method obj = new Static_Method();
       obj.Greeting();

    }


    static void Greet(){
        System.out.println("Im from Static method:");
        Static_Method obj1 = new Static_Method();
        obj1.Greeting();
    }
    void Greeting()
    {
        System.out.println("Im from non static method");

    }

    void fun(){
        Greeting();
    }
    void  fun2(){
        Greet();
    }


}
