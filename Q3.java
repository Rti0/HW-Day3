import java.util.Scanner;
public class Q3 {
    public static void main(java.lang.String[] args) {
        Scanner p=new Scanner(System.in);
        System.out.print("Enter the positive number  :");
        int n=p.nextInt();
        System.out.println("the multiplication of "+n+" is :-");
        for(int i=1; i <= 10; i++)
        {
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}


