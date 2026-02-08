public class Task3_LoginAttempts {

    public static void main(String[] args) {

        int[] attempts = {1, 4, 2, 5, 3};

        for (int i = 0; i < attempts.length; i++) {
            if (attempts[i] > 3) {
                System.out.println("⚠ Alert: User " + (i + 1) + " has " + attempts[i] + " failed attempts");
            }
        }
    }
}
