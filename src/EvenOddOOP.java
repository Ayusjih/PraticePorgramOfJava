
    // A class with data (num) and behavior (checkEvenOdd)
    class NumberCheck {
        private int num;

        // Constructor
        public NumberCheck(int num) {
            this.num = num;
        }

        // Method to check Even or Odd
        public void checkEvenOdd() {
            String result = (num % 2 == 0) ? "Even" : "Odd";
            System.out.println(num + " is " + result);
        }
    }

    // Main class
    public class EvenOddOOP {
        public static void main(String[] args) {
            NumberCheck n1 = new NumberCheck(8);  // object with value 7
            n1.checkEvenOdd();                    // call method
        }
    }

