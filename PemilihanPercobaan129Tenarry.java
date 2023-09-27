import java.util.Scanner;
public class PemilihanPercobaan129Tenarry{
    public static void main(String[] args) {
    Scanner input29 = new Scanner(System.in);
    System.out.print("masukkan angka ");
    int angka = input29.nextInt();
        String hasil = (angka % 2 ==0) ? "ganjil" : "genap";
        System.out.println("angka" + angka + "merupakan bilangan" + hasil);     
} 
}