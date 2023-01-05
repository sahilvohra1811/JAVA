package SEARCHING;

import java.util.*;

class search{
    int search(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your array size :");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter your elements : ");
        for (int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int key;
        System.out.println("Enter the number that you want to search :");
        key = sc.nextInt();
        for (int i = 0 ; i<size; i++){
            if (key == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
public class linear {
    public static void main(String[] args) {
        System.out.println("LINEAR SEARCH");
        search s = new search();
        int index = s.search();
        System.out.println("Number present at : " + index);

    }
}
