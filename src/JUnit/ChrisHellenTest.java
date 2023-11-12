package JUnit;
import reports.*;
import services.ServiceProvided;
import accounts.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ChrisHellenTest {

    Member member;
    Provider provider;
    MemberReport memberReport;
    ProviderReport providerReport;
    
    @Before
    public void setUp() throws Exception {
        member = new Member("John Doe", 99999, "1234 Meadow Ln", "Chicago", "IL", 60031);
        memberReport = new MemberReport(member);
        provider = new Provider("John Doe", 99999, "1234 Meadow Ln", "Chicago", "IL", 60031);
        providerReport = new ProviderReport(provider);
    }

    @Test
    public void memberFormatReportTest() {
        assertEquals(true, memberReport.print());
    }

    @Test
    public void providerFormatReportTest() {
        assertEquals(true, providerReport.print());
    }    

    @Test 
    public void memberGetNameTest(){
        assertEquals("John Doe", member.getName());
    }

}
