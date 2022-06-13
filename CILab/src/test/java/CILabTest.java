import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    @Test
    public void getStringTest() {
        String result = myString.getString();
        assertEquals(null, result);
    }
    @Test
    public void detectCapitalUseTest1() {
        myString.setString("USA");
        assertEquals(true, myString.detectCapitalUse());

    }
    @Test
    public void detectCapitalUseTest2() {
        myString.setString("leetcode");
        assertEquals(false, myString.detectCapitalUse());
    }

    @Test
    public void detectCapitalUseTest3() {
        myString.setString("lEEtcode");
        assertEquals(true, myString.detectCapitalUse());
    }

    @Test
    public void detectCapitalUseTest4() {
        myString.setString("Google");
        assertEquals(true, myString.detectCapitalUse());
    }

    @AfterAll
    static void tearDownAll(){
    }


}