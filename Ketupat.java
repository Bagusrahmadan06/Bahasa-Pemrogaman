import java.util.Scanner; 
public class Ketupat { 

    public static void main(String[] args) { 
        // TODO code application logic here 
        Scanner sc = new Scanner(System.in); 
		System.out.print("masukan bilangan :"); 
        int i; 
        int n = sc.nextInt(); 
		
        for (i = 0; i < (2 * n) + 1; i++) { 
 
            for (int j = 0; j < (2 * n) + 1; j++) { 
 
                if (i < n) { 
                    if ((j > n - i) && (j < n + i)) { 
                        System.out.print(" "); 
                    } else { 
                        System.out.print("*"); 
                    } 
                } else { 
 
                    if ((j > i - n) && (j < 3*n-i)) { 
                        System.out.print(" "); 
                    } else { 
                        System.out.print("*"); 
                    } 
 
                } 
            } 
            System.out.println(); 
 
        } 
    } 
} 