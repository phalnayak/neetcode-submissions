class Solution {
    public boolean isAnagram(String s, String t) {
        // String str1 = s.toLowerCase();
        // String str2 = t.toLowerCase();

        // str1 =str1.replace(" ", "");
        // str2 =str2.replace(" ", "");

        // char[] arr = new char[26];
        // for(int i=0; i<str1.length();i++)
        //     arr[str1.charAt(i)-'a']++;

        // for(int i=0; i<str2.length();i++)
        //     arr[str2.charAt(i)-'a']--;

        // int sum=0;
        // for(int a: arr){
        //     sum = sum+a;
        // }
        // if(sum!=0)
        //     return false;
        // else
        //     return true;  


        String str1 = s.toLowerCase();
        String str2 = t.toLowerCase();

        str1 =str1.replace(" ", "");
        str2 =str2.replace(" ", "");

        char[] arr = new char[26];
        for(int i=0; i<str1.length();i++)
            arr[str1.charAt(i)-'a']++;

        for(int i=0; i<str2.length();i++)
            arr[str2.charAt(i)-'a']--;

       
        for(int a : arr){
            if(a!=0){
                return false;
            }
        }
        return true;
        
    }
}
