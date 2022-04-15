public class Main {

    public static void main(String[] args) {
        //create an instance of the class CharacterCount and name it myCharacgterCount
        CharacterCounter myCharacterCounter = new CharacterCounter();

        //create a variable ot hold users input data
        String myUsersInput = myCharacterCounter.getUserInput();

        //use this new instance (myCharacterCounter) variable and call the countCharacters method on it
        //and add into parameter the variable made above that holds the users input data
        myCharacterCounter.countCharacters(myUsersInput);
    }
}
