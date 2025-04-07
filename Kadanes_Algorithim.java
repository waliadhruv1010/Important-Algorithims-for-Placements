public class Kadanes_Algorithim {
    // It is used top get the maximum subarray sum.
    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, 1, -2, 1, 5, 3};

        int max = arr[0];
        int CS = arr[0];

        for (int i = 1; i < arr.length; i++) {
            CS = Math.max(arr[i], CS + arr[i]);
            max = Math.max(max, CS);
        }

        System.out.println("Maximum sum present in the subarray is : " + max);
    }
}
