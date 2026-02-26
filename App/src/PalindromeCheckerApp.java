//public class PalindromeCheckerApp {
//}


/**
 *

 * MAIN CLASS - PalindromeCheckerApp

 * Use Case 1: Application Entry & Welcome Message

 * Description:
 * This class represents the entry point of the
 * Palindrome Checker Management System.

 * At this stage, the application:
 * - Starts execution from the main() method
 * - Displays a welcome message
 * - Shows application version

 * No palindrome logic is implemented yet.

 * The goal is to establish a clear startup flow.

 * @author krishna
 * @version 1.0

 */

public static void main(String[] args) {

    // Hardcoded string
    String text = "madam";

    boolean isPalindrome =  true;

    int left = 0;
    int right = text.length() - 1;

    // Compare characters from both ends
    while (left < right) {
        if (text.charAt(left) != text.charAt(right)) {
            isPalindrome = false;
            break;
        }
        left++;
        right--;
    }

    // Display result
    if (isPalindrome) {
        System.out.println("\"" + text + "\" is a palindrome.");
    } else {
        System.out.println("\"" + text + "\" is not a palindrome.");
    }
}
