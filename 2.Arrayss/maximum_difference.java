package Arrayss;

public class maximum_difference {

    //BRUTE FORCE METHOD
    static void calculateMaxDifference(int[] array)
    {

        int maxPosition =0;
        int MAX = array[0];
        for(int i=0;i<array.length;i++)
        {

            if(array[i]>MAX)
            {
                maxPosition = i;
                MAX = array[i];
            }
        }

        //iterate till MAX position and find MIN Element 
        int MIN=array[0];
        for(int i=0;i<maxPosition;i++)
        {
            if(array[i]<MIN)
            {
                MIN = array[i];
            }
        }

        System.out.println(MAX-MIN);





    }

    public static void main(String[] args) {


        int[] array  = {10,22,34,56,34,23,5,223,553,235,3};
        calculateMaxDifference(array);
        


    }
    
}
