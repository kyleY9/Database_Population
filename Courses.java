public class Courses {
    private static int primaryKey = 1;

    public static void generateCourses() {
        String[] apClasses = {
                "AP Biology", "AP Environmental", "AP Psychology", "AP Chemistry",
                "AP Physics I", "AP Physics II", "AP Physics C (Mechanics)", "AP Physics C (E/M)",
                "AP Computer Science Principles (10th Grade)", "AP Computer Science A",
                "10th Grade: AP Capstone Seminar", "11th Grade: AP English Language & Composition",
                "12th Grade: AP Capstone Research", "12th Grade: AP English Literature & Composition",
                "AP Calculus (AB)", "AP Calculus (BC)", "AP Statistics",
                "AP World History", "AP European History", "AP American History",
                "AP US Government & Politics", "AP Macroeconomics", "AP Microeconomics", "AP Comparative Government",
                "AP Psychology", "AP Human Geography",
                "AP Chinese Language and Culture", "AP French Language and Culture",
                "AP German Language and Culture", "AP Italian Language and Culture",
                "AP Spanish Language and Culture", "AP Spanish Literature and Culture"
        };

        // Regents Classes (includes non-AP language courses)
        String[] regentsClasses = {
                "Regents Living Environment", "Regents Living Environment Lab",
                "Regents Chemistry", "Regents Chemistry Lab",
                "Regents Physics", "Regents Physics Lab",
                "10th Grade Regents Global History", "11th Grade Regents American History",
                "Regents 11th Grade American Literature",
                "Chinese I", "Chinese II", "Chinese III",
                "French I", "French II", "French III",
                "German I", "German II", "German III",
                "Italian I", "Italian II", "Italian III",
                "Spanish I", "Spanish II", "Spanish III", "Spanish IV - Pre-AP"
        };

        // Electives
        String[] electives = {
                "Anatomy", "Bioorganic Chemistry", "Genetics", "Introduction to Neuroscience", "Environmental Sustainability",
                "Chemical Engineering", "Organic Chemistry", "Modern Chemical Instrumental Analysis (MICA)", "Quantitative Analysis", "Forensic Criminology",
                "Astronomy", "Modern Physics",
                "Big Data: Warehousing & Analytics", "Cyber Security", "Digital Electronics (Project Lead the Way)",
                "Digital Systems Design", "Fundamentals of IT Infrastructure", "Green Building Construction", "PLTW Engineering Design & Development (EDD)",
                "Introduction to Chemical Engineering", "Engineering Statistics", "American Concrete Institute Certification",
                "Land Surveying Certification", "AutoCAD with Certiport Certification", "PLTW Computer Integrated Manufacturing (CIM)",
                "PLTW Environmental Sustainability", "Principles of Accounting",
                "9th Grade Freshman Composition", "10th Grade British & World Literature",
                "12th Grade: Creative Writing", "12th Grade: Drama", "12th Grade: Film & Literature",
                "12th Grade: Journalism", "12th Grade: Life, Love & Death", "12th Grade: Mystery, Horror & the Supernatural",
                "12th Grade: Science Fiction & Fantasy", "12th Grade: Yearbook",
                "Elective: The Survey (Tech's Student Newspaper)",
                "Badminton", "Basketball", "Floor Hockey", "Golf", "Handball", "Volleyball", "Tennis", "Wiffle Ball",
                "Indoor Soccer", "Speedball", "Team Handball", "Weight Training", "Advanced Weight Training",
                "Backyard Games", "Capoiera", "Spin", "Swimming", "Indoor Track", "Outdoor Track", "Yoga", "Health",
                "Common Core Algebra", "Common Core Geometry", "Common Core Algebra II",
                "Pre-Calculus", "Calculus (non-AP)", "Multivariable Calculus", "Math Research", "Linear Algebra",
                "9th Grade Pre-AP World History", "Participation in Government", "Economics",
                "Sociology", "Cultural Anthropology", "Physical Anthropology", "Black History 365",
                "Adobe Digital Video", "Video & Audio", "Adobe Visual Design", "PLTW Design & Drafting for Production (DDP)",
                "Architectural Drawing w/CAD", "Digital Animation",
                "Music", "PLTW CEA", "PLTW DDP (9th Grade)"
        };

        System.out.println("<------ AP CLASSES ------>");
        printCourses(apClasses, 1);

        System.out.println("\n<------ REGENTS CLASSES ------>");
        printCourses(regentsClasses, 2);

        System.out.println("\n<------ ELECTIVE CLASSES ------>");
        printCourses(electives, 3);
    }

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

    public static int getPrimaryKey() {
        return primaryKey;
    }
}
