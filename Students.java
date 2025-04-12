public class Students {
    public static void generateStudents() {
        for(int x = 1; x<2001; x++ ){
            System.out.println("INSERT INTO Students (student_id, student_name) VALUES ( " + x + "," + " '" + "Student" + x + "' );");
        }
    }
}
