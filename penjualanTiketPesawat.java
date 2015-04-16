import java.util.*;

public class penjualanTiketPesawat
{
 public static void main(String[] abc) throws Exception
 {
  Scanner input = new Scanner(System.in);
  String kelas = "";
  double harga = 0;
  double omset = 0;
  int[] daftarKursi = new int[13];
  do
  {
    System.out.println("\n=========================================");
	System.out.println(" PROGRAM PENJUALAN TIKET PESAWAT TERBANG ");
	System.out.println("=========================================");
	System.out.println("1. PENJUALAN TIKET");
	System.out.println("2. VIEW DAFTAR KURSI YANG KOSONG");
	System.out.println("3. VIEW DAFTAR KURSI YANG TERISI");
	System.out.println("4. VIEW SEMUA DAFTAR KURSI");
	System.out.println("5. VIEW REKAP KURSI");
	System.out.println("6. VIEW OMSET");
	System.out.println("7. SELESAI");
	System.out.print("Masukkan menu yang diinginkan (1-7) : ");
	int pilihan = input.nextInt();
	switch(pilihan)
	{
		case 1:
			System.out.print("Masukkan Nomor Kursi : ");
			int noKursi = input.nextInt();
			if(daftarKursi[noKursi] == noKursi)
			{ 	System.out.println("Nomor Kursi sudah terisi"); break;	}
			
			if(noKursi >= 10 && noKursi <= 13)
			{
				kelas = "Ekonomi";
				harga = 100000;
			}
			else if(noKursi >= 6 && noKursi <= 9)
			{
				kelas = "Bisnis";
				harga = 100000 + (0.5 * 100000);
			}
			else if(noKursi >= 3 && noKursi <= 5)
			{
				kelas = "Eksekutif";
				harga = (100000 + (0.5 * 100000)) + (0.5 * 100000);
			}
			else if(noKursi >= 1 && noKursi <= 2)
			{
				kelas = "VIP";
				harga = (100000 + (0.5 * 100000)) + (0.75 * 100000);
			}
			else
			{	System.out.println("Nomor kursi tidak terdaftar!"); break;}
			
			System.out.println("Harga Kursi Nomor " + noKursi + " : Rp. " + harga);
			System.out.println("-----------------------------------------\n");
			omset = omset + harga;
			daftarKursi[noKursi-1] = noKursi;
			break;
			
		case 2:
			System.out.println("Nomer Kursi yang kosong : ");
			for(int i=0; i < daftarKursi.length; i++)
			{
				if(daftarKursi[i] == 0)
				{	System.out.print((i+1) + " "); }
			}
			System.out.println("\n-----------------------------------------\n");
			break;
		case 3:
			System.out.println("Nomer Kursi yang terisi : ");
			for(int i=0; i < daftarKursi.length; i++)
			{
				if(daftarKursi[i] != 0)
				{	System.out.print((i+1) + " "); }
			}
			System.out.println("\n-----------------------------------------\n");
			break;
		case 4:
			System.out.println("Daftar Kursi : ");
			for(int i=0; i < daftarKursi.length; i++)
			{
				if(daftarKursi[i] != 0)
				{	System.out.println((i+1) + ". Terisi "); }
				else
				{	System.out.println((i+1) + ". Kosong "); }
			}
			System.out.println("\n-----------------------------------------\n");
			break;
		case 5:
			System.out.println("Nomer Kursi yang terisi : ");
			for(int i=0; i < daftarKursi.length; i++)
			{
				if(daftarKursi[i] != 0)
				{	System.out.print((i+1) + " "); }
			}
			System.out.println();
			System.out.println("Nomer Kursi yang kosong : ");
			for(int i=0; i < daftarKursi.length; i++)
			{
				if(daftarKursi[i] == 0)
				{	System.out.print((i+1) + " "); }
			}
			System.out.println("\n-----------------------------------------\n");
			break;
		case 6:
			System.out.println("Total Omset : Rp. " + omset);
			System.out.println("-----------------------------------------\n");
			break;
		case 7:
			System.exit(0);
			break;
		default:
			break;
	}
  }
  while(true);
 }
}