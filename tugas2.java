import java.util.Scanner;
class tugas2{
    public static void main(String[] args) {
        int nilai; int jml=0;
        boolean stop=false;
        Scanner a=new Scanner(System.in);
        for(int jumlah=0;!stop;jumlah++){
            System.out.print("masukkan angka: ");
            nilai= a.nextInt();
            jml=jml+nilai;
            if(nilai==0)
               stop=true; 
            
        }
        System.out.println("jumlah total= " +jml);
       
    }
}