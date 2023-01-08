package BTVN_T3;

import java.util.Random;
import java.util.Scanner;

public class WordGuess {

    private final String[] words = {
            "testing", "hello", "world", "template", "java"
            ,   "maining", "computer", "processor", "univercity"
            ,   "boolean", "string", "integer", "character"
            ,   "indicator", "controller", "model", "view"
    };

    private String secretWord;

    private boolean[] secretWordMatches;

    public static void main(String[] args)
    {
        WordGuess aWordGuess = new WordGuess();
        aWordGuess.setSecretWord();
        aWordGuess.runGame();
    }

    public void setSecretWord(String word) {
        secretWord = word;
    }

    private void setSecretWord() {
        Random rand = new Random();
        secretWord = words[rand.nextInt(words.length-1)];
    }

    public String getSecretWord() {
        return secretWord;
    }

    public String getTrialWordWithMatches()
    {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < secretWord.length(); i++) {
            str.append( (secretWordMatches[i] ? secretWord.charAt(i) : '_') );
        }
        return str.toString();
    }


    public void checkTrialWord(char ch)
    {
        for (int i = 0; i < secretWord.length(); i++)
        {
            if (secretWordMatches[i]) {
                continue;
            }
            secretWordMatches[i] = secretWord.charAt(i) == ch;
        }
    }

    public void runGame()
    {
        Scanner in = new Scanner(System.in);
        secretWordMatches = new boolean[secretWord.length()];
        int trials = 0;
        while (true) {
            System.out.print("Key in one character or your guess word: ");
            String trialWord = (in.hasNext()) ? in.next() : "";

            trials++;

            if (trialWord.length() < 1) {
                continue;
            }

            if (trialWord.length() == 1) {
                checkTrialWord(trialWord.charAt(0));
                trialWord = getTrialWordWithMatches();
                System.out.printf("Trail %1$d: %2$s\n", trials, trialWord);

            }

            if (trialWord.equals(secretWord)) {
                System.out.printf("Trail %d: Congratulation!\n", trials);
                break;
            }
        }
        System.out.printf("You got in %d trials\n", trials);
    }
}
