import java.util.HashMap;
import java.util.Map;

class CharacterPattern {

    private char character;
    private String[] pattern;

    // Constructor
    public CharacterPattern(char character, String[] pattern) {
        this.character = character;
        this.pattern = pattern;
    }

    public char getCharacter() {
        return character;
    }

    public String[] getPattern() {
        return pattern;
    }
}

public class UC6Banner {

    public static void main(String[] args) {

        // Create patterns
        CharacterPattern O = new CharacterPattern('O', new String[] {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        CharacterPattern P = new CharacterPattern('P', new String[] {
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        CharacterPattern S = new CharacterPattern('S', new String[] {
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        });

        // Store in Map
        Map<Character, CharacterPattern> patternMap = new HashMap<>();
        patternMap.put('O', O);
        patternMap.put('P', P);
        patternMap.put('S', S);

        String word = "OOPS";

        // Print banner
        for (int row = 0; row < 7; row++) {
            for (int i = 0; i < word.length(); i++) {
                CharacterPattern cp = patternMap.get(word.charAt(i));
                System.out.print(cp.getPattern()[row] + "  ");
            }
            System.out.println();
        }
    }
}
