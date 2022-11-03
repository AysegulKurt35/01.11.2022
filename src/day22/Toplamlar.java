package day22;

import javax.swing.text.LabelView;

public class Toplamlar {
    public static void main(String[] args) {
        int[] numbers={1,3,5,6,8,10};
        int toplam=0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%2==0)
                break ;
            toplam+=numbers[i];

        }
    }
}
