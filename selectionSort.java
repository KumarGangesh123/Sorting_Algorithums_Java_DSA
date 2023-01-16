/*

    In selection sort , first of all take the first element of the array then compare the remaining elements of the array and if we got the smallest element in the array from that element , then we swap out those elements

*/

/*.   Code for Selection Sort.     */


public class selectionSort{
  public static void main(String [] argument){
    int []array = {89,5,78,3,67,2,690,12};

    showArray(array); // elements of array before sorting

    selection_Sort(array);

    showArray(array); // elements of array after sorting
 
  }
  
  public static void showArray(int []array){
    for(int x=0;x<array.length;x++){
      System.out.print(array[x]+" ");
    }
    System.out.println();

  }

  public static void selection_Sort(int []array){
    for(int x=0;x<array.length;x++){
      int num = 0;
      int temp = array[x];
      int index = x;
      for(int y=x;y<array.length;x++){
        if(temp > array[y]){
          temp = array[y];
          index = y;
        }
      }

      num = array[x];
      array[x] = array[index];
      array[index] = num;

    }
  }

}
