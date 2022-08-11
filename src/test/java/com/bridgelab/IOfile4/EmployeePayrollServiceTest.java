package com.bridgelab.IOfile4;

import java.util.Arrays;
import org.junit.Test;

import com.bridgelab.IOfile4.EmployeePayrollService.IOService;;

public class EmployeePayrollServiceTest {
	
	private static final IOService FILE_IO = null;

	@Test
	public void given3EmployeesWhenWrittenToFileShouldMatchEmployeeEntries() {
		EmployeePayrollData[] arrayofEmp = {
				new EmployeePayrollData(1,"Jeff", 1000000.0),
				new EmployeePayrollData(2,"Jeff", 2000000.0),
				new EmployeePayrollData(3,"Jeff", 3000000.0),
		};
		EmployeePayrollService employeePayrollService;

		employeePayrollService = new EmployeePayrollService(Arrays.asList(arrayofEmp));
		employeePayrollService.writeEmployeePayrollData(FILE_IO);
		employeePayrollService.printData(FILE_IO);
	}
	
	 @Test
	    public void givenFileOnReadingFromFile() {
	        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
	        employeePayrollService.readEmployeePayrollData(FILE_IO);
	    }
	
	

}
