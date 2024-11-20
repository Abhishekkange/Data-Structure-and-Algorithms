package Arrayss;

public class check_array_sorted {

    static boolean func(int[] arr,int index)
        {
    
            if(index>=arr.length-1)
            {
                return true;
            }
    
            if(arr[index+1]<arr[index])
            {
                return false;
            }
            else{
                return func(arr, index+1);
            }
    
    
            
        }
        
        public static void main(String[] args) {
    
            int[] arr = {1,20,30,40,50,6,70};
            System.out.println(func(arr,0));
        

    }
}
