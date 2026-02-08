import java.util.HashSet;

public class Task7_DuplicateTransactions {

    public static void main(String[] args) {

        int[] transactions = {1001, 1002, 1003, 1002, 1004, 1001};
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int id : transactions) {
            if (!seen.add(id)) {
                duplicates.add(id);
            }
        }

        System.out.println("Duplicate Transactions: " + duplicates);
    }
}
