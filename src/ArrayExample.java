public class ArrayExample {

    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {10, 20, 30, 40, 50};
        int [] n={0};
        n[0]= numbers[0];
        for(int i =0; i<4;i++)
        {
            n[0] = n[0]+numbers[i];
        }
        int n2 = n[0];
        System.out.println(n2);

        //for (int i = 0; i < numbers.length; i++) {
          //  System.out.println("Element at index " + i + ": " + numbers[i]);
       // }
    }

}