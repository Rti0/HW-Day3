import java.util.Scanner;
public class Q6 {
    public static void main(java.lang.String[] args) {
        Scanner p = new Scanner(System.in);
        int n;
        char c;
        int even = 0;
        int odd = 0;
        do
        {
            System.out.print("Enter any number ");
            n = p.nextInt();
            if( n % 2 == 0)
            {
                even += n;
            }
            else
            {
                odd += n;
            }
            System.out.print("Do you want to continue y/n? ");
            c = p.next().charAt(0);
        }while(c=='y' || c == 'Y');
        System.out.println("Sum of even numbers: " + even);
        System.out.println("Sum of odd numbers: " + odd);

    }

}


