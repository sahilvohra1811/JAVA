package SEARCHING;
import  java.util.*;

class bstwodarray{
    int[] search(int arr[][] , int row , int col,int key){
        int r = 0;
        int c = arr.length-1;
        while (r < arr.length && c >= 0){
            if(arr[r][c] == key){
                return new int[]{r,c};
            }
            if(arr[r][c] < key){
                r++;
            }
            else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
public class binarysearchintwoDarrays {
    public static void main(String[] args) {
        System.out.println("Search element in 2D arraye:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row : ");
        int row = sc.nextInt();
        System.out.println("Enter column : ");
        int col = sc.nextInt();
        System.out.println("Enter your array elements : ");
        int[][] arr = new int[row][col];
        for (int i = 0 ; i<row; i++){
            for (int j = 0 ; j<col ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Your array : ");
        for (int i = 0 ; i<row; i++){
            for (int j = 0 ; j<col ; j++){
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        int key;
        System.out.println("Enter element you want to search : ");
        key = sc.nextInt();
        bstwodarray a = new bstwodarray();
        int[] index = a.search(arr,row,col,key);
        System.out.println("Element is present at : " + Arrays.toString(index));
    }
}
