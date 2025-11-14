package Interface;

public interface InterfaceOne {
    int defaultFinalVariable = 10;
    void eat();
    public void sleep();

    default  void greeting()
    {        System.out.println("asda");    }
}
