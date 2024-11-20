package Arrayss;

public class remove_duplicates {


   static void func(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {

                if(arr[j]!=arr[i])
                {
                    i++;
                    arr[i] = arr[j];
                }
                


            }
        }

    }

    public static void main(String[] args) {

        int[] arr = {1,1,1,2,2,3,4,4,5,7,7,8,9};
        func(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"");
        }


        

    }
}
