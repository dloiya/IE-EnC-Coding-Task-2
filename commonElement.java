public class Main {
    public ArrayList<Integer> commonElements(int A[], int B[], int C[]){
        ArrayList<Integer> out = new ArrayList<Integer>();

        HashSet<Integer> MapB = new HashSet<>();
        HashSet<Integer> MapC = new HashSet<>();

        for(int n : B) MapB.add(n);
        for(int n : C) MapC.add(n);

        for(int n : A){
            if(MapB.contains(n) && MapC.contains(n)) {
                out.add(n);
                MapB.remove(n);
                MapC.remove(n);
            }
        }

        return out;
    }
}
