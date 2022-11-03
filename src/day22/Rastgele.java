package day22;

import java.util.Random;

public class Rastgele {
    public static void main(String[] args) {
        double sayi=Math.round(100* Math.random());
        System.out.println("Sayi:"+sayi);


        Random rmd=new Random(20000);
        int fiyat= rmd.nextInt(40000);
        System.out.println(fiyat);
    }

}
