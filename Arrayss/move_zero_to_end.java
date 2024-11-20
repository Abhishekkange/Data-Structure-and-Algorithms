package Arrayss;

public class move_zero_to_end {


    static void optimal(int[] arr)
    {

        int countNonZero =0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]!=0)
            {
                //move this number to non zero position
                arr[countNonZero] = arr[i];
                countNonZero++;
            };

           





        }
        for (int i = countNonZero; i < arr.length; i++) {
            arr[i] = 0;
        }
       

    }

    static void navie(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                int pointer=i;
                for(int j=i+1;j<arr.length-i+1;j++)
                {
                    if(arr[j]!=0)
                    {
                        pointer = j;
                        break;
                    }

                }

                int temp = arr[pointer];
                arr[pointer] = 0;
                arr[i] = temp;

            }
            



        }


    }
    
    public static void main(String[] args) {

        int[] arr = {1,0,0,12,13,0,20,0,0};
        optimal(arr);
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        


    }
}
