public class Pattern{
    public static void main(String[] args) {
       /*   Solid rectangle */
        /*
         for (int i = 1; i < 5; i++) {
            for (int j = 6; j > 0; j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        } 
        */

        /*Hollow rectangle */
     int m=4;
     int n=3;
     for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            System.out.printf("%d,%d\n", i,j);
        }
        System.out.print("\n");
     }
    }
}

