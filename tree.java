 public class Main {
    int findMaxSawBlade(int[] treeH, int M){
        Arrays.sort(treeH);
        int l = 0;
        int r = treeH[treeH.length - 1];
        int m;
        while(l < r){
            m = r - (r - l) / 2;
            if(canCut(treeH, m, M)) l = m;
            else r = m - 1;
        }

        return l;
    }

    static boolean canCut(int[] treeH, int h, int wood){
        int ttl = 0;
        for(int n : treeH){
            if(n > h) ttl += (n - h);
        }

        return ttl >= wood;
    }
}
