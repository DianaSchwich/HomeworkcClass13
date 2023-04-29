package HomeworkClass13;

public class Task3 {
    public static void main(String[] args) {

/*
Task3:
How would you swap 2 strings without a temporary variable?
 */

        String word = "Monday";
        String word2 = "Saturday";
        // Before swapping
        System.out.println(word);
        System.out.println(word2);
        // Swapping without a temporary variable
        word = word + word2;
        word2 = word.substring(0, word.length() - word2.length());
        word = word.substring(word2.length());
        // After swapping
        System.out.println(word);
        System.out.println(word2);


    }
}


