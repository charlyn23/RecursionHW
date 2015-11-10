/**
 * Created by charlynbuchanan on 11/5/15.
 */
public class EvenWord {
    //why is this here?

    public static boolean isEven(String word)
    {
        //this is a lot of commenting, not necessary

        char[] wordArray = word.toCharArray();
        if(wordArray.length % 2 != 0) //make it clear why you need this (words like banana)
        {
            return false;
        }
        if(wordArray.length == 0)
        {
            return true;
        }

        // check also not needed, you can write else (it's not going to be negative and you checked for 0 already)
        //check first letter, find in string, remove both <- good comment
        char letterRemoved = word.charAt(0);
        word = word.replace(String.valueOf(letterRemoved), "");
        // you check for length == 0 already...why here again?
        // why the call to isEven twice?

        return isEven(word);

    }

    public static void main(String[] args)
    {
        // add more tests
        System.out.println(isEven("tattletale"));
    }
}
