package sorting;

public class InsertionSort {

    public static void main(String[] args) {

        int[] a = {7, 8, 3, 1, 2};

        // Insertion Sort
        // time complexity -> O(n^2)
        // not the best time complexity for a sorting algorithm
        for(int i=1; i<a.length; i++){ // n-1 times
            int current = a[i];
            int j=i-1;
            while (j>=0 && a[j] > current){ // n-1 times
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = current;
        }

    }

}
