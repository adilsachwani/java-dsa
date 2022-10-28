package sorting;

public class SelectionSort {

    public static void main(String[] args) {

        int[] a = {7, 8, 3, 1, 2};

        // Selection Sort
        // time complexity -> O(n^2)
        // not the best time complexity for a sorting algorithm
        for(int i=0; i<a.length-1; i++){ // n-1 times
            int min = i;
            for(int j=i+1; j<a.length; j++){ // n-1 times
                if(a[min] > a[j]){
                    min = j;
                }
            }
            // swap
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }

    }

}
