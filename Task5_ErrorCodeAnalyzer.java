import java.util.HashMap;

public class Task5_ErrorCodeAnalyzer {

    public static void main(String[] args) {

        int[] errorCodes = {404, 500, 404, 403, 500, 404};

        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int code : errorCodes) {
            countMap.put(code, countMap.getOrDefault(code, 0) + 1);
        }

        int maxCount = 0;
        int frequentCode = 0;

        for (int code : countMap.keySet()) {
            if (countMap.get(code) > maxCount) {
                maxCount = countMap.get(code);
                frequentCode = code;
            }
        }

        System.out.println("Error Code Counts: " + countMap);
        System.out.println("Most Frequent Error Code: " + frequentCode);
    }
}
