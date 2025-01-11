package tallerpruebas;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {
	Employee workerUSD;
	Employee supervisorUSD;
	Employee managerUSD;
	Employee workerEUR;
	Employee supervisorEUR;
	Employee managerEUR;
	
	@BeforeEach
    public void setUp() {
        workerUSD = new Employee(650.50F, "USD", 0, EmployeeType.Worker);
        workerEUR = new Employee(650.63F, "EUR", 0, EmployeeType.Worker);
        supervisorUSD = new Employee(1025.5F, "USD", 0, EmployeeType.Supervisor);
        supervisorEUR = new Employee(1025.5F, "EUR", 0, EmployeeType.Supervisor);
        managerUSD = new Employee(1500.6F, "USD", 0, EmployeeType.Manager);
        managerEUR = new Employee(1500.6F, "EUR", 0, EmployeeType.Manager);
    }
	
	@Test
    public void testCalculateYearBonus_Worker_USD() {
        assertEquals(386.0, workerUSD.CalculateYearBonus(), 0.01);
    }

    @Test
    public void testCalculateYearBonus_Worker_EUR() {
        assertEquals(386.0, workerEUR.CalculateYearBonus(), 0.01);
    }

    @Test
    public void testCalculateYearBonus_Supervisor_USD() {
        assertEquals(1218.5F, supervisorUSD.CalculateYearBonus(), 0.01); 
    }

    @Test
    public void testCalculateYearBonus_Supervisor_EUR() {
        assertEquals(1167.225F, supervisorEUR.CalculateYearBonus(), 0.01); 
    }

    @Test
    public void testCalculateYearBonus_Manager_USD() {
        assertEquals(1886.6F, managerUSD.CalculateYearBonus(), 0.01); 
    }

    @Test
    public void testCalculateYearBonus_Manager_EUR() {
        assertEquals(1811.57F, managerEUR.CalculateYearBonus(), 0.01); 
    }
}
