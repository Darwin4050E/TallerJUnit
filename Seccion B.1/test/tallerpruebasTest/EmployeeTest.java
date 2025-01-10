package tallerpruebasTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import java.time.ZoneId;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tallerpruebas.Employee;
import tallerpruebas.EmployeeType;



class EmployeeTest {
	Employee WorkerUSD;
	Employee ManagerEUR;
	Employee SupervisorUSD;
	int month;
	
	
	@BeforeEach
	void setupMonth() {
		month = new Date().toInstant()
		        .atZone(ZoneId.systemDefault()).toLocalDate().getMonthValue();
	}
	
	@BeforeEach
	void setup() {
		WorkerUSD = new Employee(100.00F, "USD", 0.5F, EmployeeType.Worker);
		ManagerEUR = new Employee(100.00F, "EUR", 0.5F, EmployeeType.Manager);
		SupervisorUSD = new Employee(100.00F, "USD", 0.5F, EmployeeType.Supervisor);
		
	}

	@Test
	void WorkerUSD_MonthImparTest() {  
	    assumeTrue((month % 2) != 0); // Simula mes impar
	    assertEquals(164.33334F, WorkerUSD.cs(), 0.00001F); // Incluye décimo
	}

	@Test
	void WorkerUSD_MonthParTest() {
	    assumeTrue((month % 2) == 0); // Simula mes par 
	    assertEquals(100.00F, WorkerUSD.cs()); // No incluye décimo
	}

	@Test
	void ManagerEUR_MonthImparTest() {
	    assumeTrue((month % 2) != 0); // Simula mes impar
	    assertEquals(159.68333F, ManagerEUR.cs(), 0.00001F); // Descuento de moneda, incluye décimo y bonus
	}

	@Test
	void ManagerEUR_MonthParTest() {
	    assumeTrue((month % 2) == 0); // Simula mes par
	    assertEquals(95.35F, ManagerEUR.cs(), 0.00001F); // Descuento de moneda y bonus
	}

	@Test
	void SupervisorUSD_MonthImparTest() {
	    assumeTrue((month % 2) != 0); // Simula mes impar
	    assertEquals(164.50833F, SupervisorUSD.cs(), 0.00001F); // Incluye décimo y bonus
	}

	@Test
	void SupervisorUSD_MonthParTest() {
	    assumeTrue((month % 2) == 0); // Simula mes par
	    assertEquals(100.175F, SupervisorUSD.cs(), 0.00001F); // Solo salario y bonus
	}
	
}