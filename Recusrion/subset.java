package Recusrion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class subset {

    static void findSubset(String[] elements,List<String> powerset,String current,int index)
    {

        //BASE CASE
        if(index>=elements.length)
        {
            powerset.add(current);
            return;
        }

        //1.Exclude element
        findSubset(elements, powerset, current, index+1);

        //2. Include the element
        findSubset(elements, powerset, current+elements[index], index+1);

    }

    
    public static void main(String[] args) {


        System.out.println("Enter the size of Array :");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] myArray = new String[size];

        for(int i=0;i<size;i++)
        {
            System.out.println("Enter the "+i+"th element : ");
            myArray[i]= sc.next();
        }

        List<String> powerset = new ArrayList<>();
        findSubset(myArray, powerset, "", 0);


        for(int j=0;j<powerset.size();j++)
        {
            System.out.println(powerset.get(j));

        }

        


    }
}
