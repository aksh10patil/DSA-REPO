
public class SpanofanArray {  
    public static void main(String[] args) {  
   
        int[] arr = new int[]{10, 20, 30, 40, 50};  
        
        int max = arr[0];  
        int min = arr[0];
     
        for (int i = 0; i < arr.length; i++) {  
          if ( arr[i] > max) {
            max = arr[i];
          }

          if ( arr[i] < min) {
            min = arr[i];
          }

        }  

        int span = max - min;
        System.out.println("Largest element present in given array: " + max);
        System.out.println("Smallest element present in given array: " + min);  
        System.out.println(" Span is equal " + span);
    }  
}  