package JavaProject02;

import java.util.Arrays;

public class Task4Anagrams { /*Check if Two Strings are Anagrams: Given two strings, determine if
they are anagrams, meaning they contain the same characters in a
different order. For example, "listen" and "silent" are anagrams.*/

    boolean isAnagram(String str1,String str2){
        if (str1.length()!=str2.length()){
            return false;
    }else {
            char []arr1=str1.toCharArray();
            char []arr2=str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if (Arrays.equals(arr1, arr2)){
                return true;

            }else {
                return false;
            }
        }

}

    public static void main(String[] args) {
        Task4Anagrams obj=new Task4Anagrams();
        System.out.println("Given words are anagrams : "+obj.isAnagram("silent", "listen"));

    }
}

