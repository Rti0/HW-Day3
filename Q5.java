import java.util.Scanner;
public class Q5 {
    public static void main(java.lang.String[] args) {
        Scanner p=new Scanner(System.in);
        System.out.print("Enter the Base :");
        int base=p.nextInt();
        System.out.print("Enter the exponent :");
        int exponent = p.nextInt();

        long result = 1;

        for (; exponent != 0; --exponent) {
            result *= base;
        }

        System.out.println("power = " + result);
    }
}


