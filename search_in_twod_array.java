package SEARCHING;
import java.util.*;

class twodarray{
    int[] search(int arr[][] , int row , int col,int key){
        for (int i = 0 ; i<row; i++){
            for (int j = 0 ; j<col ; j++){
                if(key == arr[i][j]){
                    return new int[]{i,j} ;
                }
            }
        }
        return new int[]{-1,-1} ;

    }
}
public class search_in_twod_array {
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
        twodarray a = new twodarray();
        int[] index = a.search(arr,row,col,key);
        System.out.println("Element is present at : " + Arrays.toString(index));
    }
}
