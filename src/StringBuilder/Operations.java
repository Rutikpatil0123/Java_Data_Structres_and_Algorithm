package StringBuilder;

public class Operations {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");

        System.out.println(sb);

        System.out.println(sb.charAt(1));

        sb.setCharAt(0, 'k');

        System.out.println(sb);

        sb.insert(2,'C');

        System.out.println(sb);

        sb.delete(2,3);

        System.out.println(sb);

        sb.append('M');

        System.out.println(sb);
    }
}
