package IWVG.SwC.Chinegua.calculos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {

    private User us;

    @Before
    public void before() {
        us = new User(2, "aitor", "bernal");
    }

    @Test
    public void testUser() {
        assertEquals(2, us.getNumber());
        assertEquals("Aitor", us.getName());
        assertEquals("Bernal", us.getFamilyName());
    }

    @Test
    public void testFullName() {
        assertEquals("Aitor Bernal", us.fullName());
    }

    @Test
    public void testInitials() {
        assertEquals("A.", us.initials());
    }

    @Test
    public void testFullNameUpperCase() {
        assertEquals("AITOR BERNAL", us.getFullNameUpperCase());
    }

}
