import org.junit.jupiter.api.*;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    Person person;

    @BeforeEach
    public void setup() {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.YEAR, 2000);
        Date date = calendar.getTime();
        person = new Person("Paul", "McCartney", date, true, true, true);
    }

    @Test
    @DisplayName("Deve retornar nome completo")
    public void show_full_name() {
        assertEquals("Paul McCartney", person.fullName());
    }

    @Test
    @DisplayName("Deve retornar o salario anual")
    public void test_calculateYearlySalary() {
        person.setSalary(1200);
        assertEquals(14400, person.calculateYearlySalary());
    }

    @Test
    @DisplayName("Deve retornar TRUE se pessoa isMEI")
    public void person_is_MEI() {
        person.setAnotherCompanyOwner(false);
        person.setPensioner(false);
        person.setPublicServer(false);
        assertTrue(person.isMEI());
    }

    @Test
    @DisplayName("Deve retornar FALSE se pessoa isNotMEI")
    public void person_is_not_MEI() {
        assertFalse(person.isMEI());
    }
}
