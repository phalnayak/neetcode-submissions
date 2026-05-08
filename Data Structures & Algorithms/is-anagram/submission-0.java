class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s_arr = s.toCharArray();
        char[] t_arr = t.toCharArray();

        Arrays.sort(s_arr);
        Arrays.sort(t_arr);

        String s_sorted =  new String(s_arr);
        String t_sorted =  new String(t_arr);

        System.out.println(s_sorted);
        System.out.println(t_sorted);

        if(s_sorted.equals(t_sorted))
            return true;
        else
            return false;




    }
}
