package Assignments.AlgorithmAnalysis.Permutations;

/**
 * @author Mia Watts
 *
 */
public class PermutationsEfficiencyTester {
    public static void main(String[] args) {
        Permutations p = new Permutations();
        int reps = 5;
        int[] sizes = {125,250,500,1000,2000,4000,8000,16000};
        for (int i = 0; i < sizes.length; i++) {
            long totalSteps = 0;
            double start = System.currentTimeMillis();
            for (int j = 0; j < reps; j++) {
                int[] data = new int[sizes[i]];
                p.algorithm3(data);
                totalSteps += p.getStepCounter();
            }
            double stop = System.currentTimeMillis();
            System.out.println("" + sizes[i] + ", " + totalSteps/reps + ", " +(stop - start)/reps);
        }
    }
}