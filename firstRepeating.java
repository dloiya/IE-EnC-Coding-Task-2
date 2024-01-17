public class Main {
    public static int firstRepeated(int[] arr){
        HashSet<Integer> seen = new HashSet<Integer>();
        int ind = -1;

        for(int i = arr.length - 1; i >= 0; i--){
            if(seen.contains(arr[i])) ind = i;
            else seen.add[arr[i]];
        }
        
        if(ind != -1) return ind + 1;
        else return -1;
    }
}