public class Course_Types {
    public static void generateCourseTypes() {
        String[] course_types = {"AP", "Regents", "Elective"};


        for(int j = 0; j<course_types.length; j++){
            int index = j+1;
            System.out.println("INSERT INTO Course_Types (type_id, type) VALUES ( " + index + "," + " '" + course_types[j] + "' );");
        }
    }
}
