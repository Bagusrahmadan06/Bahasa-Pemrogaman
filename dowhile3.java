import java.util.*;
public class dowhile3{
	public static void main (String [] ppp){
		boolean selesai = false;
		Scanner sc = new Scanner (System.in);
		int angka = 0;
		int total = 0;
	do 
	{
		System.out.println("masukkan angka [-1 = exit]:");
		angka = sc.nextInt();
		if(angka==-1)
			selesai = true;
		else
		total +=angka;
	}while (!selesai);
	System.out.println("total = " + total);
	}
	
}