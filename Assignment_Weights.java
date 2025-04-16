public class Assignment_Weights {
    public static void generateAssignmentWeights() {
        String[] assignment_weight = {"Minor", "Major"};

        for(int p = 0; p< assignment_weight.length; p++){
            int index = p+1;
            System.out.println("INSERT INTO Assignment_Weights (weight_id, weight) VALUES ( " + index + "," + " '" + assignment_weight[p] + "' );");
        }

    }
}
