package JavaProject02;

public class Task3CountWords {
    public static void main(String[] args) {

    /*Count the Number of Words in a String: Write a function to count the number of words in a given string.
Words are separated by spaces or punctuation. For example, the input "Hello, world!" should return 2.*/
        String word = "Hello,Java world!";
        int count=word.split("\\s+|\\p{Punct}+").length;
        System.out.println("Count of words in sentence is "+count);
    }



}