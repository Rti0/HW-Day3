import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("Enter the String  :");
        String s = p.nextLine();
        char ch[] = s.toCharArray();
        String rev = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            rev += ch[i];
        }
        System.out.println("the reverse String is :" + rev);
    }
}
