package Day4;

import java.util.Scanner;

public class JumlahN {
    public void cekJumlahN() {
        System.out.println("=========================");
        System.out.println("   Menentukan Jumlah N   ");
        System.out.println("=========================");

        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = in.nextInt();
        int count = jumlahN(n);
        System.out.println("Hasil Penjumlahan= "+count);
    }
    public static int jumlahN(int n){
        int i=1, count=0;
        while (i<=n){
            count+=i;
            i++;
        }
        return count;
    }
}
