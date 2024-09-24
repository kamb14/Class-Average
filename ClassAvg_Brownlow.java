public class ClassAvg_Brownlow {

    static void calAvg(double [][] scores){

        double sum = 0;

        double test = 0;

        for(int i = 0; i < scores.length; i++){
            for(int j = 0; j < scores[i].length; j++){

                sum = scores[i][j] + sum;

            }
            test = scores.length * scores[i].length;

        }
        double avg = sum / test;

        System.out.printf("%.2f", avg);
    }

    public static void main(String[] args) {
        
        double [][] TestScores1 = {{96.4, 55.8, 100.0},{98.67, 87.77, 76.53},{90.81, 88.76, 73.01},{105.0, 75.83, 67.36}};

        double [][] TestScores2 = {{97.8, 75.6, 81.4}, {44.35, 69.73, 92.88}, {79.22, 54.70, 99.92}};

        //call method
        
        System.out.print("\nClass average for test 1: ");

        System.out.print("\nClass average for test 2: ");

        calAvg(TestScores1);
        calAvg(TestScores2);
    }
    
}
