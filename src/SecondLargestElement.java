

class Array{
    int temp = 0,secondTemp =0;
    int secondLargest(int[] Ar){
        temp = Ar[0];
        secondTemp =Ar[0];

        for(int i = 0; i<Ar.length;i++)
        {
            if (Ar[i] > temp) {              // naya max mila
                secondTemp = temp;           // purana max → second max
                temp = Ar[i];                // naya max set karo
            } else if (Ar[i] > secondTemp && Ar[i] < temp) {
                secondTemp = Ar[i];          // second largest update karo
            }
        }
        return secondTemp;
    }
}



public class SecondLargestElement {
    public static void main(String[] args) {
       int[] Ar= {2,1,43,54,22,53};
        Array A = new Array();
        int Ans = A.secondLargest(Ar);
        System.out.println(Ans);
    }


}
