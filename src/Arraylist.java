import java.util.ArrayList;

public class Arraylist {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(5);
        ArrayList<Integer> list1 = new ArrayList<>(5);
        list.add(1445);
        list.add(125);
        list.add(165);
        list.add(175);
        list.add(185);
        list.add(195);
        list.add(105);
        list.add(115);
        list.add(135);
        list.add(135);
        list.add(125);
            // can perfrom multi qppreation

        if(list.equals(list))
        {
            return ;
        }
        else {
            System.out.println("not");
        }

        System.out.println(list );
    }


}
