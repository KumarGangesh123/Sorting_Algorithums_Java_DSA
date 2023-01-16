/* 


   In inertion sort , let's assume that the
   first element of the array is sorted ,
   and we start from the second index .
   Take the second element of the array and 
   check the suitable inserting position
   of that element in already partially
   sorted array , after that swap that 
   particular element with this element


*/


/*    Code for insertion sort implementation.     */



public class insertionSort{
  public static void main(String []argument){
    int []array = {78,90,5,7,34,90,3,7,45};

    showArray(array); // elements of the array before sorting
    
    insertion_Sort(array);

    showArray(array); // element of the array after sorting

  }

  public static void showArray(int []array){
    for(int x=0;x<array.length;x++){
      System.out.print(array[x]+" ");
    }

    System.out.println();

  }

  public static void insertion_Sort(int []array){
    int temp = 0;

    for(int x=1;x<array.length;x++){
      for(int y=x;y>0;y--){
        if(array[y] < array[y-1]){
          temp = array[y];
          array[y] = array[y-1];
          array[y-1] = temp;
        }
       }
      }
   }

}



/*

    Time Complexity of Insertion Sort

    Best Case : O(n)
    Average Case : O(n^2)
    Worst Case : O(n^2)

*/

    
