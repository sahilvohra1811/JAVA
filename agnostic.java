package SEARCHING;
import java.util.*;
// This is also called order of agnostic : it means when you dont know the order (ascending or decending )of elements.
class ag_binary_search{
    int search(int arr[] , int key){
            int start = 0;
            int end = arr.length - 1;

            boolean ascending = arr[start] < arr[end];

            while (start  <= end){
                int mid = (start + end)/2;
                if (key == arr[mid]){
                    return mid;
                }
                if(ascending){
                    if(key < arr[mid]) {
                        end = mid - 1;
                    }
                    else{
                        start = mid + 1;
                    }
                }
                else{
                    if(key < arr[mid]) {
                        start = mid + 1;
                    }
                    else{
                        end = mid - 1;
                    }
                }

            }
            return  -1;
    }
}
public class agnostic {
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

        ag_binary_search b = new ag_binary_search();
        int index = b.search(arr,key);
        System.out.println("Element is present at : " + index);
    }
}
