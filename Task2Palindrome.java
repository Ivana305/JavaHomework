package JavaProject02;

public class Task2Palindrome {
    /*Check if a String is Palindrome: Determine whether a given string is a palindrome,
    which means it reads the same forwards and backward. For example, "madam" is a palindrome.*/
      void palindrome(String word){
        String reveresWord="";
        for (int i = word.length()-1; i >=0 ; i--) {
            reveresWord=reveresWord+word.charAt(i);
        }if (reveresWord.equalsIgnoreCase(word)){
        System.out.println("Word "+word+ " is palindrome");}
        else System.out.println("Word "+word +" is NOT palindrome");

    }
}
class PalindromTester {
    public static void main(String[] args) {
      Task2Palindrome palindrome=new Task2Palindrome();
      palindrome.palindrome("madam");
    }
}
