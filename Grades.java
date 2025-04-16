import java.util.Map;
import java.util.Set;

public class Grades {

    private static Map<Integer, Set<Integer>> courseOfferingAssignments = Assignments.getCourseOfferingAssignments(); // get the assignments for each course offering from assignments class
    private static Map<Integer, Set<CourseSlot>> studentSchedule = Rosters.getStudentSchedule(); // get the student schedules from rosters class

    public static void generateGrades() {
        for (int i = 1; i <= Students.getPrimaryKey(); i++) {
            for (CourseSlot slot: studentSchedule.get(i)) {
                int course_offering_id = slot.getCourse_offering_id();
                for (int assignmentId: courseOfferingAssignments.get(course_offering_id)) {
                    int randNum = (int) (Math.random() * 26) + 75; // generate a random grade from 75-100
                    System.out.printf("INSERT INTO Grades (student_id, assignment_id, grade) VALUES (%d, %d, %d);%n",
                            i, assignmentId, randNum
                    );
                }
            }
        }

        System.out.println(courseOfferingAssignments);
    }
}
