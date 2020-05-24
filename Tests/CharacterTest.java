import com.company.Antagonist;
import com.company.Protagonist;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterTest {
    Protagonist protagonist = Protagonist.getInstance();

    /* 2 boundary value tests */

    @Test
    public void cryTest1() {
        Antagonist antagonist1 = new Antagonist("PIDGEY", 40, 20, 24, 20);

        protagonist.attacks(antagonist1);
        String result1 = antagonist1.cry();
        Assert.assertEquals("*PIDGEY battle noises*", result1);
    }

    @Test
    public void cryTest2() {
        Antagonist antagonist2 = new Antagonist("PIDGEY", 40, 20, 16, 20);

        protagonist.attacks(antagonist2);
        String result2 = antagonist2.cry();
        Assert.assertEquals("*slightly worried PIDGEY noises*", result2);
    }
}