package ro.mirodone;


public class Main {

    public static void main(String[] args) {

         int arr [] = {120, 48, 890, 345, 654};

/*        System.out.println(" Array before bubble sort ");
        BubbleSort bs = new BubbleSort();
        bs.printArray(arr);
        // sort array using bubble sort
        bs.bubbleSort(arr);

        System.out.println(" Array after bubble sort");
        bs.printArray(arr);*/

        System.out.println(" Array before insertion sort ");
        InsertionSort is  = new InsertionSort();
        is.printArray(arr);
        is.insertionSort(arr);
        System.out.println(" Array after insertion sort ");
        is.printArray(arr);




    }
}
