import java.util.*;
public class dowhile2{
	public static void main (String [] ppp){
		Scanner sc = new Scanner (System.in);
		int angka = 0;
		int total = 0;
	do 
	{
		System.out.println("masukka angka [999 = exit]:");
		angka = sc.nextInt();
		total +=angka;
	}while (angka!=999);
	System.out.println("total = " + total);
	}
	
}