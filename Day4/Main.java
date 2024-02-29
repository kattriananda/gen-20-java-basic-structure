package Day4;

import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);//inisialisasi obj scanner
        int input=0;
        char input2;
        while (true) { //meminta user memasukkan pilihan hingga benar
            System.out.println("Ingin Mengerjakan Tugas Apa? ");
            System.out.println("1. Deret Bil yang Habis dibagi 3 tapi tidak habis di bagi 2");
            System.out.println("2. Penjumlahan deret bilangan sebanyak n ");
            System.out.print("Masukkan Pilihan Anda = ");
            if (in.hasNextInt()) {
                input = in.nextInt();
                if (input == 1) {
                    Modulus3 mod = new Modulus3();
                    mod.modulus3();
                    System.out.println();
                    System.out.println("Ingin melanjutkan?(Y/N)");
                    input2 = in.next().toUpperCase().charAt(0);
                    if (input2 == 'Y'){
                    }else{
                        break;
                    }
                } else if (input == 2) {
                    JumlahN jml = new JumlahN();
                    jml.cekJumlahN();
                    System.out.println();
                } else {
                    System.out.println("Pilihan yang kamu masukkan tidak tersedia");
                    System.out.println();
                   // break;
                }
            } else {
                System.out.println("Masukkan Pilihan Anda = " + input);
            }
        }

    }
}
