import java.util.*;
public class TestResults {
    private ArrayList<StudentAnswerSheet> sheets;

    public TestResults(ArrayList<StudentAnswerSheet> studentsSheet){
        sheets = studentsSheet;
    }

    public String highestScoringStudent(ArrayList<String> key)
    {
        StudentAnswerSheet highest = sheets.get(0);
        for (int i=0; i<sheets.size(); i++) {
            StudentAnswerSheet currentSheet = sheets.get(i);
            if (currentSheet.getScore(key) > highest.getScore(key)) {
                highest = currentSheet;
            }
        }
        return highest.getName();
    }

}
