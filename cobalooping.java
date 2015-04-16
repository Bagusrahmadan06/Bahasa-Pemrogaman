import java.util.Scanner;
class cobalooping
{
	public static void main(String[] abc) throws Exception
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan n : ");
		int n = input.nextInt();
		
		for(int i = 0; i < n; i++)
		{
			System.out.println(n+n);
			n++;
			
		}
	}
}