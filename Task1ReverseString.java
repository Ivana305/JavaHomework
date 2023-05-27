package JavaProject02;

public class Task1ReverseString {
    /*Reverse a String: Write a function to reverse a given string. For
    example, given the input "Hello", the output should be "olleH".
    */
   void reverseWord(String word){
            String reveresWord = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reveresWord = reveresWord + word.charAt(i);

            }
            System.out.println(word+" when reversed is "+reveresWord);

        }
    }
class ReverseTester {
    public static void main(String[] args) {
        Task1ReverseString reverse=new Task1ReverseString();
        reverse.reverseWord("Paris");
    }

}


