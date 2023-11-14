//@Author Caleb Dochow
package JUnit;

import static org.junit.Assert.*;
import accounts.*;
import org.junit.Before;
import org.junit.Test;

public class CalebDochowTest {

	Member member;
	
	@Before
	public void setUp() throws Exception {
		member = new Member("Jane Doe", 99999, "1234 Mt Tabor Rd", "Murfreesboro", "TN", 90210);
	}

	@Test
	public void getCity() {
		assertEquals("Jane Doe", member.getCity());
	}

	@Test
	public void verifyProviderTest() {
		assertEquals("Jane Doe", member.getState());
	}
	
	@Test
	public void getZipCodeTest() {
		assertEquals("Jane Doe", member.getZipCode());
	}
	

}
