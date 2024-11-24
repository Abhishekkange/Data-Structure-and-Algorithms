package searching;

public class binary_search {

    static int search(int [] arr,int num)
    {

        int start = 0;
        int end = arr.length;
        

        while(start<=end)
        {

            int mid = (start+end)/2;

        if(arr[mid]==num)
        {
            return mid;
        }
            
            if(arr[mid]>num)
            {
                end = mid-1;
            }
            else
            {
                start = mid;

            }

        }
        return -1;


    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,8};
        System.out.println(search(arr, 7));

        

    }
}