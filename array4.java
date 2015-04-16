import java.io.*;
public class array4{
	public static void main(String[] args)throws IOException{
	int[] dRandom=new int[20];
	int total=0;
	int maks; //asumsi paling minimum
	int min; //asumsi paling maksimum
	System.out.print("mengisi dRandom dengan 20 bilangan ");
	
	for(int i=0;i<dRandom.length;i++)
	{
	dRandom[i] = (int)(Math.random()*50.0);
	total +=dRandom[i];
	}
	rataRata = (double)total/(double)dRandom.length;
	System.out.println("menampilkan hasil bil dari dalam");
	
	min = dRandom[0];
	maks = dRandom[0];
	for (j=0;j<dRandom.length;j++){
		if (min>dRandom[j])
			min=dRandom[j];
		if (max>dRandom[j])
			max=dRandom[j];
		total=total+dRandom[j];
		System.out.println("data random ke ["+j+"]"+dRandom);
	}


	System.out.println("Nilai Maksimum "+ maks);
	System.out.println("Nilai Minimum "+min);
	System.out.println("Nilai Rata-Rata "+rataRata);
	}
}