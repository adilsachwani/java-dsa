package sorting;

public class BubbleSort {

    public static void main(String[] args) {

        int[] a = {7, 8, 3, 1, 2};

        // Bubble Sort
        // time complexity -> O(n^2)
        // not the best time complexity for a sorting algorithm
        for(int i=0 ;i<a.length-1; i++){ // n-1 times
            for(int j=0; j<a.length-1-i; j++){ // n-1 times
                // swap
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

    }


}
