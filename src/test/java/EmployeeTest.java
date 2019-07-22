import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import techStaff.DataBaseAdmin;

import static junit.framework.TestCase.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Before
    public void setup(){
        employee = new DataBaseAdmin("Dwight Schrute", "JJ832492P", 32040.00);
    }

    @Test
    public void cantRaiseSalaryDown(){
        employee.raiseSalary(-342.42);
        assertEquals(32040.00, employee.getSalary());
    }

    @Test
    public void canChangeName(){
        employee.setName("Andy Bernard");
        assertEquals("Andy Bernard", employee.getName());
    }

    @Test
    public void cantChangeNameToNothing(){
        employee.setName(null);
        assertEquals("Dwight Schrute", employee.getName());
    }

}
