import java.util.Scanner;

public class Aritmatika {
    public void aritmatika(){ //contruktur

        System.out.println("==================================");
        System.out.println("         Operasi Aritmatika       ");
        System.out.println("==================================");

        Scanner input = new Scanner(System.in);
        int A, B, jumlah, kurang, kali, bagi;

        System.out.print("Bilangan 1= ");
        A= input.nextInt();
        System.out.print("Bilangan 2= ");
        B= input.nextInt();

        jumlah= A + B;
        kurang= A-B;
        kali  = A*B;
        bagi  = A/B;

        System.out.println("Jumlah = "+jumlah);
        System.out.println("Kurang = "+kurang);
        System.out.println("Kali   = "+kali  );
        System.out.println("Bagi   = "+bagi  );
    }
}
