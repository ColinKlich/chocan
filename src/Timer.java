public class Timer {
    private static int time;

    public Timer(int time) {
        Timer.time = time;
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

    }
}
