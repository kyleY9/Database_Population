public class Students {

    public static int primaryKey;

    public static void generateStudents() {
        for(int x = 1; x<5001; x++ ){
            System.out.println("INSERT INTO Students (student_id, student_name) VALUES ( " + x + "," + " '" + "Student" + x + "' );");
            primaryKey = x;
        }
    }

    public static int getPrimaryKey() {
        return primaryKey;
    }

}
