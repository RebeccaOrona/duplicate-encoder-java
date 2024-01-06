import java.util.HashMap;

public class Main {

    static String encode(String word){
        // Ignore capitalization in received word and transform it into a char array
        char[] charArray = word.toLowerCase().toCharArray();
        StringBuilder newString = new StringBuilder();

        // Use a dictionary to store the counts
        HashMap<Character, Integer> counts = new HashMap<>();
        for (char c : charArray) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }
        // Build the new string based on character counts
        for (char c : charArray) {
            newString.append(counts.get(c) == 1 ? "(" : ")");
        }

        return new String(newString);
    }

    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        System.out.println("Prespecialized: " + encode("Prespecialized"));
        System.out.println("   ()(   : " + encode("   ()(   "));
    }
}
