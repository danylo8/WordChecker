import java.util.ArrayList;

public class WordChecker {
    public ArrayList<String> wordList;

    public WordChecker()
    {
        wordList=new ArrayList<>();

    }

    public boolean isWordChain()
    {
        for (int i=1; i< wordList.size(); i++)
        {

            // contains checks if a specific part of a string is in the list
            //int i functions as our loop variable.  It is initialized as 1 and will increment until i is no longer less than the size of the wordList instance variable.

            if (!wordList.get(i).contains(wordList.get(i-1)))
            {
                return false;

            }
        }
        return true;
    }


    public ArrayList<String> createList(String target) {
        ArrayList<String> result = new ArrayList<>();
        //colon takes each value in a list
        for (String word : wordList) {
            
            if (word.startsWith(target)) {
                result.add(word.substring(target.length()));
            }
        }
        return result;
    }

}
