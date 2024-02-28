import java.util.Scanner;

public class GanjilGenap {
    public void genapGanjil() {
        Scanner input = new Scanner(System.in);
        int bil1, bil2, jumlah;

        System.out.println("==================================");
        System.out.println("Menentukan Bilangan Ganjil & Genap");
        System.out.println("==================================");

        System.out.print("Masukkan Bilangan 1= ");
        bil1=input.nextInt();
        System.out.print("Masukkan Bilangan 2= ");
        bil2=input.nextInt();

        jumlah=bil1+bil2;

        if (jumlah % 2 == 0) {
            System.out.println("Jumlah bilangan adalah " + jumlah + " merupakan bilangan genap");
        } else {
            System.out.println("Jumlah bilangan adalah " + jumlah + " merupakan bilangan ganjil");
        }
    }
}
