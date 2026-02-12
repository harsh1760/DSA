class Solution {
    public String[] findRelativeRanks(int[] score) {
            int n=score.length;

            int arr[]=score.clone();
            Arrays.sort(arr);

            HashMap<Integer,Integer>mp=new HashMap<>();
            for(int i=0;i<n;i++){
                mp.put(arr[i],n-i);
            }

            String[] st = new String[n];

        
        for (int i = 0; i < n; i++) {

            int rank = mp.get(score[i]);

            if (rank == 1) st[i] = "Gold Medal";
            else if (rank == 2) st[i] = "Silver Medal";
            else if (rank == 3) st[i] = "Bronze Medal";
            else st[i] = String.valueOf(rank);
        }

        return st;
    }
}