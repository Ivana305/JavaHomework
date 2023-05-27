package JavaProject02;

public class Task5NonRepeatingChar {/*Find the First Non-Repeating Character in a String: Given a string,
find and return the first non-repeating character. For example, in the
string "abracadabra", the first non-repeating character is 'c'.*/
    public static void main(String[] args) {
        String string = "abracadabra";
        for (char chars : string.toCharArray()) {
            if (string.indexOf(chars) == string.lastIndexOf(chars)) {
                System.out.println("First non repeating character is " + chars);
                break;
            }
        }
    }}




