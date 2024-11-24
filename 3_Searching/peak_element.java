package searching;

public class peak_element {

    static void peak(int[] arr,int index)
    {
        if(index<=0)
        {
            if(arr[index]>arr[index+1])
            {
                System.out.println(arr[index]);
            }
            return;
        }
        if(index>=(arr.length)-1)
        {
            if(arr[index]>arr[index-1])
            {
                System.out.println(arr[index]);
            }
            return;
        }

        if(arr[index]>arr[index-1] && arr[index]>arr[index+1])
        {
            System.out.println(arr[index]);
        }

         peak(arr, index+1);
         peak(arr, index-1);
        return;

    }
    
    public static void main(String[] args) {

        int[] arr = {5,10,20,15,7};
        peak(arr,arr.length/2);

        


    }
}
