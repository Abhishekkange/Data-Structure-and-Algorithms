package Arrayss;

public class delete_operation {

    static void deleteA(int[] array,int size,int element)
    {
        //searching the element
        int index = -1;
        for(int i=0;i<size;i++){

            if(array[i]==element)
            {
                index = i;
            }
        }

        if(index==-1)
        {
            System.out.println("Elements not found");
        }
        else{

            //delete that element
            for(int j=index;j<size-1;j++){

                int temp = array[j+1];
                array[j+1] = array[j];
                array[j] = temp;

            }
            size = size-1;
        }
    }
    
    public static void main(String[] args) {

        int[] myArray = {2,3,4,5,6,7};
        deleteA(myArray,6,3);
        for (int i = 0; i <5; i++) {

            System.out.println(myArray[i]);
                  
        }
                
            }
        
        
}
