class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length;
        int difftype=n/2;

        HashSet<Integer>ml=new HashSet<>();
        for(int i=0;i<n;i++){
            ml.add(candyType[i]);
        }

        return Math.min(ml.size(),difftype);
            
    }
}