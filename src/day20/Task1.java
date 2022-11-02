package day20;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
  //      2. Gün isimlerinden ibaret TR-EN sözlük hazırlayınız.
        //Türkçe arama yapılmış ise ingilizcesini, ingilizce arama yapılmış ise Türkçesini ekrana yazdırınız.

        String[] days = {"Monday", "Tuesday ", "Wednesday", "Thursday ", "Friday (", "Saturday ","Sunday "};
        String[] gunler= {"pazartesi","sali","carsamba","persembe","cuma","cumartesi", "pazar"};
        System.out.println("lutfen bir gun giriniz.Turkce veya ingilizce olabilir." );
        System.out.println("Gun/Day:");
        String gun=new Scanner(System.in).nextLine();
        for (int i = 0; i < days.length; i++) {
            if (gun.equalsIgnoreCase(days[i])){
                System.out.println(gunler[i]);
                break;
            } else if (gun.equalsIgnoreCase(gunler[i])) {
                System.out.println(days[i]);
                break;
            }

        }



    }
}
