package Arrayss;

public class largest_element {

    static int largest(int[] array,int size,int index,int max){
    
            if(index>=size)
            {
                return max;
            }
    
            if(array[index]>max)
            {
                max = array[index];
            }
    
            return largest(array, size, index+1, max);
    
    
    
    
    
        }
        public static void main(String[] args) {
            
            int arr[] = {1,2,3,4,50,6,7};
            System.out.println(largest(arr,7,0,arr[0]));



    }
}
