import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static junit.framework.TestCase.assertEquals;

public class DeveloperTest {

    private Developer developer;

    @Before
    public void setup(){
        developer = new Developer("Dwight Schrute", "JJ832492P", 32040.00);
    }

    @Test
    public void developerHasName(){
        assertEquals("Dwight Schrute", developer.getName());
    }

    @Test
    public void developerHasNiNumber(){
        assertEquals("JJ832492P", developer.getNiNumber());
    }

    @Test
    public void developerHasSalary(){
        assertEquals(32040.00, developer.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(4500.62);
        assertEquals(36540.62, developer.getSalary());
    }

    @Test
    public void hasPayBonus(){
        assertEquals(320.40, developer.getPayBonus());
    }

}
