public class Task8_ServerDowntime {

    public static void main(String[] args) {

        int[] status = {1, 0, 0, 1, 0, 0, 0, 1};

        int totalDown = 0;
        int currentDown = 0;
        int maxDown = 0;

        for (int s : status) {
            if (s == 0) {
                totalDown++;
                currentDown++;
                maxDown = Math.max(maxDown, currentDown);
            } else {
                currentDown = 0;
            }
        }

        System.out.println("Total Downtime Hours: " + totalDown);
        System.out.println("Longest Continuous Downtime: " + maxDown);
    }
}
