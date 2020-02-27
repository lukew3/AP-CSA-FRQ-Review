import java.util.*;
public class StudentAnswerSheet {
    private ArrayList<String> answers;
    private String name;

    public StudentAnswerSheet(ArrayList<String> studentAnswers, String studentName) {
        answers = studentAnswers;
        name = studentName;
    }

    public double getScore(ArrayList<String> key)
    {
        double score = 0.0;
        for (int i=0; i<answers.size(); i++) {
            if (answers.get(i) == key.get(i))
            { score += 1.00; }
            else if (answers.get(i) == "?")
            { score += 0; }
            else
            { score -= 0.25; }
        }
        return score;
    }
    public String getName()
    { return name; }
}
