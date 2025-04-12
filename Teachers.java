public class Teachers {
    private static int primaryKey = 1;

    public static void generateTeachers() {
        String[] BiologyTeachers = {
                "Ms. Angelene Alberga", "Mr. James Bacchi", "Ms. Victoria Cheng", "Ms. Stephanie Doire",
                "Dr. Michael Estrella", "Mr. Justin Fabrikant", "Mr. Colvin Gibson", "Ms. Areej Hafeez",
                "Ms. Angela Joseph", "Ms. Diana Lennon", "Ms. Kelly Lovelett", "Dr. Elisa Margarita",
                "Mr. Sean McCaffery", "Mr. L. Morgan", "Mr. Hadi Nasrollahi", "Ms. Donna Nathan",
                "Mrs. Iwona O'Brien", "Mrs. Brenda Oquendo-Orna", "Mrs. Caitlin Reste", "Ms. Jessica Tagliarino",
                "Mr. Devin Thomas", "Ms. Hyejin Yang"
        };

        String[] ChemTeachers = {
                "Ms. Zonia Adalat", "Ms. Lisa Carter Serrette", "Mr. Callistus Chiemezie", "Mr. Thomas Evangelist",
                "Mr. Joseph Gerraputa", "Ms. Melissa Greene", "Ms. Stephanie Henry", "Mr. Leonid Kantorovich",
                "Ms. Iqra Khan", "Mr. Yongjun Lee", "Ms. Caroline Leonard", "Mr. Shi Lin", "Ms. Christa Martin",
                "Mr. Matthew Mecner", "Ms. Patricia Multari", "Mr. Sooraj Nair", "Mr. Conrad Richman",
                "Ms. Shirley Shameen", "Dr. Joseph Shtab", "Dr. Horace Walcott"
        };

        String[] CTETeachers = {
                "Ms. Vickie Albury", "Mr. Carlos Blackwood", "Mr. Michael Boulis", "Ms. Alise Braick",
                "Ms. Wandy Chang", "Mr. Luis Collado", "Mr. Rupesh Das", "Ms. Shaina Doherty",
                "Mr. Adam Driggers", "Mr. Nathan Folwell", "Mr. Ali Harb", "Mr. Quincy Holmer",
                "Mr. Iulian Irimina", "Ms. Emile Jean Bapiste", "Ms. Reina Joa", "Ms. Rachel Kaufman",
                "Mr. Hoiming Bonny Lee", "Mr. Tsee Lee", "Mr. Rick Lopez", "Mr. Timothy Lyons",
                "Mr. Mike Miller", "Mr. Luke Moffit", "Ms. Marina Moshchenko", "Dr. Thomas Price",
                "Mr. Mark Rodriguez", "Ms. Tatiana Turin", "Mr. Ivan Turner", "Ms. Tiffany Wong"
        };

        String[] EnglishTeachers = {
                "Mr. Matthew Adelizzi", "Mr. Samuel Armen", "Ms. Erin Beach", "Ms. Lisa Bensing",
                "Ms. Jess Rhoades Bonilla", "Ms. JoAnna Bueckert-Chan", "Mr. Richard Capozzi",
                "Ms. Sandra Del Valle", "Mr. David Der Sarkisian", "Ms. Joanna Drusin", "Ms. Joy Ferguson",
                "Ms. Elizabeth Filippelli", "Mr. Zachary Gale", "Ms. Melissa Goodrum", "Mrs. Tatyana Green",
                "Mr. Stephen Harris", "Mr. Willie Ho", "Ms. Farhana Hoque", "Ms. Kaitlyn Huczko",
                "Mr. Elliott Johnston", "Ms. Katrina Kaplan", "Ms. Jennifer Kim", "Mr. Avram Kline",
                "Mr. Joel Lederer", "Ms. Nancy Levey", "Mr. Philip Linder", "Ms. Diana Liu", "Mr. Evan Losow",
                "Ms. Elizabeth Lvov", "Ms. Ariel Marcus", "Ms. Christina Massie", "Ms. Robin McCullough",
                "Ms. Jennifer Mikitanov", "Ms. Gabriella Newton", "Mr. Ryan Pavano", "Mr. Kemp Pettyjohn",
                "Mrs. Stephanie Galvin Pollicino", "Mr. Timothy Ree", "Ms. Samantha Seide", "Ms. Sandhya Seshan",
                "Dr. Sujay Sood", "Ms. Jessica Spinosa", "Ms. Vesna Sukalo", "Ms. Judith Taveras",
                "Mr. Edwin Velazquez", "Mr. Adam Virzi", "Mr. Israel Wasserstein", "Mr. David Whitman",
                "Ms. Irene Yannascoli"
        };

        String[] HealthTeachers = {
                "Mr. Agape Alexander", "Mrs. Lucy Balansag", "Ms. A Besler", "Mr. Todd Bloom",
                "Mr. Jean Brutus", "Mr. Anthony Cicolini", "Ms. Brianne Cicolini", "Ms. Gianna Forni",
                "Mr. Stephen Gigliello", "Mr. Pratheip Gugendiran", "Ms. Maureen Malone", "Mr. Joseph Maro",
                "Mr. Joseph Nardiello", "Ms. Sarah Nolan", "Mrs. Lori (Turk) Parizman", "Ms. Stacey Patti",
                "Mr. Josh Rubin", "Ms. Joy San Agustin", "Ms. Carla Sigona", "Ms. Nicole Stuart",
                "Mr. Derek Swartz", "Mr. Austin Tennenbaum"
        };

        String[] MathTeachers = {
                "Ms. Christina Aguis", "Mr. Daniel Amato", "Mr. James Bathurst", "Ms. Melanie Battles",
                "Ms. Heather Berry", "Dr. Thomas Blozy", "Ms. Jane Bolles", "Mr. Nathan Bonheimer",
                "Ms. Shubhra Breivogel", "Ms. Alexandra Brennan", "Ms. Oyinka Bruce", "Ms. Carrie Chu",
                "Ms. Julia Debenedetto", "Mr. Vincent Ewing", "Ms. Kiersten Franz", "Ms. Nina Granberry",
                "Ms. Kathryn Grassel", "Ms. Linda Hoftyzer", "Ms. Amy Hogan", "Ms. Danrong Huang",
                "Mr. Stan Kats", "Ms. Malgorzata Kurzyna", "Ms. Amy Lee", "Mr. Amos Levy",
                "Mr. Benjamin Lockeretz", "Ms. Rita Loomba", "Mr. Scott Matthews", "Ms. Brigid Moran",
                "Mr. Ben Morgenroth", "Mr. Arup Mukherjee", "Ms. Vivi Nguyen", "Mr. Edward Orna",
                "Mr. Andrew Ostrowsky", "Mr. Kenneth Raftery", "Mr. Mike Rodriguez", "Mr. Raul Saenz",
                "Mr. Bruce Samuels", "Mr. Hemal Shah", "Mr. Doug Shuman", "Mr. Dustin Shutes",
                "Mr. Steven Stein", "Ms. Chrystalleni Stivaros", "Ms. Lydia Yale", "Ms. Patricia Yee"
        };

        String[] PhysicsTeachers = {
                "Mr. David Adams", "Mr. Mohammed Alomeri", "Mr. Rashidul Bari", "Mr. Raymond Bradshaw",
                "Mr. Andrew Brickman", "Mr. Christian Corrao", "Ms. Kathleen Davey", "Mr. Thomas Duncan",
                "Mr. Thomas Evangelist", "Mr. Jacob Geier", "Mr. Bruce Greenspan", "Mr. John Haggerty",
                "Mr. Todd Hatch", "Mr. Joshua Paugh", "Mr. Rivera Samuel", "Ms. Rachel Sardo",
                "Mr. Jose Vargas", "Ms. Nancy Yi"
        };

        String[] SocialStudiesTeachers = {
                "Mr. Steven Apollon", "Mr. Serge Avery", "Mr. Alan Barbour", "Ms. Allie Carter",
                "Ms. Rosy Castillo", "Mr. William Cheung", "Ms. Marisa Cirino", "Mr. Vincent Dennie",
                "Mr. Jake DiVeronica", "Ms. Jennie Ferry", "Mr. Joshua Fine", "Mr. Joshua Frost",
                "Ms. Elina Galperin", "Ms. Rachel Germany", "Mr. Dave Gilmore", "Mr. Mark Heh",
                "Mr. Evan Hereshinson", "Mr. Tahan Izzat", "Dr. Judith Jeremie", "Ms. Elizabeth Johnson",
                "Ms. Rachel Kaplan", "Mr. Mark Keller", "Mr. Keith Kilgore", "Ms. Orli Kleiner",
                "Mr. Jonathan Leaf", "Mrs. Robin Levitt (Scherman)", "Mr. Xu Li", "Mr. Jeffrey Locke",
                "Ms. Amy Lucisano", "Dr. Matthew Maclean", "Mr. Andrew Macvicar", "Mrs. Beth Malchiodi",
                "Mrs. Jacqueline Manduley", "Mr. Josidalgo Martinez", "Mr. Francis Mayle",
                "Mr. Sean McManamon", "Ms. Victoria Meyer", "Mr. Harry Misirlakis", "Amani Mohamed",
                "Ms. Kathleen Nadel", "Mr. Michael O'Shea", "Mr. Jeffrey Park", "Mr. Isaiah Pratt",
                "Ms. I Ramnath", "Ms. Monica Robinson‑Bynum", "Mr. David Schepard", "Mr. Peter Schmidt‑Nowara",
                "Ms. Samantha Schoeller", "Mr. Joshua Silverman", "Mr. Elijah Singh", "Mr. Stephen Stavola",
                "Mr. Richard Stein", "Mr. Adam Stevens", "Mr. Will Treece", "Mr. Luis Vergara",
                "Mr. Thomas Wentworth", "Ms. Rachel Worrell", "Ms. Maria Zagoreos"

        };

        String[] ArtsTeachers = {
                "Mr. Barrington Bigsby", "Mr. Steve Coyle", "Mrs. Patricia DePinto", "Mr. Richard Depinto",
                "Ms. Connie Eng", "Mr. Michael Fisher", "Mr. Park K Fung", "Mr. Yesid Gonzalez",
                "Mr. Michael Guldal", "Mr. Sidney Izakson", "Mr. Rudy M", "Ms. Katherine Minkoff",
                "Ms. Basia Revi", "Mr. Evan Schwartz", "Rich Singler", "Mr. Alexander Tasopoulos",
                "Mr. Garfield Taylor", "Mr. Gustave Trombetta", "Mr. Richard Wanliss", "Mr. Doug Weiner",
                "Mr. Deshawn Withers"

        };

        String[] LanguageTeachers = {
                "Ms. Ana Aguirre", "Ms. Michelle Albano", "Ms. Luz Rocio Cely", "Ms. Yan Chen",
                "Ms. Katherine Cook", "Mr. Mario Costa", "Mr. Adrian Davila", "Ms. Alessandra De Meo",
                "Ms. Maria Jose Entrena", "Ms. Eika Gervasi", "Ms. Raquel Hornero", "Mr. Joshua Hurd",
                "Ms. Rita Iniguez", "Ms. Erhhan Kao", "Mr. Joon Keum", "Mr. Randy Levadas", "Ms. Hoi Sha Li",
                "Ms. Jiazi Lin", "Ms. Valerie Mitchell", "Ms. Juana Nava", "Mr. Cristobal Petersen",
                "Ms. Pierrelyne Pierre", "Ms. Lin Rao", "Ms. Cristina Santiago‑Campbell", "Ms. Chung‑Chi Sha",
                "Mr. Jean‑Paul Torres","Ms. Nancy Villalba", "Ms. Ioana Wicker", "Ms. Xiaohong Wu",
                "Ms. Peihong Ye "
        };

        int deptID = 1;
        String[][] teacherMtx = {BiologyTeachers, ChemTeachers, CTETeachers, EnglishTeachers, HealthTeachers, MathTeachers, PhysicsTeachers, SocialStudiesTeachers, ArtsTeachers, LanguageTeachers};
        for (String[] arr: teacherMtx) {
            printTeachers(arr, deptID);
            deptID++;
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

    public static int getPrimaryKey() {
        return primaryKey;
    }
}
