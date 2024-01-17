public class Main {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> res = new ArrayList<>();
        int l = 0, r = arr.length - 1;
        int m;

        while(l < r){
            m = l + (r - l)/2;
            if(arr[m] < x) l = m + 1;
            else r = mid;
        }

        int s = l - 1, e = l;

        while(k > 0){
            if(s < 0){
                res.add(arr[e]);
                e++;
            } else if(e >= arr.length){
                res.add(0, arr[s]);
                s--;
            } else {
                if(Math.abs(arr[s] - x) <= Math.abs(arr[e] - x)){
                    res.add(0, arr[s]);
                    s--;
                } else {
                    res.add(arr[e]);
                    e++;
                }
            }
            k--;
        }

        return res;
    }
}
