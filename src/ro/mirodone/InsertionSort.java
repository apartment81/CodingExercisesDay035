package ro.mirodone;

public class InsertionSort extends BubbleSort{


    public  void insertionSort(int arr[])
    {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
          //  System.out.println("Sort Pass Number "+(i));
            int key = arr[i];
            int j = i-1;

            while ( (j > -1) && ( arr [j] > key ) ) {
               // System.out.println("Comparing "+ key  + " and " + arr [j]);
                arr [j+1] = arr [j];
                j--;
            }
            arr[j+1] = key;
            //System.out.println("Swapping Elements: New Array After Swap");
            //printArray(arr);
        }
    }

}
