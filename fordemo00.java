public class fordemo00 {
    public static void main(String[] args) {
        int max = 10;
        System.out.print("Deret Bilangan Ganjil:");
        for(int i=0;i<=max;i++){
            if(i%2!=0 && i!=0){
             System.out.print(i);
            }
            else{
             if(i<max && i!=max && i!=0)
              System.out.print(",");
            }

        }
    }
}