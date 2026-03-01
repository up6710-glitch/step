import java.util.HashMap;
import java.util.Map;

class characterPattern {

    private String[] pattern;

    public CharacterPattern(String[] pattern) {
        this.pattern = pattern;
    }

    public String[] getPattern() {
        return pattern;
    }
}

public class UC8 {

    private static Map<Character, CharacterPattern> patternMap = new HashMap<>();

    // Static block to load patterns
    static {

        patternMap.put('O', new CharacterPattern(new String[] {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        }));

        patternMap.put('P', new CharacterPattern(new String[] {
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        }));

        patternMap.put('S', new CharacterPattern(new String[] {
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        }));
    }

    public static void main(String[] args) {

        String word = "OOPS";
        int height = 7;

        for (int row = 0; row < height; row++) {

            for (char ch : word.toCharArray()) {

                CharacterPattern cp = patternMap.get(ch);

                if (cp != null) {
                    System.out.print(cp.getPattern()[row] + "  ");
                }
            }

            System.out.println();
        }
    }
}