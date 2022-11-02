package day19;

public class homeWork {
    public static void main(String[] args) {

        int[] arr= {56, 75, 90, 47, 83, 58, 33, 86, 92, 65, 90, 45};
        int toplam = 0;
        double average = 0.0;
        for (int i = 0; i < arr.length; i++) {
            toplam = toplam + arr[i];


        }
        average = toplam/12.0;
        System.out.println("Average = " + average);
    }


}


