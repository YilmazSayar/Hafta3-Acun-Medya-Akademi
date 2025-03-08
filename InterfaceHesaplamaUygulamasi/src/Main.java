import Hesaplama.Hesapla;

import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. sayıyı giriniz: ");
        double sayi1 = scanner.nextInt();
        System.out.println("2. sayıyı giriniz: ");
        double sayi2 = scanner.nextInt();




        Hesapla toplama = new Toplama();
        System.out.println("Toplama işlemi sonucu: "+ toplama.islemyap(sayi1,sayi2));

        Hesapla cıkarma = new Cıkarma();
        System.out.println("Çıkarma işlemi sonucu: "+ cıkarma.islemyap(sayi1,sayi2));

        Hesapla carpma = new Carpma();
        System.out.println("Çarpma işlemi sonucu "+carpma.islemyap(sayi1,sayi2));

        Hesapla bolme = new Bolme();
        System.out.println("Bölme işlemi sonucu: "+bolme.islemyap(sayi1,sayi2));



        }
    }
