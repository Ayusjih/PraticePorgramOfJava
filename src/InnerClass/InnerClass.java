package InnerClass;

public class InnerClass {
    static class test {
        String name;

        public test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        test a = new test("Ayush");
        test b = new test("Aman");
        System.out.println(a.name);
        System.out.println(b.name);
    }
}

