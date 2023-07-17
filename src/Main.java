import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
// To rotate 90 Degree... Find Transpose first and then do row reverse..
    public static void rotateArray(int[][] array){
        int transposeArray[][] = new int[array[0].length][array.length];
        for (int i = 0 ; i < array[0].length ; i++){
            for (int j = 0 ; j < array.length ; j++){
                transposeArray[i][j] = array[j][i];
            }
        }

        for (int i = 0 ; i < transposeArray.length ; i++){
            int start = 0 ,end = transposeArray.length - 1;
            while (start < end){
                int temp = transposeArray[i][start];
                transposeArray[i][start] = transposeArray[i][end];
                transposeArray[i][end] = temp;
                start++;
                end--;
            }
        }
        System.out.println(Arrays.deepToString(transposeArray));
    }

    public static void main(String[] args) {
        rotateArray(new int[][] {{1,2,3}, {4,5,6}, {7,8,9}});
    }
}