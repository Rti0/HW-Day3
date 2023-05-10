import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int n;
        char c;
        int pos = 0;
        int neg = 0;
        int zero=0;
        do
        {
            System.out.print("Enter any number ");
            n = p.nextInt();
            if( n > 0)
            {
                pos++;
            }
            else if(n<0)
            {
                neg++;
            }
            else
            {
                zero++;
            }
            System.out.print("Do you want to continue y/n? ");
            c = p.next().charAt(0);
        }while(c=='y' || c == 'Y');

        System.out.println("\nTotal Positive Number: " +pos);
        System.out.println("Total Negative Number: " +neg);
        System.out.println("Total Zero: " +zero);
    }
}

