import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder line = new StringBuilder(sc.next());
        String copy = line.toString();

        if(line.reverse().toString().equals(copy)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}