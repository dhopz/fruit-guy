package fruitguy;

import java.util.Arrays;

import static fruitguy.Katas.Arrays.OddsOrEvens.oddOrEven;

public class App {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(snail(array)));
    }

    public static int[] snail(int[][] array) {
//        https://www.codewars.com/kata/521c2db8ddc89b9b7a0000c1/train/java
        int numRows = array.length;
        int numCols = array[0].length;
        int[] result = new int[numRows * numCols];
        int index = 0;
        for (int i = 0; i < numRows; i++ ){
            for (int col = 0; col < numCols; col++){
                result[index++] = array[i][col];
            }
        }

        return result;
    }




}



