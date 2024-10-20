package Assignments.AlgorithmAnalysis.Permutations;

/**
 *  This class measures the performance of the permutation algorithms.
 */
public class PermutationsTester {
    public static void main(String[] arg) {
        Permutations p = new Permutations();
        int[] perm = new int[6];
        p.algorithm1(perm);
        p.algorithm2(perm);
        p.algorithm3(perm);
    }
}