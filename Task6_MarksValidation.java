public class Task6_MarksValidation {

    public static void main(String[] args) {

        int[] marks = {78, 45, 110, 65, -5, 90};

        int pass = 0, fail = 0;

        for (int mark : marks) {
            if (mark < 0 || mark > 100) {
                System.out.println("Invalid Mark Detected: " + mark);
            } else if (mark >= 40) {
                pass++;
            } else {
                fail++;
            }
        }

        System.out.println("Pass Students: " + pass);
        System.out.println("Fail Students: " + fail);
    }
}
