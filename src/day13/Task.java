package day13;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
         /*
   Klavyeden userName ve password bilgisi alinacaktir.
   Eger her iki veri dogru ise "Yonetim sayfasina hosgeldiniz"mesaji verilecektir.
   Eger parola yanlis ise "Yanlis parola girdiniz.lutfen tekrar deneyiniz"mesaji verilecektir.
   Eger kullanici adi yanlis ise "Lutfen sistem yoneticisi ile irtibat kurunuz mesaji verilecektir"
    */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kullanici adinizi  giriniz.");
        int kullaniciAdi = scan.nextInt();
        System.out.println("Lutfen sifrenizi giriniz");
        int sifre = scan.nextInt();

        int ayse = 1234;
        int fatma = 5678;

        if (kullaniciAdi == ayse  & sifre==fatma) {
            System.out.println("Yonetim Sayfasina Hosgeldiniz.");
        } else if (!(sifre == fatma)) {
            System.out.println("Yanlis parola girdiniz.Lutfen tekrar girin");

        } else if (!(kullaniciAdi==ayse)) ;
        System.out.println("Lutfen sistem yoneticisi ile irtibata gecin");

    }
}
