package Arrayss;

public class leaders_in_array {

    //??? BRUTE FORCE SOLUTION ???
    // static void leader(int[] arr)
    // {

    //     for(int i=0;i<arr.length;i++)
    //     {
    //         boolean _isLeader = true;
    //         for(int j=i+1;j<arr.length;j++)
    //         {
    //             if(arr[j]>arr[i])
    //             {
    //                 _isLeader = false;
    //                 break;
    //             }
    //         }
    //         if(_isLeader)
    //         {
    //             System.out.println(arr[i]);
    //         }
    //     }
    // }

    //??? OPTIMAL SOLUTION ???

    static void leader(int[] arr)
    {

        int max = Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]>max)
            {
                max = arr[i];
                System.out.println(max);
            
            }

        }
    }


    
    public static void main(String[] args) {
        

        int[] arr = {1,2,3,4,2,2,4,5,1,4,3,2};
        leader(arr);

    }
}
