package Day3;

import java.util.Scanner;

public class Variable {
    public void cetakBiodata(){
        System.out.println("==================================");
        System.out.println("          Biodata Pengguna        ");
        System.out.println("==================================");

        int usia, tB;
        double bB;
        char golDarah;

        Scanner input = new Scanner(System.in);
        System.out.print("Nama          : ");
        String nama = input.nextLine();
        System.out.print("Usia          : ");
        usia = input.nextInt();
        System.out.print("Tinggi Badan  : ");
        tB   = input.nextInt();
        System.out.print("Berat Badan   : ");
        bB   = input.nextDouble();
        System.out.print("Golongan Darah: ");
        golDarah= input.next().charAt(0);

    }
}
