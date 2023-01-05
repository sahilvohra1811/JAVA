package SEARCHING;

import java.util.Scanner;

class bin_search{
    int search(int arr[] , int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == arr[mid]) {
                return mid;
            }
            if (key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
public class binary_search {
    public static void main(String[] args) {
        System.out.println("BINARY SEARCH :  ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements in ascending order :");
        for (int i = 0; i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to search : ");
        int key = sc.nextInt();

        bin_search b = new bin_search();
        int index = b.search(arr,key);
        System.out.println("Element is present at : " + index);
    }
}
