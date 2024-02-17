package Proj;

public class SelectionSort{
 
    public static void swap(int[] list , int iIndex ,int eIndex){
        int temp = list[iIndex];
        list[iIndex]=list[eIndex];
        list[eIndex]=temp;
    }

    public static void main(String[] args){
     int[] arr =  {7,5};
    System.out.print(arr[0]);
    System.out.println(arr[1]);
    swap(arr,0,1);
    System.out.print(arr[0]);
    System.out.print(arr[1]);
    }

}