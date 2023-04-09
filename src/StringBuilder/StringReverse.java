package StringBuilder;

public class StringReverse {

    public static void main(String[] args) {


        StringBuilder sb = new StringBuilder("HEllo");

        for (int i = 0; i < sb.length()/2; i++){

            int fornt = i;
            int back = sb.length()-1-i;

            char a = sb.charAt(fornt);
            char b = sb.charAt(back);

            sb.setCharAt(fornt, b);
            sb.setCharAt(back, a);
        }

        System.out.println(sb);
    }
}
