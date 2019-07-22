import management.Director;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setup(){
        director = new Director("Micheal Scott", "JJ924251P", 29000.00, "Scranton Branch", 100000.50);
    }

    @Test
    public void directorHasName(){
        assertEquals("Micheal Scott", director.getName());
    }

    @Test
    public void directorHasNiNumber(){
        assertEquals("JJ924251P", director.getNiNumber());
    }

    @Test
    public void directorHasSalary(){
        assertEquals(29000.00, director.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(1000);
        assertEquals(30000.00, director.getSalary());
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Scranton Branch", director.getDeptName());
    }

    @Test
    public void canGetBudget(){
        assertEquals(100000.50, director.getBudget());
    }

    @Test
    public void hasUnequalPayBonus(){
        assertEquals(580.00, director.getPayBonus());
    }

}
