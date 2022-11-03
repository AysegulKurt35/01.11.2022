package day22;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

       int secim=-1;
        do {
            System.out.println("1.Topla");
            System.out.println("2.cikar");
            System.out.println("3.carp");
            System.out.println("4. bol");
            System.out.println("5. Kapat");
            System.out.println("Secim:");
            secim=new Scanner(System.in).nextInt();

        }while (true);
    }
}
