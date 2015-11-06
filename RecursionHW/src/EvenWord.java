/**
 * Created by charlynbuchanan on 11/5/15.
 */
public class EvenWord {

    String word;

    public static boolean isEven(String word)
    {
        //turn string into an array of characters
        //if word is an odd number of letters, return false

        //for the length of the word;
        //find letters that appear twice; remove
        ////find letters that appear twice; remove
        //////find letters that appear twice; remove

        char[] wordArray = word.toCharArray();
        if(wordArray.length % 2 != 0)
        {
            return false;
        }
        if(wordArray.length == 0)
        {
            return true;
        }

        if(wordArray.length >= 0)
            {
                //check first letter, find in string, remove both
                char letterRemoved = word.charAt(0);
                word = word.replace(String.valueOf(letterRemoved), "");
                isEven(word);
                if (wordArray.length == 0){
                    return true;
                }

            }
        return isEven(word);

    }

    public static void main(String[] args)
    {
        System.out.println(isEven("tattletale"));
    }
}
