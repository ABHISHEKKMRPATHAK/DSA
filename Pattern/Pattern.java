public class Pattern{
    public static void main(String[] args) {

        int row =5;
       int column=5;
       /*   Solid rectangle */
        /*
         for (int i = 1; i < row; i++) {
            for (int j = row; j > 0; j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        } 
        */

        /*Hollow rectangle */
     /* 
     for (int i = 0; i < row; i++) {
        for (int j = 0; j < columnn; j++) {
            if (i==0||i==row-1||j==0||j==column-1) {
                System.out.print("*");   
            }
            else
            System.out.print(" ");
        }
        System.out.print("\n");
     }
    } */

    /* Right triangle */
  /*   for (int i = 0; i < row; i++) {
        for (int j = 0; j <= i; j++) {
            System.out.print("*");   
        } 
        System.out.println("");
    } */

     //Inverted right triangle
   /*   for (int i = 0; i < row; i++) {
        for (int j = row; j >= i; j--) {
            System.out.print("*");            
        }
        System.out.println();
     } */

     //Back space right traingle
    /*  for (int i = 1; i <= row; i++) {
        for (int j = row; j>i-1; j--) {
            System.out.print(" ");
        }
        for (int j = 1; j<=i; j++) {
            System.out.print("*");
        }
        System.out.println();
     } */

     //numeral right angle
    /*  for (int i = 1; i <= row; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.printf("%d", j);
        }
        System.err.println();
     } */

     /* Inverted half pyramid (numeral)*/
  
    /*  for (int i = 1; i<=row; i++) {
        for (int j = 1; j<=(row-i)+1 ; j++) {
            System.out.printf("%d",j);
        }
        System.out.println();
     } */

     //Floyd's triangle
    /*  int n=0;
     for (int i = 1; i <= row; i++) {
        for (int j = 0; j < i; j++) {
            n=n+1;
            System.out.print(n+"\t");
        }
        System.out.println();
     } */

     /* 0-1 triangle */
    
     for (int i = 1; i <= row; i++) {
        for (int j = 1; j <=i; j++) {
            if ((i+j)%2==0) {
               System.out.print("1"); 
            }
            else
            System.out.print("0");
        }
        System.out.println();
     }

}
}   

