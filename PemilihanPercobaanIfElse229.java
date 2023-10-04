import java.util.Scanner;
public class PemilihanPercobaanIfElse229 {
    public static void main(String[] args) {
        Scanner input29 = new Scanner(System.in);
        System.out.print("nilai uas :");
        float uas = input29.nextFloat();
        System.out.print("nilai uts :");
        float uts = input29.nextFloat();
        System.out.print("nilai kuis :");
        float kuis = input29.nextFloat();
        System.out.print("nilai tugas :");
        float tugas = input29.nextFloat();
       
        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        
       if (total>80){
        System.out.print("nilai anda adalah A ");
       }
         else  if (total > 73 && total <= 80){
         System.out.print("nilai ujian anda B+");
        }
         else if (total > 65 && total <= 73){
            System.out.print("nilai ujian anda B");
         }
         else if (total > 60 && total <= 65){
            System.out.print("nilai ujian anda c+");   
         }
         else if ( total >50 && total <= 60){
            System.out.print("nilai ujian anda c");
         }
         else if (total > 39 && total <=50){
            System.out.print("nilai ujian anda D");
         }
         else if (total >= 39){
            System.out.print("nilai ujian anda E");
         }
        
        
       
}
}
