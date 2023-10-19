import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void fillStudentData(Map<String, Map<String, List<Integer>>> students) {
        Map<String, List<Integer>> ivanovData = new HashMap<>();
        List<Integer> mathScores = new ArrayList<>();
        mathScores.add(4);
        mathScores.add(3);
        mathScores.add(5);
        List<Integer> englishScores = new ArrayList<>();
        englishScores.add(2);
        englishScores.add(2);
        englishScores.add(2);
        ivanovData.put("Math", mathScores);
        ivanovData.put("English", englishScores);
        students.put("Ivanov", ivanovData);

        Map<String, List<Integer>> petrovData = new HashMap<>();
        List<Integer> mathScoresPetrov = new ArrayList<>();
        mathScoresPetrov.add(2);
        mathScoresPetrov.add(2);
        mathScoresPetrov.add(2);
        List<Integer> englishScoresPetrov = new ArrayList<>();
        englishScoresPetrov.add(3);
        englishScoresPetrov.add(4);
        englishScoresPetrov.add(5);
        petrovData.put("Math", mathScoresPetrov);
        petrovData.put("English", englishScoresPetrov);
        students.put("Petrov", petrovData);

        Map<String, List<Integer>> sidorovData = new HashMap<>();
        List<Integer> mathScoresSidorov = new ArrayList<>();
        mathScoresSidorov.add(5);
        mathScoresSidorov.add(5);
        mathScoresSidorov.add(5);
        List<Integer> englishScoresSidorov = new ArrayList<>();
        englishScoresSidorov.add(4);
        englishScoresSidorov.add(4);
        englishScoresSidorov.add(4);
        sidorovData.put("Math", mathScoresSidorov);
        sidorovData.put("English", englishScoresSidorov);
        students.put("Sidorov", sidorovData);
    }

    public static List<String> getStudentsWithLowAverage(Map<String, Map<String, List<Integer>>> students) {
        List<String> result = new ArrayList<>();

        for (Map.Entry<String, Map<String, List<Integer>>> studentEntry : students.entrySet()) {
            String studentName = studentEntry.getKey();
            Map<String, List<Integer>> subjects = studentEntry.getValue();
            double[] subjectsAverage = new double[subjects.size()];
            int i = 0;
            for (Map.Entry<String, List<Integer>> subjectEntry : subjects.entrySet()) {
                List<Integer> scores = subjectEntry.getValue();
                int sum = 0;

                for (Integer score : scores) {
                    sum += score;
                }
                subjectsAverage[i] = (double) sum / scores.size();
                i++;
            }
            for (double subject :  subjectsAverage) {
                if (subject < 3.0) {
                    result.add(studentName);
                    break;
                }
            }
        }

        return result;
    }
}