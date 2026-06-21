class Solution {
    public boolean isAnagram(String s, String t) {
        // int[] s1=new int[26];
        // int[] s2=new int[26];
        // int n=s.length();int m=t.length();
        // if(n!=m)return false;
        // for(int i=0;i<n;i++){
        //     s1[s.charAt(i)-97]++;
        //     s2[t.charAt(i)-97]++;
        // }
        // for(char ch:s.toCharArray()){
        //     if(s1[ch-97]!=s2[ch-97]){
        //         return false;
        //     }
        // }
        // return true;
        int[] cnt=new int[26];
        int n=s.length();int m=t.length();
        if(n!=m)return false;
        for(int i=0;i<n;i++){
            cnt[s.charAt(i)-97]++;
            cnt[t.charAt(i)-97]--;
        }
        for(int i:cnt){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}
