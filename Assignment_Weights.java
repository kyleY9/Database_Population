public class Assignment_Weights {

        public static void main(String[] args) {

            String[] assignment_weight = {"Major", "Minor"};


            for(int p = 0; p< assignment_weight.length; p++){
                int index = p+1;
                System.out.println("INSERT INTO Assignment_Weights (weight_id, weight) VALUES ( " + index + "," + " '" + assignment_weight[p] + "' );");
            }

        }
    }

