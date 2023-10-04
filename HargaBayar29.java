import java.util.Scanner;
public class HargaBayar29 {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int harga, jumlah, jmlHalBuku;
        double dis, total, bayar, jmlDis;
        String MerkBuku;
        
        System.out.println("merk buku :");
        MerkBuku=input.nextLine();
        System.out.println("jumlah halaman buku :");
        jmlHalBuku=input.nextInt();
        System.out.println("masukkan harga :");
        harga=input.nextInt();
        System.out.println("masukkan jumlah :");
        jumlah=input.nextInt();
        System.out.println("diskon:");
        dis=input.nextDouble();

        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;

        System.out.println("merk buku yang dipilih" + MerkBuku);
        System.out.println("jumlah halaman ;"+jmlHalBuku);
        System.out.println("jumlah batang : " + jumlah);
        System.out.println("diskon :" + dis*100 + "%");
        System.out.println("diskon yang anda terima " + jmlDis);
        System.out.println("jumlah yang harus dibayar adalah:" + bayar);

           }
} 