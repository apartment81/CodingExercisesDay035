package ro.mirodone;

public class BubbleSort {


    void bubbleSort ( int []  array){
        int n = array.length;
        int temp ;

        for ( int i = 0; i< n; i++){
            //System.out.println("Sort Pass Number " + (i+1));
            for ( int j =1; j< n ; j++ ){
            //    System.out.println("Comparing " + array[j-1] + " and " + array[j]);
                if(array[j-1] > array [j]){
                    //swap elements
                    temp  = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                //    System.out.println(array[j] + " is greater than " +array[j-1]);
                    System.out.println("Swapping elements: New array after swap");
                    printArray(array);
                }
            }
        }
    }

    void printArray (int [] array){
        for (int anArray : array) {
            System.out.println(anArray + " ");
        }
        System.out.println();
    }

}
