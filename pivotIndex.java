public class Main {
    public int PivotIndex(int[] arr){
        int templ = 0, tempr = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < i; j++) templ += arr[j];
            for(int j = n + 1; j < nums.length; j++) tempr += arr[j];
            if(templ == tempr) return i;
            templ = tempr = 0;
        }
    }
}
