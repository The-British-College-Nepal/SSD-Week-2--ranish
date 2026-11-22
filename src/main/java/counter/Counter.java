package counter;

/**
 * Step 1: Complete the Counter interface contract.
 *
 * An interface defines a set of operations that classes must provide.
 * Methods declared in an interface have no body and are implicitly public and abstract.
 *
 * Your tasks in Step 1:
 * 1. Declare the method to count words in a sentence:
 *    int countWords(String sentence);
 * 2. Declare the method to count letters in a sentence:
 *    int countLetters(String sentence);
 * 3. Declare the method to get total sentence length:
 *    int getLength(String sentence);
 * 4. Add informative Javadoc comments to each method describing its purpose.
 */

public interface Counter {

    /**
     * Counts the number of words in the given sentence.
     *
     * @param sentence the text to analyse
     * @return the number of words
     */
    int countWords(String sentence);

    /**
     * Counts the number of letters in the given sentence.
     *
     * @param sentence the text to analyse
     * @return the number of letters
     */
    int countLetters(String sentence);

    /**
     * Returns the total length of the given sentence.
     *
     * @param sentence the text to analyse
     * @return the length of the sentence
     */
    int getLength(String sentence);

}


