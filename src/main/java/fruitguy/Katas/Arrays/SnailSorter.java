package fruitguy.Katas.Arrays;

import java.util.Arrays;

public class SnailSorter {
    public static int[] snail(int[][] array) {
//        https://www.codewars.com/kata/521c2db8ddc89b9b7a0000c1/train/java
        int numRows = array.length;
        int numCols = array[0].length;
        int[] result = new int[numRows * numCols];
        int index = 0;
        for (int row = 0; row < numRows - 1; row++ ){
            for (int col = 0; col < numCols; col++){
                result[index++] = array[row][col];
            }
        }

        int[] lastRow = array[numRows - 1];
        Arrays.sort(lastRow);
        for (int col= numCols - 1; col >= 0; col --){
            result[index++] = lastRow[col];
        }

        return result;
    }

    public static int[] spiral(int[][] array) {
        if (array == null ||array.length == 0 || array[0].length == 0){
            return new int[0];
        }
        int n = array.length;
        int[] result = new int[n * n];
        int index = 0;
        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = n - 1;

        while (rowStart <= rowEnd && colStart <= colEnd){
            for (int col = colStart; col<= colEnd; col++){
                result[index++] = array[rowStart][col];
            }
            rowStart++;

            for(int row = rowStart; row <= rowEnd; row ++){
                result[index++] = array[row][colEnd];
            }
            colEnd--;

            if(rowStart <= rowEnd){
                for(int col = colEnd; col>= colStart; col--){
                    result[index++] = array[rowEnd][col];
                }
            }
            rowEnd--;

            if(colStart<=colEnd){
                for(int row = rowEnd; row >= rowStart; row --){
                    result[index++] = array[row][colStart];
                }
            }
            colStart++;
        }
        return result;

    }

}
