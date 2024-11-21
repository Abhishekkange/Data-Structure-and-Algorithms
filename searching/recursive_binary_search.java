package searching;

public class recursive_binary_search {

    static int func(int[] arr,int num,int start,int end)
    {   
        if(start>=end)
        {
            return -1;
        }

        //calculate mid
        int mid = (start+end)/2;
        if(arr[mid]==num)
        {
            return mid;
        }
        else{

            if(arr[mid]>num)
            {
               return func(arr,num,start,mid-1);
            }
            else
            {
               return func(arr,num,mid+1,end);
            }

        }


    }
    


    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,8};
        System.out.println(func(arr, 4,0,arr.length));
        
    }
}
