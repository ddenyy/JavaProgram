import java.util.Arrays;

public class RandomWithWeight {
    private static int[] values = {1,2,3,4,5};
    private static int[] ranges;
    private static int[] weight = {3, 1, 10, 2, 5};
    private static int sum;

    public static int getRand()
    {
        int random = (int) (Math.random() * (sum - 1));
        int index = Arrays.binarySearch(ranges, random);
        return values[index >= 0 ? index : -index - 2];

    }

    public static void main(String[] args) {

        for (int i = 0; i < values.length; i++)
        {
            sum += weight[i];
        }

        ranges = new int[values.length];
        int left_border = 0;
        for (int i = 0; i < values.length; i++)
        {
            left_border += weight[i];
            ranges[i] = left_border;
        }

    }
}
