import java.util.*;
class Menu{
 public static void main (String[]args){
  Scanner sc=new Scanner(System.in);
  
  String[]menu={"Soto Ayam","Gado-gado","Nasi Rawon","Es Teh","Es Jeruk"};
  int[]harga={10000,8000,10000,2000,5000,2000};
  String not="";
  int stot=0;
  int tot=0;
  int bayar=0;
  int kembalian=0;
  System.out.println();
  System.out.println("\"Nama Makanan dan Minuman\"");
  System.out.println();
  System.out.println("Makanan \t\tHarga");
  System.out.println();
  
  for(int i=0; i<menu.length;i++){
   System.out.println((i+1) + "." + menu[i]+"\t\t"+harga[i]);
  }
  String jawab="y";
  while(jawab.equalsIgnoreCase("y")){
    System.out.println();
    System.out.print(" pilihan Makanan dan Minuman: ");
    int pilih=sc.nextInt();
    System.out.println();
    System.out.println(menu[pilih-1]);
    System.out.println();
    
    System.out.print(" Jumlah Pesanan : ");
    int a=sc.nextInt();
    System.out.println("Harga : "+harga[pilih-1]);
    stot=harga[pilih-1]*a;
    System.out.println("Bayar : "+stot);
    System.out.println();
    System.out.print("Apakah ingin Memesan lagi ? (Y /T) ");
    
    not+=menu[pilih-1]+"\t\t"+a+" Porsi\t\t"+"Rp. "+harga[pilih-1]+"\t"+"Rp. "+stot+""+"\n";
    tot+=stot;
    jawab=sc.next(); 
    System.out.println();
	
	if(jawab.equalsIgnoreCase("T"))
	{
		System.out.println("Total bayar : "+tot);
		do
		{
			System.out.print("Bayar : ");
			bayar=sc.nextInt();
			kembalian = bayar - tot;
			if(kembalian < 0)
			{
				System.out.println("\nUang Tidak cukup, silahkan inputkan dengan benar");
			}
		}while(kembalian < 0);
	}
  }
   
    System.out.println("\t\tNota");
	
    System.out.println("MENU \t\t\tJUMLAH \t\tHARGA \t\tSUBTOTAL");
    System.out.println("=================================================================");
    System.out.println(not);
    System.out.println("\t\t\t\t\t\t\t------------ (+)");
    System.out.println("\t\t\t\t\tTotal bayar\t: Rp. "+tot);
	System.out.println("\t\t\t\t\tBayar      \t: Rp. "+bayar);
	System.out.println("\t\t\t\t\t\t\t------------ (-)");
	System.out.println("\t\t\t\t\tKembalian  \t: Rp. " + kembalian);
  
   
  
 }
}




