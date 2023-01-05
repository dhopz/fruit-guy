package fruitguy.Katas;

public class FixPipe {
    public static int[] pipeFix(int[] numbers) {
        int[] result = new int[numbers[numbers.length-1] + 1 - numbers[0]];
        result[0] = numbers[0];

        for (int a = 1; a<(numbers[numbers.length-1] + 1 - numbers[0]); a++) {
            result[a] = result[a-1] + 1;
        }

        return result;
    }
}
