import java.util.*;

public class LoginV1{
	public static void main (String strs[]){
		Scanner sc = new Scanner (System.in);
		System.out.println("Masukkan Username : ");
		String uname=sc.next();
		System.out.println("Masukkan Password : ");
		String pass=sc.next();
		
		if(uname.equals("admin") && pass.equals("123"))
		{
			System.out.println("Login Sukses");
		}
		else
		{		
			System.out.println("Login Gagal");
		}
	}
}