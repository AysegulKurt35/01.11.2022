package day20;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        String[] months = {"ocak", "subat", "mart", "nisan", "mayis", "haziran"};
        System.out.println("Kacinci ayi sectiniz?[1-12]:");
        Scanner scan = new Scanner(System.in);
        int secim = scan.nextInt();
        if (secim > 0 && secim <= 12) {


            System.out.printf("Secilen ay %s",months [secim-1]);
        } else {
            ;
        }
    }
}
