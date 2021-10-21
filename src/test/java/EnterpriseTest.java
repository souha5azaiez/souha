import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.junit.Before;
import org.junit.Test;





//import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Contrat;
import tn.esprit.spring.entities.Entreprise;
//@RunWith(SpringRunner.class)
//@SpringBootTest
public class EnterpriseTest {
	

    @Before
    public void setUp() {
        System.out.println("\nRunning setUp...");
    }
    
    Logger l = LoggerFactory.getLogger(EnterpriseTest.class);
	
	/*private static final Logger l =
			(Logger) LogManager.getLogger(EnterpriseTest.class);*/

	@Test
	public void test() {
		
		Entreprise c = new Entreprise(1,"ebtr1","social1");
		
		assertNotNull(c.getName());
	l.info("retrieveUser : "+ c);
	
	
		
		
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		
		assertTrue(c.getName().equals("ebtr1"));
		
		l.info("addUser : "+ c);
		fail("Not yet implemented");
	}

}
