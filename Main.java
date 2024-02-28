
public class Main {
    public static void main(String[] args) {

        Masukan nilai = new Masukan("Kattria Nanda");
        System.out.println("Username: "+ nilai.username);

        Aritmatika perTama = new Aritmatika(); //memanggil class aritmatika
        perTama.aritmatika();

        LayarSegitiga keDua = new LayarSegitiga();//memanggil class Layar Segitiga
        keDua.segitiga();

        GanjilGenap keTiga = new GanjilGenap();//memanggil class GanjilGenap
        keTiga.genapGanjil();
    }
}