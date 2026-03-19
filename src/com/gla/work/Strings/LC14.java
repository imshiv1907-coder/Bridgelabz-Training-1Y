package com.gla.work.Strings;

public class LC14 {

        public String longestCommonPrefix(String[] strs) {
            //Arrays.sort(strs);
            int i=0;
            String ans="";
            while(i<strs[0].length()&&i<strs[strs.length-1].length()){
                if(strs[0].charAt(i)!=strs[strs.length-1].charAt(i)){
                    return ans;
                }
                else {
                    char ch = strs[0].charAt(i);
                    ans+=ch;
                }
                i++;
            }
            return ans;
        }
    public static void main(String[] args) {
    }

    {
    }
}
