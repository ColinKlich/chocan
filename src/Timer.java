import reports.ProviderReport;

public class Timer {
    private static int time;
    private static String dotw;

    public Timer(int time, String dotw) {
        Timer.time = time;
        Timer.dotw = dotw;
    }

    public static boolean runInteractiveMode() {
        if (time > 9 || time < 17){
            return true;
        }
        return false;
    }

    public static void updateMemberRecords() {

    }

    public static void printAllReports () {
        if (dotw == "Friday" && time == 24){
            ProviderReport providerReport = new ProviderReport()
        }
    }
}
