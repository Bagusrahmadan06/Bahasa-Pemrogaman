import java.util.Scanner;

public class makanan
{
    public static void main(String[] args)
    {
		Scanner scan = new Scanner(System.in);
		int harga = 0;
		int h1 = 3000, h2 = 5000, h3 = 4000;
        System.out.println("MENU MAKANAN : ");
        System.out.println("===================================");
        System.out.println("No Nama             Harga");
        System.out.println("1. Soto Ayam        Rp 3000,00");
        System.out.println("2. Nasi Rawon       Rp 5000,00");
        System.out.println("3. Gado - Gado      Rp 4000,00");
        System.out.println("");

        String menu;

        for (String i = "Y"; i.equals("Y")||i.equals("y"); )
        {
        System.out.println("===================================");
		System.out.println("Masukkan Nomor Pesanan : ");     
        int inNomor = scan.nextInt();
		
        System.out.println("===================================");
        if (inNomor == 1)
        {
            menu = " Soto Ayam";
            System.out.println("Pilihan anda nomor " +inNomor + menu);
            harga = harga + h1 ;
        }
            else if (inNomor == 2)
            {
                menu = " Nasi Rawon";
                System.out.println("Pilihan anda nomor " +inNomor + menu);
                harga = harga + h2;
            }
                else if (inNomor == 3)
                {
                    menu = " Gado - Gado";
                    System.out.println("Pilihan anda nomor " +inNomor + menu);
                    harga = harga + h3;
                }
                     else
                    {
                        System.out.println("Nomor yang dipilih tidak ada di menu.");
                    }

            System.out.println("Apakah anda mau melanjutkan? Y/T");
            i = scan.next();

        }
          System.out.println("===================================");
        System.out.println("Total pembayaran sebesar " +harga+".");
    }
}