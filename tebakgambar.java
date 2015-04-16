public class tebakgambar{
	public static void main (String []ars){
	String []label= {"gambar","angka"};
	int []score={0,0};
	System.out.println("ke\t|hasil lemparan");
	System.out.println("====================");
	for (int i=0;i<12;i++){
		int r=(int)(Math.random()+0.5);
		System.out.println((i+1) + "\t|\t" + label[r]);
		score[r]++;
	}
	System.out.println("==================");
	for (int i=0;<label.length;i++){
		System.out.println("score " +label[i] + "=" + score[i]);
	}
	if (score[0]>score[1])
		System.out.println("gambar menang");
	else if(score[0]<score[1])
		System.out.println("angka menang");
	else
		System.out.println("seri");
}
}