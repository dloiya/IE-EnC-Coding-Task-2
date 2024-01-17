public class Main {
    public int findMaxSubArray(int arr[], int k){
        int avg = 0, temp = 0, ind = 0;
        
        for(int i = 0; i < k; i++) avg += arr[i];
        temp = avg;
        int start = 0;

        for(int i = k; i < arr.length; i++){
            avg += arr[i] - arr[i - k];
            if(temp < avg){
                temp = avg;
                ind = start + 1;
            }
            start++;
        }

        return ind;
    }
}
