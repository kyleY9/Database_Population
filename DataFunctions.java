
// Scrapped cuz I realized that it'd be annoying to run this in bash
public class DataFunctions {
    private static int primaryKey = 1;

    public static void printCourses(String[] arr, int typeID) {
        for (String x : arr) {
            String item = x;
            for (int k = 0; k < item.length(); k++) {
                if (item.charAt(k) == '\'') {
                    item = item.substring(0, k) + "'" + item.substring(k);
                    k++;
                }
            }
            System.out.println("INSERT INTO Courses (course_id, course, type_id) VALUES (" + primaryKey + ", '" + item + "', " + typeID + ");");
            primaryKey++;
        }
    }

    public static void printTeachers(String[] arr, int departmentID) {
        for (String x : arr) {
            String item = x;
            for (int k = 0; k < item.length(); k++) {
                if (item.charAt(k) == '\'') {
                    item = item.substring(0, k) + "'" + item.substring(k);
                    k++;
                }
            }
            System.out.println("INSERT INTO Teachers (teacher_id, teacher_name, department_id) VALUES (" + primaryKey + ", '" + item + "', " + departmentID + ");");
            primaryKey++;
        }
    }

    public static void resetPrimaryKey() {
        primaryKey = 1;
    }
}
