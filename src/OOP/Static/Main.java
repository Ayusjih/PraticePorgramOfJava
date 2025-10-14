package OOP.Static;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Human   H1=new Human(20,"Ayush","Male",true);
        Human   H2=new Human(16,"Ayushi","Female",true);
        Human   H3=new Human(17,"Ayu","Male",false);
        Human   H4=new Human(19,"Ishu Sharma","Female",false);
        System.out.println(Human.population);


    }

}
