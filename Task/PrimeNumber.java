package Task;
import java.util.Scanner;

public class PrimeNumber {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
    	System.out.println("Enter A Number : ");
        long n = scn.nextLong();
        
        if(n == 1) {
            System.out.println(n +" Its Not A PrimeNumber");
            return;
        }
        
        for(int i=2;i<n;i++) {
            if(n % i == 0) {
                System.out.println(n+" Its Not A PrimeNumber");
                return;
            }
        }
        
        System.out.println(n+" is A PrimeNumber");
    }
}