/*33import java.util.*;

class Result {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> result = new ArrayList<>();
        for (int grade : grades) {
            if (grade < 38) {
                result.add(grade);
            } else {
                int nextMultipleOf5 = ((grade / 5) + 1) * 5;
                if (nextMultipleOf5 - grade < 3) {
                    result.add(nextMultipleOf5);
                } else {
                    result.add(grade);
                }
            }
        }
        return result;
    }
}

public class GradingStudents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of grades: ");
        int gradesCount = scanner.nextInt();

        List<Integer> grades = new ArrayList<>();
        System.out.println("Enter the grades one by one:");
        for (int i = 0; i < gradesCount; i++) {
            grades.add(scanner.nextInt());
        }

        List<Integer> result = Result.gradingStudents(grades);

        System.out.println("Rounded Grades:");
        for (int grade : result) {
            System.out.println(grade);
        }

        scanner.close();
    }
}
*/