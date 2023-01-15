/*

      Bubble Sort Algorithum id the very basic sorting algorithum , use to sort the elements of the array
      
      In bubble sort ,  it works by repeatedly swapping the adjacent elements if they are in wrong order i.e. array[x] > array[x+1] then swap them.
      
      This algorithum is not suitable for the large amount of data.
      
*/


/*

      Time Complexity of Bubble Sort
      
      Best Case :   O(n)
      Average Case :    O(n^2)
      Worst Case :    O(n^2)
      
      
 */
 
 
 
 
 /*       Code for Bubble Sort        */
 
 
 
 public class bubbleSort{
  public static void main(String []argument){
    int []array = {56,8,23,67,1,89,345};
    
    showArray(array);
    
    bubble_Sort(array);
    
    showArray(array);
  }
  
  public static void showArray(int []array){
    for(int x=0;x<array.length;x++){
      System.out.print(array[x]+" ");
    }
    System.out.println();
  }
  
  public static void bubble_Sort(int []array){
    int temp = 0;
    
    for(int x=0;x<array.length;x++){
      for(int y=0;y<array.length-x;y++){
        if(array[y] > array[y+1]){
          temp = array[y];
          array[y] = array[y+1];
          array[y+1] = temp;
        }
      }
    }
   }
}
  
  
