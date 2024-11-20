package Arrayss;

public class reverse_array {

    static void reverse(int[] arr,int index)
    {
        if(index >=arr.length/2)
        {
            return;
        }

        int temp = arr[arr.length-index-1];
        arr[arr.length-index-1] = arr[index];
        arr[index] = temp;

        reverse(arr, index+1);


    }
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};
        reverse(arr, 0);
        for(int i = 0; i<arr.length; i++){

            System.out.print(arr[i]+" ");
        }
        

    }
}
