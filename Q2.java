import java.util.Scanner;
public class Q2 {
    public static void main(java.lang.String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("Enter the String  :");
        java.lang.String s = p.nextLine();
        char ch[] = s.toCharArray();
        java.lang.String rev = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            rev += ch[i];
        }
        System.out.println("the reverse String is :" + rev);
    }
}
