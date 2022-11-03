package day22;

public class LoopLabels {
    public static void main(String[] args) {
        Etiket1:
        for (int i = 0; i < 10; i++) {
            for (int j= 0; i <10 ; j++) {

                if (i*j!=0) {
                   break;
                }
                    System.out.printf("%dx%d\n",i,j);
                }
            System.out.println();


            }

        }
    }

