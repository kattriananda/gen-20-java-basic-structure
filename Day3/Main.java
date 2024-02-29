package Day3;

public class Main {
    public static void main(String[] args) {

        Variable pertama = new Variable();
        pertama.cetakBiodata();

        Aritmatika.aritmatika();

        LayarSegitiga keDua = new LayarSegitiga();//memanggil class Layar Segitiga dengan membuat objek baru
        keDua.segitiga();

        GanjilGenap keTiga = new GanjilGenap();//memanggil class GanjilGenap dengan membuat objek baru
        keTiga.genapGanjil();
    }
}