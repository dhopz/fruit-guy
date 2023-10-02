package fruitguy.Katas.Arrays;

public class SumParts {
    public static int[] partsSums(int[] ls) {
        int currentSum = 0;
        int[] result = new int[ls.length + 1];

        for (int i = ls.length - 1; i >= 0; i--) {
            currentSum += ls[i];
            result[i] = currentSum;
        }

        return result;
    }
    public static int[] sumParts(int[] ls) {

        if (ls.length == 0) {
            return new int[] {0};
        }

        int[] resultArray = new int[ls.length];

        int i = 0;
        while (ls.length > 1) {
            int totalSum = 0;
            for (int num : ls) {
                totalSum += num;
            }

            resultArray[i] = totalSum;
            i++;

            int[] newArray = new int[ls.length - 1];
            System.arraycopy(ls, 1, newArray, 0, ls.length - 1);
            ls = newArray;
        }

        if (ls.length == 1) {
            resultArray[i] = ls[0];
        }

        resultArray[resultArray.length - 1] = 0;

        return resultArray;
    }




    public static int[] removeElement(int[] ls, int indexToRemove){
        int[] arr_new = new int[ls.length - 1];
        int j = indexToRemove;
        for (int z = 0, k = 0; z < ls.length; z++) {
            if (z != j) {
                arr_new[k] = ls[z];
                k++;
            }
        }
        return arr_new;
    }

    public static int calculateSum(int[] ls, int arrLength){
        int total = 0;

        for (int i = arrLength; i < ls.length; i++) {
            total += ls[i];
        }

        return total;
    }


    public static int[] sumPartsTry(int[] ls) {
        //https://www.codewars.com/kata/5ce399e0047a45001c853c2b/train/java
        int[] sums = new int[ls.length+1];

        int i = 0;
        for (int sum : sums) {
            int total = 0;
            if(i==0){
                for (int n : ls) {
                    total += n;
                }

            } else {
                total = calculateSum(ls,i);
            }

            sums[i++] = total;

        }
        return sums;
    }

}
