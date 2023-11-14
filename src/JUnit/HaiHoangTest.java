package JUnit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import accounts.Member;

public class HaiHoangTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testMemberCreate() {
		Member x = new Member("John Doe",123456789,);
	}

	@Test
	public void testSetMemberInformation() {
		
	}

	@Test
	public void testProviderReportCreate() {
		
	}

}
