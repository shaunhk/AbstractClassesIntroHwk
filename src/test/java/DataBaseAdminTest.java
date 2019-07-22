import org.junit.Before;
import org.junit.Test;
import techStaff.DataBaseAdmin;

import static junit.framework.TestCase.assertEquals;

public class DataBaseAdminTest {

    private DataBaseAdmin dataBaseAdmin;

    @Before
    public void setup(){
        dataBaseAdmin = new DataBaseAdmin("Dwight Schrute", "JJ832492P", 32040.00);
    }

    @Test
    public void dataBaseAdminHasName(){
        assertEquals("Dwight Schrute", dataBaseAdmin.getName());
    }

    @Test
    public void dataBaseAdminHasNiNumber(){
        assertEquals("JJ832492P", dataBaseAdmin.getNiNumber());
    }

    @Test
    public void dataBaseAdminHasSalary(){
        assertEquals(32040.00, dataBaseAdmin.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        dataBaseAdmin.raiseSalary(4500.62);
        assertEquals(36540.62, dataBaseAdmin.getSalary());
    }

    @Test
    public void hasPayBonus(){
        assertEquals(320.40, dataBaseAdmin.getPayBonus());
    }

}
