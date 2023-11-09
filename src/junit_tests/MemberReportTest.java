package junit_tests;
import reports.MemberReport;
import accounts.Member;
import org.junit.Assert.*;

public class MemberReportTest {

    Member member;
    MemberReport report;
    
    @Before
    public void setUp() throws Exception {
        member = new Member("John Doe", 99999, "1234 Meadow Ln", "Chicago", "IL", 60031);
        report = new MemberReport(member);
    }

    @Test
    public void testReportForSuccess() {
        assertEquals(
        "Member Name: " + "John Doe" + '\n' +
        "Member Number: " + 99999 + '\n' +
        "Member Street Address: " + "1234 Meadow Ln" + '\n' +
        "Member City: " + "Chicago" + '\n' +
        "Member State: " + "IL" + '\n' +
        "Member Zip Code: " + 60031 + '\n', report.formattedReport);
    }

}
