import java.util.Scanner;
import java.lang.Math;;
public class compoundIntrest{
    public static void main(String[] args) {
        double A,P,j,n,k,C,D;
        Scanner uScanner=new Scanner(System.in);
        System.out.println("Please enter the intial amount:");
        P=uScanner.nextDouble();
        System.out.println("Please Enter the interest rate(0-100%)");
        j=uScanner.nextDouble();
        System.out.println("Please enter the number of times for your ivestment:");
        n=uScanner.nextDouble();
        System.out.println("Please enter the number of years for your investment:");
        k=uScanner.nextDouble();
        A=P*(1+(j/100)/n);
        System.out.println("Your Interest is:");
        D=Math.pow(A, (n*k));
        System.out.println(D);
        
    }
}