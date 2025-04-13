
import java.util.*;

public class Rosters {

    public static Map<Integer, Integer> courseOfferingPeriod = Course_Offerings.getCourseOfferingPeriod();
    // ^^ can only be used AFTER Course_Offerings is run

    public static void generateRosters() {
        Map<Integer, Set<Integer>> studentSchedule = new HashMap<>();
        Map<Integer, Integer> courseOfferingStudents = new HashMap<>(); // will track how many students are in each course offering

        for (int i = 1; i <= Students.getPrimaryKey(); i++) {
            studentSchedule.put(i, new HashSet<>());
            while (studentSchedule.get(i).size() < 10) { // we want every student to have periods 1-10 filed up
                int courseOffering = (int) (Math.random() * Course_Offerings.getCourseOfferingId() - 1) + 1;
                int period = courseOfferingPeriod.get(courseOffering);
                courseOfferingStudents.putIfAbsent(courseOffering, 0); // create a key and a value for the # of students in the course_offering

                boolean isStudentOccupied = studentSchedule.get(i).contains(period);

                if (courseOfferingStudents.get(courseOffering) < 100 && !isStudentOccupied) { // max # of students per class is 100. very realistic.
                    studentSchedule.get(i).add(period);
                    courseOfferingStudents.put(courseOffering, courseOfferingStudents.get(courseOffering) + 1);
                    System.out.printf("INSERT INTO Rosters (student_id, course_offering_id) VALUES (%d, %d);%n",
                            i, courseOffering
                    );
                }
            }
        }


        // this is all code that i wrote until i realized everything was done incorrectly

//        for (int i = 1; i < Course_Offerings.getCourseOfferingId(); i++) {
//            courseOfferingStudents.put(i, 0);
//            int period = courseOfferingPeriod.get(i); // gets the period # for the current course offering
//            while (courseOfferingStudents.get(i) < 30) { // keep on finding students until the course offering has 30 students enrolled
//                int student = (int) (Math.random() * Students.getPrimaryKey()) + 1; // get a random student (Students MUST BE RUN FIRST)
//
//                boolean isOccupied = studentSchedule.getOrDefault(student, new HashSet<>()).contains(period);
//
//                if (!isOccupied) {
//                    studentSchedule.computeIfAbsent(student, k -> new HashSet<>()).add(period); // add the period to their schedule
//                    courseOfferingStudents.put(i, courseOfferingStudents.get(i) + 1); // add one student to the mix
//                    System.out.printf("INSERT INTO Rosters (roster_id, student_id, course_offering_id) VALUES (%d, %d, %d);%n",
//                            rosterId, student, i
//                    );
//                }
//            }
//            rosterId++;
//        }
    }
}
