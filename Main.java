import java.util.ArrayList;

public class Main
    {
        public static void main(String[] args)
        {
            WordChecker wordChecker = new WordChecker();

            wordChecker.wordList.add("an");
            wordChecker.wordList.add("band");
            wordChecker.wordList.add("band");
            wordChecker.wordList.add("abandon");

            boolean isWordChain= wordChecker.isWordChain();
            System.out.println(isWordChain);

            WordChecker wordCheckerTwo = new WordChecker();

            wordCheckerTwo.wordList.add("to");
            wordCheckerTwo.wordList.add("too");
            wordCheckerTwo.wordList.add("stool");
            wordCheckerTwo.wordList.add("tools");

            boolean isWordChainTwo=wordCheckerTwo.isWordChain();
            System.out.println(isWordChainTwo);

            WordChecker wordCheckerThree = new WordChecker();

            wordCheckerThree.wordList.add("catch");
            wordCheckerThree.wordList.add("bobcat");
            wordCheckerThree.wordList.add("catchacat");
            wordCheckerThree.wordList.add("cat");
            wordCheckerThree.wordList.add("at");

            ArrayList<String> resultList = wordCheckerThree.createList("cat");
            System.out.println(resultList);

            WordChecker wordCheckerFour = new WordChecker();

            wordCheckerFour.wordList.add("catch");
            wordCheckerFour.wordList.add("bobcat");
            wordCheckerFour.wordList.add("catchacat");
            wordCheckerFour.wordList.add("cat");
            wordCheckerFour.wordList.add("at");

            ArrayList<String> resultList2 = wordCheckerFour.createList("catch");
            System.out.println(resultList2);

            WordChecker wordCheckerFive = new WordChecker();

            wordCheckerFive.wordList.add("catch");
            wordCheckerFive.wordList.add("bobcat");
            wordCheckerFive.wordList.add("catchacat");
            wordCheckerFive.wordList.add("cat");
            wordCheckerFive.wordList.add("at");

            ArrayList<String> resultList3 = wordCheckerFive.createList("dog");
            System.out.println(resultList3);
        }
    }
