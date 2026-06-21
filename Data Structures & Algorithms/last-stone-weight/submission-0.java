class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxH=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:stones){
            maxH.add(i);
        }
        while(maxH.size()>1){
            int a=maxH.poll();
            int b=maxH.poll();
            if(a==b)continue;
            maxH.add(Math.abs(a-b));
        }
        if(maxH.isEmpty())return 0;
        return maxH.poll();
    }
}
