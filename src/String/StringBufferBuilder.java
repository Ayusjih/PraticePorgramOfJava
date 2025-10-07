package String;

public class StringBufferBuilder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("code");
        System.out.println(sb);

        sb = new StringBuilder("Codinging");
        sb.append("xyz");
        sb.append(12445.545);
        System.out.println(sb.length());
        StringBuffer sf = new StringBuffer("coding");
        System.out.println(sf);
        System.out.println(sb);

    }

}
