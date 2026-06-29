class Solution {
    public boolean isAnagram(String s, String t) {

        s = s.toLowerCase();
        t = t.toLowerCase();

        s = s.replace(" ","");
        t = t.replace(" ","");

        int[] bucketArray = new int[26];

        for(int i=0; i<s.length(); i++){
            bucketArray[s.charAt(i) - 'a']++;
        }

        for(int i=0; i<t.length(); i++){
            bucketArray[t.charAt(i) - 'a']--;
        }

        for(int count : bucketArray){
            if(count!=0)
                return false;
        }

        return true;


    }
}
