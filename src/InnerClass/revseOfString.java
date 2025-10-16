package InnerClass;

public class revseOfString {

    public static void main(String[] args) {

        int count =0;
        String a = "madama";
        int len = a.length();


        for(int i=0;i<=(len/2);i++)

        {
            for(int j=len-1;j>=(len/2);j--)
            {
                if(a.charAt(j) == a.charAt(i))
                {
                    count++;
                }
            }



        }
        if(count>0)
        {
            System.out.println("Palidrome");
        }
        else{
            System.out.println("Not Palidrome");
        }

    }


}
