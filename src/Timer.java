import reports.ProviderReport;

public class Timer {
    private int time;
    private String dotw;

    public Timer(int time, String dotw) {
        this.time = time;
        this.dotw = dotw;
    }

    public boolean runInteractiveMode() {
        if (time > 9 || time < 17){
            return true;
        }
        return false;
    }

    public void updateMemberRecords() {

    }

    public void printAllReports () {
       
    }
}
