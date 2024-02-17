package Proj;

import java.util.Scanner;

public class Sort {

   
    public static void swap(int[] list , int iIndex ,int eIndex){
        int temp = list[iIndex];
        list[iIndex]=list[eIndex];
        list[eIndex]=temp;
    }
    public static int[] init_array(int n){
        Scanner inp = new Scanner(System.in);
        int[] arr = new int[n];
        for(int i = 0; i < n ;i++){
            System.out.print("arr["+i+"]");
            arr[i] = inp.nextInt();
        }
        return arr;
    }
        public static void print_array(int[] arr){
            System.out.print("[");
            for(int i = 0; i < arr.length ;i++){
            System.out.print(arr[i]+",");
            }
            System.out.print("]");
    }
}
