import java.util.Scanner;
public class demowhile {
	public static void main(String[] args) {
	Scanner input = new Scanner( System.in );
		int bil=0;
		System.out.print("Masukkan Bilangan: ");
		bil=input.nextInt();

		if (bil%2==0){
		System.out.println("Bilangan Genap");
		}else{
		System.out.println("Bilangan Ganjil");
		}
	}
}