public class Main {
    public static int[] findMissingElements(int[] arr){
        int miss[] = new int[];
        for(int n : arr){
            int ind = Math.abs(n) - 1;
            if(arr[ind] > 0){
                arr[ind] = - arr[ind];
            }
        }

        int post = 1;
        for(int n : arr){
            if(n > 0){
                miss.add[post];
            }
            post++;
        }
    }
}
