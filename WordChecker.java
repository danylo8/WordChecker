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
            if (!wordList.get(i).contains(wordList.get(i-1)))
            {
                return false;

            }
        }
        return true;
    }

}
