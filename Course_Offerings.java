import java.util.*;

public class Course_Offerings {
    private static final int NUM_PERIODS = 10;

    private static ArrayList<Integer> roomIds = new ArrayList<Integer>();
    private static ArrayList<Integer> teacherIds = new ArrayList<Integer>();
    private static ArrayList<Integer> courseIds = new ArrayList<Integer>();

    private static int nextOfferingId = 1;

    public static void generateCourseOfferings() {
        // populate the id lists
        for (int i = 1; i < Rooms.getPrimaryKey(); i++) { // THIS WILL ONLY WORK IF YOU RUN Rooms.gen FIRST
            roomIds.add(i);
        }
        for (int i = 1; i < Teachers.getPrimaryKey(); i++) { // THIS WILL ONLY WORK IF YOU RUN Teachers.gen FIRST
            teacherIds.add(i);
        }
        for (int i = 1; i < Courses.getPrimaryKey(); i++) { // THIS WILL ONLY WORK IF YOU RUN Courses.gen FIRST
            courseIds.add(i);
        }

        // Testing Purposes
        // System.out.println(roomIds);
        // System.out.println(teacherIds);
        // System.out.println(courseIds);

        // Hash Maps with Hash Sets (fancy huh?)
        // Map<Integer, Set<Integer>> hashMap = new HashMap<>();
        // Sets are like arrays that do not allow duplicate values
        Map<Integer, Set<Integer>> teacherSchedule = new HashMap<>();
        Map<Integer, Set<Integer>> roomSchedule = new HashMap<>();

        for (int courseId : courseIds) {
            int numOfferings = (int) (Math.random() * 5 + 1); // Each course will have 1-5 offerings

            for (int i = 0; i < numOfferings; i++) {
                boolean assigned = false;

                // Give up after 200 tries just in case there is no possible combination of room, teacher, and period (will output error message afterwards)
                for (int attempt = 0; attempt < 200 && !assigned; attempt++) {
                    int period = (int) (Math.random() * 10 + 1); // period 1-10
                    int teacherId = teacherIds.get((int) (Math.random() * teacherIds.size())); // Keep trying to find a teacher and room id that match
                    int roomId = roomIds.get((int) (Math.random() * roomIds.size()));

                    boolean teacherBusy = teacherSchedule
                            .getOrDefault(teacherId, new HashSet<>()) // if the map has teacherID, return its hash set. otherwise create a new set to indicate that the teacher has no periods to teach
                            .contains(period);

                    boolean roomBusy = roomSchedule
                            .getOrDefault(roomId, new HashSet<>()) // if the map has roomID, return its hash set. otherwise create a new set to indicate that the room isn't being taught in for all periods
                            .contains(period);

                    if (!teacherBusy && !roomBusy) {
                        teacherSchedule.computeIfAbsent(teacherId, key -> new HashSet<>()).add(period);
                        roomSchedule.computeIfAbsent(roomId, key -> new HashSet<>()).add(period);
                        // ^^ if the current key doesn't exist in the map, add it and make its value the output of a lambda function

                        // Output SQL Statements
                        // printf is pretty much just a string formatter (i'm used to using println so this is new to me)
                        // %d integer placeholder ... %n newline ...
                        System.out.printf(
                                "INSERT INTO Course_Offerings (course_offering_id, course_id, room_id, teacher_id, period) VALUES (%d, %d, %d, %d, %d);%n",
                                nextOfferingId, courseId, roomId, teacherId, period
                        );
                        nextOfferingId++;

                        assigned = true;
                    }
                }

                if (!assigned) {
                    System.err.println("Could not assign a valid offering for course ID " + courseId);
                }
            }
        }
    }
}
