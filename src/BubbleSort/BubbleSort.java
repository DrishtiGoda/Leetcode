package BubbleSort;

public class BubbleSort {

    void bubbleSort(int[] arr, int n){
        for(int i=0; i<n-1 ; i++){
            for (int j = 0; j< n-i-1 ; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    void printArray(int[] arr, int n){
        for(int i = 0; i<n; i++){
            System.out.println(arr[i] + " ");

        }
    }

    public static void main(String[] args) {
        int[] arr= {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;
        BubbleSort ob = new BubbleSort();
        ob.bubbleSort(arr, n);
        System.out.println("Sorted array is : ");
        ob.printArray(arr, n);
    }
}


