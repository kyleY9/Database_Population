public class Departments {
    public static void generateDepartments() {
        String[] departments = {"Biology", "Chemistry", "CTE, Computer Science & Engineering", "English", "Health & PE",
                "Mathematics", "Physics", "Social Studies", "Visual & Performing Arts", "World Languages & ENL"};


        for(int i = 0; i< departments.length; i++){
            int index = i+1;
            System.out.println("INSERT INTO Departments (department_id, department) VALUES ( " + index + "," +" '" + departments[i] + "' );");
        }
    }
}
