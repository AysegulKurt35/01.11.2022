package day10;

public class Task {
    public static void main(String[] args) {
        int toplamAlan=alanHesapla(9)+alanHesapla(5);
        System.out.println(toplamAlan);
    }

    public static int alanHesapla(int kenarUzunluk){
        return kenarUzunluk+kenarUzunluk;
    }
}
