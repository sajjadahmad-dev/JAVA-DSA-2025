public class searchInStrn{
    public static void main(String[] args) {
        String name = "sajjad";
        char target = 'j'; // Single quotes for characters
        boolean ans = SearchInString(name, target); // Corrected to return a boolean
        System.out.println(ans); // Prints whether the character is found or not
    }

    static boolean SearchInString(String str, char target) { // Added the target parameter
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true; // Return true if the target is found
            }
        }
        return false; // Return false if the target is not found
    }
}