import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CharacterCounter {

//create method countCharacters
    public void countCharacters (String wordToCount){
        //make case-insensitive
        wordToCount = wordToCount.toLowerCase();

        //turn a string into an array of chars. splits array into chars.
        char[] arrayOfChars = wordToCount.toCharArray();

        //use HASHMAP data structure to store character counts. THe hashmap is named myCharacterCount
        HashMap<Character, Integer> myCharacterCount = new HashMap<>();

        //loop through array one char at a time
        for (int i = 0; i <arrayOfChars.length; i++) {

            //exclude non-alphabetic characters
            if(Character.isLetter(arrayOfChars[i]) == false) {
                continue;
            });

            //initialize the Hashmap named myCharacterCount. add or update the count into the hashmap.
            char theCharacter = arrayOfChars[i];
            if (myCharacterCount.containsKey(theCharacter) == false) {

                //Does not contain the key
                myCharacterCount.put(theCharacter, 1);

            } else {
                //does contain the key. update integer value.
                Integer theValue = myCharacterCount.get(theCharacter);
                theValue = theValue +1;
                myCharacterCount.put(theCharacter, theValue);
            }

        }

        ArrayList<Character>myCharacterKeys = new ArrayList<>(myCharacterCount.keySet());
        for(int i = 0; i < myCharacterKeys.size(); i++) {
            Integer theValue = myCharacterCount.get(myCharacterKeys.get(i));
            System.out.println(myCharacterKeys.get(i) + ": " + theValue);
        }
    }

    //prompt user for input
    public String getUserInput() {
        Scanner myScanner = new Scanner(System.in);

        String myUsersInput = myScanner.nextLine();

        myScanner.close();

        return myUsersInput;
    }


}
