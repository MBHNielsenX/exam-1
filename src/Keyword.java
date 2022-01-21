public class Keyword {
    private String word;
    private String definition;

    public Keyword(String word, String definition) {
        this.word = word;
        this.definition = definition;
    }

    public String getWord() {
        return word;
    }

    public boolean matches (String wordToMatch) {
        String suppliedWord = wordToMatch;
        if (suppliedWord.equals(getWord())) {
            System.out.println("Word is a match");
            return true;
        } else {
            System.out.println("Word does not match");
            return false;
        }
    }
}
