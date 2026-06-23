/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        int n=intervals.size();
        if(n==0)return 0;
        Collections.sort(intervals,Comparator.comparingInt(a->a.start));
        List<List<Interval>> li=new ArrayList<>();
        li.add(new ArrayList<>(List.of(intervals.get(0))));
        for(int i=1;i<n;i++){
            Interval a=intervals.get(i);
            int st=a.start;
            boolean can=false;
            for(List<Interval> temp:li){
                if(temp.get(0).end<=st){
                    temp.add(0,a);
                    can=true;
                    break;
                }
            }
            if(!can){
                li.add(new ArrayList<>(){{
                    add(a);
                }});
            }
        }
        return li.size();      
    }
}
