import com.company.Antagonist;
import com.company.ItemLeaf;
import com.company.Protagonist;
import com.company.StateOffense;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterTest {
    Protagonist protagonist = Protagonist.getInstance();

    /* modified decision coverage test */
    @Test
    public void stateTest() {
        int resultZero = protagonist.getAttack();
        protagonist.changeState(new StateOffense(protagonist));
        int resultOffense = protagonist.getAttack();

        Assert.assertEquals(resultZero, 22);
        Assert.assertEquals(resultOffense, 26);
    }

    /* 2 boundary equivalence tests */
    @Test
    public void cryTest1() {
        Antagonist antagonist = new Antagonist("PIDGEY", 40, 20, 24, 20);

        protagonist.attacks(antagonist); // see attacks(); calculations and cry(); boundaries
        String result1 = antagonist.cry();
        Assert.assertEquals("*PIDGEY battle noises*", result1);
    }

    @Test
    public void cryTest2() {
        Antagonist antagonist = new Antagonist("PIDGEY", 40, 20, 16, 20);

        protagonist.attacks(antagonist); // see attacks(); calculations and cry(); boundaries
        String result2 = antagonist.cry();
        Assert.assertEquals("*slightly worried PIDGEY noises*", result2);
    }

    @Test
    public void pairWiseTest() {
        Antagonist antagonist = new Antagonist("PIDGEY", 40, 20, 16, 20);
        ItemLeaf leaf = new ItemLeaf("leaf", 10);
        protagonist.changeState(new StateOffense(protagonist));
        protagonist.useItem(leaf);
        protagonist.attacks(antagonist);
        int result = antagonist.getHealth();
        Assert.assertEquals(16, result);
    }

}