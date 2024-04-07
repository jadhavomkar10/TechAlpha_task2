// code by : Omkar Jadhav

public class HollowButterflynew {

    public static void main(String[] args) {
        char alpha ='A';

        for (int j = 1; j <= 5; j++) {

            for (int k = 1; k <= j; k++) {
                if(k==1 || k==j )
                    System.out.print(alpha);
                else
                    System.out.print(" ");
                alpha++;
            }

            // Spaces
            for (int k = 5; k >= j; k--) {
                System.out.print("  ");
            }
            char alpha1 = 'A';

            for (int k = 1; k <= j; k++) {
                if(k==1 || k==j )
                    System.out.print(alpha1);
                else
                    System.out.print(" ");
                    alpha1++;
                    alpha--;
            }

            System.out.println();
        }


            char alpha3 = 'A';
            for (int j = 0; j <= 4; j++) {

            for (int k = 4; k >= j; k--) {
                // loop
                if(k==4 || k==j)
                    System.out.print(alpha3);
                else
                    System.out.print(" ");
                alpha3++;

            }

            for (int k = 0; k <= j; k++) { // Spaces
                System.out.print("  ");
            }
            char alpha4 = 'A';
            for (int k = 4; k >= j; k--) {
                if(k==4 || k==j)
                    System.out.print(alpha4);
                else
                    System.out.print(" ");
                alpha4++;
                alpha3--;
            }

            System.out.println();
        }
    }

}
