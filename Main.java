public class Main {
    public static void main(String[] args) {
        Rooms.generateRooms();
        Teachers.generateTeachers();
        Courses.generateCourses();
        Course_Offerings.generateCourseOfferings();
        Students.generateStudents();

        System.out.println("\n\n ROSTERS");
        Rosters.generateRosters();
    }
}