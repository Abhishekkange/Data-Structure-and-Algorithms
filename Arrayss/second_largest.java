package Arrayss;

public class second_largest {

    static int fun(int arr[],int index, int max1,int max2)
    {
        if(index>=arr.length)
            {return max2;}

            if(arr[index]>max1)
            {
                max2 = max1;
                max1 = arr[index];
                
            }else if (arr[index] > max2 && arr[index] != max1) {
                max2 = arr[index]; // Update second max only if it's less than max1 but greater than max2
            }
         
        
        return fun(arr, index+1, max1, max2);


        
    }
    
    public static void main(String[] args) {
        
        int [] arr = {100,2,30,4,5,6,7};

        System.out.println(fun(arr,0,Integer.MIN_VALUE, Integer.MIN_VALUE));

    }
}
