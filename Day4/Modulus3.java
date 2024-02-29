package Day4;

import java.util.Scanner;

public class Modulus3 {
    public void modulus3 (){
        System.out.println("==================================");
        System.out.println("    Menentukan Bilangan Positif   ");
        System.out.println("   Pertama yang habis dibagi tiga ");
        System.out.println("         tidak habis dibagi 2     ");
        System.out.println("==================================");

        Scanner input = new Scanner(System.in); //membuat objek input

        System.out.print("Masukkan nilai n = "); //memasukkan nilai n
        int n = input.nextInt();

        System.out.println("Bilangan Positif yang dihasilkan adalah = ");

        for (int i = 1, count = 0; count < n;i++){
            if (i%3 == 0 && i%2!=0){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println();
    }
}
