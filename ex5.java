package tp1;
import java.util.Scanner;
public class ex5 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Entrez un entier : ");
        int n = sc.nextInt();
        
        long fact = 1;  
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        
        System.out.println("La factorielle de " + n + " est " + fact);
        
        sc.close();
    }
}