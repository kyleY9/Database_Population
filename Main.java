public class Main {
    public static void main(String[] args) {
          // System.out.println("\n\n DEPARTMENTS");
          Departments.generateDepartments();

        // System.out.println("\n\n COURSE TYPES");
          Course_Types.generateCourseTypes();

        // System.out.println("\n\n ASSIGNMENT WEIGHTS");
          Assignment_Weights.generateAssignmentWeights();

        // System.out.println("\n\n ROOMS");
          Rooms.generateRooms();

          // System.out.println("\n\n TEACHERS");
          Teachers.generateTeachers();

        // System.out.println("\n\n COURSES");
          Courses.generateCourses();

        // System.out.println("\n\n COURSE OFFERINGS");
          Course_Offerings.generateCourseOfferings();

        // System.out.println("\n\n STUDENTS");
          Students.generateStudents();

        // System.out.println("\n\n ROSTERS");
          Rosters.generateRosters();

        // System.out.println("\n\n ASSIGNMENTS");
        Assignments.generateAssignments();

        // System.out.println("\n\n GRADES");
          Grades.generateGrades();
    }
}