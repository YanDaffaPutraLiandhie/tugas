import java.util.Scanner;
public class Gaji29 {
     public static void main(String[] args) {
        Scanner input =new Scanner (System.in);

        int jmlMasuk, JmlTdkMasuk, TotGaji ;
        int gaji , potGaji;
        System.out.println("masukkan jumlah hari masuk kerja anda");
        jmlMasuk=input.nextInt();
        System.out.println("masukkan jumlah hari tidak masuk anda");
        JmlTdkMasuk=input.nextInt();
        System.out.println("masukkan jumlah gaji handa");
        gaji=input.nextInt();
        System.out.println("masukkan jumlah potongan gaji anda");
        potGaji=input.nextInt();

        TotGaji=(jmlMasuk*gaji)-(JmlTdkMasuk*potGaji);

        System.out.println("gaji yang anda terima adalah" +TotGaji);


     }
}