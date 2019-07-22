import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setup(){
        manager = new Manager("Micheal Scott", "JJ924251P", 29000.00, "Scranton Branch");
    }

    @Test
    public void managerHasName(){
        assertEquals("Micheal Scott", manager.getName());
    }

    @Test
    public void managerHasNiNumber(){
        assertEquals("JJ924251P", manager.getNiNumber());
    }

    @Test
    public void managerHasSalary(){
        assertEquals(29000.00, manager.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(1000);
        assertEquals(30000.00, manager.getSalary());
    }

    @Test
    public void hasPayBonus(){
        assertEquals(290.00, manager.getPayBonus());
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Scranton Branch", manager.getDeptName());
    }


}
