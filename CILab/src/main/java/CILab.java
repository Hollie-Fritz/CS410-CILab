import  java.lang.Character.*;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        return false;
    }

}

