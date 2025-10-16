package StaticBlock;

public class StaticBlock {

    static int a = 4;
    static int b;

    static{// CALL AT THE TIME OF CLASS CREATIONN IN THE jvm
        System.out.println("in a static block");
        b = a*5;
    }
    public static void main(String[] args)
    {

        System.out.println(StaticBlock.a+ " "+StaticBlock.b);


        StaticBlock ab = new StaticBlock();
        System.out.println(ab.a+ " "+ab.b);

        b+=5;

        StaticBlock abc = new StaticBlock();
        System.out.println(abc.a+ " "+abc.b);
    }


}
