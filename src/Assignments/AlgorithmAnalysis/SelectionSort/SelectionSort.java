package Assignments.AlgorithmAnalysis.SelectionSort;
public class SelectionSort {
    public void selectionSort(int[] elements) {
        int stepCounter = 0;
        for(int j = 0; j<elements.length - 1; j++) {
            int minIndex = j;
            for(int k = j + 1; k<elements.length; k++) {
                if(elements[k]<elements[minIndex]) {
                    minIndex = k;
                }
            }
            if(j != minIndex) {
                int temp = elements[j];
                elements[j] = elements[minIndex];
                elements[minIndex] = temp;
                stepCounter++;
            }
        }
        System.out.println(stepCounter++);
    }
}