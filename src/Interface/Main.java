package Interface;

public class Main {
    public static void main(String[] args) {

        Dog d1 = new Dog();
        Cat c1 = new Cat();

        d1.sleep();
        d1.eat();
        c1.eat();
        c1.sleep();

        System.out.println(InterfaceOne.defaultFinalVariable);


    }
}
