package com.gla.work.Strings;
      class LC344{
     public void reverseString(char[] s) {

            int j=s.length-1;
            int i=0;
            while(i<j)
            {
                char str=s[i];
                s[i]=s[j];
                s[j]=str;
                i++;
                j--;
            }

       // public static void main(String[] args) {

    }
}
