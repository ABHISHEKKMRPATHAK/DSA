package Proj;

import java.util.Scanner;

public class SelectionSort extends Sort{
 
    public static void main(String[] args){
           Scanner inp = new Scanner(System.in);
        System.out.println("Size of array :");
        int size = inp.nextInt();
        int[] array = init_array(size);
        print_array(array);
    
        long startTime = System.nanoTime();
        int nSwap = 0;
        int nComp = 0;
        for(int i = 0 ; i<array.length;i++){
     
            for(int j = i+1 ; j< array.length;j++){
                if(array[j]<array[i]){
                   swap(array, j, i);
                   nSwap++;
                   System.out.print("Swapped " +  i + " with " +j+"\t" );
                }
                nComp++;
                System.out.println("Compared "+ i + " with " +j);
                print_array(array);
            }
        }
        long stopTime = System.nanoTime();
        double duration = stopTime-startTime/1_000_000_000;
        System.out.println("\n Array after Selection Sort :");
    
        print_array(array);
        System.out.println("Time elapsed   :  " + duration);
        System.out.println("Total comparisons   :  " + nComp);
        System.out.println("Total swaps :  " + nSwap);

    }

}