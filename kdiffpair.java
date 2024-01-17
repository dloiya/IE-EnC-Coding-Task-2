public class Main {
    public int findPairs(int[] nums, int k){
        Map<Integer, Integer> numFreq = new HashMap<>();
        for (int n : nums) {
            if (numFreq.containsKey(n)) {
                numFreq.put(n, numFreq.get(n) + 1);
            } else {
                numFreq.put(n, 1);
            }
        }

        int count = 0;

        for (int n : numFreq.keySet()) {
            if (k == 0) {
                if (numFreq.get(n) > 1) {
                    count++;
                }
            } else if (numFreq.containsKey(n + k)) {
                count++;
            }
        }

        return count;
    }
}
