public class VarSwapper{
	public static void main (String []argc){
		int a=50;
		int b=20;
		//int c=0;
		//cetak variabel a dan b
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("nilai var a dipindah ke b\ndan isi b dipindah ke var a");
		
		//proses pindah ke varibael
		a=a+b;
		b = a-b;
		a -=b;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		
		
	}
	
}