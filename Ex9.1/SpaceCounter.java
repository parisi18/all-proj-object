public class SpaceCounter {
    public static void main(String[] args) {
        String text = "Count how many spaces are in this sentence.";
        int spaceCount = 0;

        for (char c : text.toCharArray()) {
            if (c == ' ') {
                spaceCount++;
            }
        }

        System.out.println("Number of spaces: " + spaceCount);
    }
}