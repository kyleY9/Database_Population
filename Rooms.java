public class Rooms {
    private static int primaryKey = 1;

    public static void generateRooms() {
        String[] floor = {"B", "1", "2", "3", "4", "5", "6", "7", "8"};
        String[] wing = {"N", "S", "E", "W"};


        for (int i = 0; i < floor.length; i++) {
            for (int k = 0; k < 4; k++) {
                for (int j = 0; j < 20; j++) {
                    String room = floor[i] + wing[k] + (j + 1);
                    System.out.println("INSERT INTO Rooms (room_id, room) VALUES (" + primaryKey + ", " + room + ");");
                    primaryKey++;
                }
            }
        }
    }

    public static int getPrimaryKey() {
        return primaryKey;
    }
}
