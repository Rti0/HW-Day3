import java.util.Scanner;
public class Q4 {
    public static void main(java.lang.String[] args) {
        int i,fact=1;
        Scanner p=new Scanner(System.in);
        System.out.print("Enter the number  :");
        int n=p.nextInt();
        for(i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+n +" is: "+fact);
    }
}


