import java.util.*;
public class MyProgram
{
    public static void main(String[] args)
    {
        ArrayList<String> kyleAnswers = new ArrayList<String>(
		    Arrays.asList("A", "B", "D", "E", "A", "C", "?", "B", "D", "C"));

		ArrayList<String> chadAnswers = new ArrayList<String>(
		    Arrays.asList("E", "B", "B", "E", "A", "C", "E", "B", "D", "D"));

		ArrayList<String> rosannaAnswers = new ArrayList<String>(
		    Arrays.asList("A", "C", "B", "E", "A", "C", "D", "B", "D", "C"));

        ArrayList<String> key = new ArrayList<String>(
            Arrays.asList("A", "C", "D", "E", "B", "C", "E", "B", "B", "C"));

        StudentAnswerSheet kyleTest = new StudentAnswerSheet(kyleAnswers, "Kyle");
        StudentAnswerSheet chadTest = new StudentAnswerSheet(chadAnswers, "Chad");
        StudentAnswerSheet rosannaTest = new StudentAnswerSheet(rosannaAnswers, "Rosanna");

        System.out.println(kyleTest.getName() + ": " + kyleTest.getScore(key));
        System.out.println(chadTest.getName() + ": " + chadTest.getScore(key));
        System.out.println(rosannaTest.getName() + ": " + rosannaTest.getScore(key));

        ArrayList<StudentAnswerSheet> studentSheets = new ArrayList<StudentAnswerSheet>(
            Arrays.asList(kyleTest, chadTest, rosannaTest));

        TestResults results = new TestResults(studentSheets);
        System.out.println(results.highestScoringStudent(key));
    }
}
