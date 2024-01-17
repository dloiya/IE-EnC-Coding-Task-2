public class Solution {

    static boolean isValid(int[] A, int std, int max) {
        int students = 1;
        int currentPages = 0;

        for (int pages : A) {
            if (currentPages + pages > max) {
                students++;
                currentPages = 0;
            }

            currentPages += pages;
        }

        return students <= std;
    }

    public static int findPages(int[] A, int N, int M) {
        if (N < M) return -1;

        int left = 0;
        int right = Integer.MAX_VALUE;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (isValid(A, M, mid)) {
                right = mid;
            } else {

                left = mid + 1;
            }
        }

        return left;
    }
}
