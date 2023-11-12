package JUnit;
import reports.*;
import accounts.*;
import static org.junit.Assert.*;
import static org.junit.Before;
import static org.junit.Test;

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
        providerReport = new providerReport(provider);
    }

    @Test
    public void memberFormatReportTest() {
        assertEquals(
        "Member Name: " + "John Doe" + '\n' +
        "Member Number: " + 99999 + '\n' +
        "Member Street Address: " + "1234 Meadow Ln" + '\n' +
        "Member City: " + "Chicago" + '\n' +
        "Member State: " + "IL" + '\n' +
        "Member Zip Code: " + 60031 + '\n', memberReport.formattedReport);
    }

    @Test
    public void providerFormatReportTest() {
        assertEquals(
        "Member Name: " + "John Doe" + '\n' +
        "Member Number: " + 99999 + '\n' +
        "Member Street Address: " + "1234 Meadow Ln" + '\n' +
        "Member City: " + "Chicago" + '\n' +
        "Member State: " + "IL" + '\n' +
        "Member Zip Code: " + 60031 + '\n', memberReport.formattedReport);
    }    

    @Test public void memberGetNameTest(){
        assertEquals("John Doe", member.getName());
    }

}
