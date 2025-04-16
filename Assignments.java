import java.util.*;

public class Assignments {
    private static int assignmentId = 1;
    private static int minorCount = 1;
    private static int majorCount = 1;
    private static Map<Integer, Set<Integer>> courseOfferingAssignments = new HashMap<>(); // adds all the assignment ids for every course_offering

    public static void generateAssignments() {
        for (int i = 1; i < Course_Offerings.getCourseOfferingId(); i++) {
            courseOfferingAssignments.put(i, new HashSet<>());
            for (int minor = 1; minor <= 12; minor++) {
                String minorName = "MinorAssignment_" + minorCount;
                courseOfferingAssignments.get(i).add(assignmentId);
                System.out.printf("INSERT INTO Assignments (assignment_id, course_offering_id, weight_id, assignment) VALUES (%d, %d, %d, '%s');%n",
                        assignmentId, i, 1, minorName // weight_id of 1 correlates to 'minor'
                );
                minorCount++;
                assignmentId++;
            }
            for (int major = 1; major <= 3; major++) {
                String majorName = "MajorAssignment_" + majorCount;
                courseOfferingAssignments.get(i).add(assignmentId);
                System.out.printf("INSERT INTO Assignments (assignment_id, course_offering_id, weight_id, assignment) VALUES (%d, %d, %d, '%s');%n",
                        assignmentId, i, 2, majorName // weight_id of 2 correlates to 'major'
                );
                majorCount++;
                assignmentId++;
            }
        }
    }

    public static int getAssignmentId() {
        return assignmentId;
    }

    public static Map<Integer, Set<Integer>> getCourseOfferingAssignments() {
        return courseOfferingAssignments;
    }
}

// A Bike Ride Alongside The Sea Shore Calms The Soul