package searching;

public class firstoccurance {
    
    static int  firstOcc(int[] arr,int num,int start,int end)
    {

        if(start>=end)
        {
            //element not found 
            return -1;

        }

        int mid = (start+end)/2;
        if(arr[mid]==num)
        {
            if(arr[mid-1]!=num || mid==0)
            {
               return mid;
                
            }
            else{

                return firstOcc(arr,num,start,mid-1);
            }
           
        }
        else
        {

            if(arr[mid]>num)
            {
               return firstOcc(arr,num,start,mid-1);
            }
            else
            {
               return firstOcc(arr,num,mid+1,end);
            }
        }



    }


    public static void main(String[] args)
    {

        int[] arr = {1,2,3,3,3,4,4,4,5,5,6,8};
        System.out.println(firstOcc(arr, 3,0,arr.length));


    }
}
