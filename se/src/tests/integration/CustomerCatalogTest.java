package tests.integration;

import org.junit.jupiter.api.Test;
import main.integration.CustomerDTO;
import main.integration.InvalidIDException;
import main.integration.catalogs.CatalogException;
import main.integration.catalogs.CustomerCatalog;
import static org.junit.Assert.*;

public class CustomerCatalogTest {
    private static final int DATABASE_UNREACHABLE = 1337;
    private int customerExistInSystem = 123456789;
    private int customerNotExistInSystem = 987654321;
    private int customerIDIsZero = 0;
    private CustomerDTO validCustomer;
    private CustomerDTO invalidCustomer;


    @Test
    public void testcustomerInRegister(){
        CustomerCatalog customerCatalog = new CustomerCatalog();
        invalidCustomer = new CustomerDTO("hejsan svejsan", 123123123);
        validCustomer = new CustomerDTO("Karl Karlsson", 123456789);
        boolean expResult = true;
        boolean result = customerCatalog.customerInRegister(customerExistInSystem);
        assertEquals("The expected customer does not  exist in the catalog.", expResult, result);
    }

    @Test
    public void testcustomerNotInRegister(){
        CustomerCatalog customerCatalog = new CustomerCatalog();
        boolean expResult = false;
        boolean result = customerCatalog.customerInRegister(customerNotExistInSystem);
        assertEquals("The expected customer does exist in the catalog.", expResult, result);
    }

    @Test
    public void testcustomerIDisZero(){
        CustomerCatalog customerCatalog = new CustomerCatalog();
        boolean expResult = false;
        boolean result = customerCatalog.customerInRegister(customerIDIsZero);
        assertEquals("The expected customer does exist in the catalog.", expResult, result);
    }

    @Test
    public void testGetCustomerInvalidIDException() {
        CustomerCatalog customerCatalogA = new CustomerCatalog();
        int customerID = 111111111;
        assertThrows(InvalidIDException.class, () ->  customerCatalogA.getCustomer(invalidCustomer, customerID));   
    }

    @Test
    public void testGetCustomerCatalogException() throws CatalogException {
        CustomerCatalog customerCatalogB = new CustomerCatalog();
        assertThrows(CatalogException.class, () ->  customerCatalogB.getCustomer(validCustomer, DATABASE_UNREACHABLE));   
    }

    
}
