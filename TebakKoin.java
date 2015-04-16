import java.util.*;

public class TebakKoin
{
	public static void main(String[] abc)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("progam tebak gambar dan angka");
		System.out.println("masukan tebakan anda [1:gambar 0:angka]");
		int tebakanUser= sc.nextInt();
		System.out.println("anda menebak ="+(tebakanUser==1?"gambar":"angka"));
		int pcOut = (int) (Math.random()+0.5);
		System.out.println("komputer menghasilkan "+(pcOut==1?"gamabar":"angka"));
		if(tebakanUser==pcOut)
			System.out.println("selamat anda menang");
			else
			System.out.println("kalah");
	}
}