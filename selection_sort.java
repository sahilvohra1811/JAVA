package SORTING;

import java.util.Arrays;
import java.util.Scanner;

//Time complexity is O(n square).
class selection{
    void sort(int[] arr){
        for (int i=0;i<arr.length;i--){
            int min = 0;
            for (int j=i+1; j<arr.length;j++){
                if (arr[j]<arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
public class selection_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter your elements : ");
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        bubble b = new bubble();
        b.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
