import java.util.Arrays;

class Solution {
    public int solution(String[] spell, String[] dic) {
        Arrays.sort(spell);
        String spellStr = String.join("", spell);

        for (String word : dic) {
            if (word.length() == spell.length) {
                String[] wordChars = word.split("");
                Arrays.sort(wordChars);
                String sortedWord = String.join("", wordChars);

                if (sortedWord.equals(spellStr)) {
                    return 1;
                }
            }
        }

        return 2;
    }
}