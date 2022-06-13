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
        CharacterIterator it = new StringCharacterIterator(myString);

        while (it.current() != CharacterIterator.DONE)
        {
            if(Character.isUpperCase(it.current())){
                return true;
            }
            else
                it.next();
        }
        return false;
    }

}

