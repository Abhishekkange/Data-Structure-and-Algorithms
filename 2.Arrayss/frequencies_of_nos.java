package Arrayss;

public class frequencies_of_nos {

    static void count(int[] array)
    {
        int freq=1;
        for(int i=1;i<array.length;i++)
        {
            if(array[i-1]==array[i])
            {
                freq++;
            }
            else{

                System.out.println(array[i-1]+":"+freq);
                freq=1;
                
            }

            if(i==array.length-1)
            {
                System.out.println(array[i]+":"+freq);
            }
        }
        




    }
    public static void main(String[] args) {

        int[] arr = {1,1,2,2,2,2,3,4,4,5,6,6};
        count(arr);
        

    }
}
