package OOP.Static;


class Human{
    private int age;
    private String name;
    private String gender;
    private  Boolean Married;
     static int population;

    public Human(int age, String name, String gender, Boolean married) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        Married = married;
        Human.population += 1;
        System.out.println(age+": age   "+name+": name  "+gender+": gender  "+married+": Married    ");
    }
}

