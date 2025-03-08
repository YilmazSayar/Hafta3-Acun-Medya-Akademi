import Hesaplama.Hesapla;

public class Bolme implements Hesapla {

    @Override
    public double islemyap(double sayi1, double sayi2) {
        if (sayi2 == 0) {
            System.out.println("Bir sayıyı sıfıra bölemezsiniz.");
        }
        return sayi1/sayi2;

    }
}
