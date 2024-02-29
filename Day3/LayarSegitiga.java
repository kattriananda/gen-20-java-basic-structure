package Day3;

import java.util.Scanner;

public class LayarSegitiga {
    public void segitiga () {
        System.out.println("==================================");
        System.out.println("           Layar Segitiga         ");
        System.out.println("==================================");


        Scanner input = new Scanner(System.in);
        int tinggi, i, j;

        System.out.print("Masukkan Tinggi Segitiga = ");
        tinggi=input.nextInt();
        System.out.println();

        for (i=1;i<=tinggi; i++){
            for(j=1; j< i; j++){
                System.out.print("* ");
            }
            System.out.println("*");
        }

    }
}
