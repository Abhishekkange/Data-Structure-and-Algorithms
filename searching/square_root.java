package searching;

public class square_root {


    // BRUTE FORCE SOLUTION
//    static int root(int x,int check)
//     {
//         int square = check*check;
//         if(square>x)
//         {
//             return check-1;
//         }

//         return root(x,check+1);

//     }

//OPTIMIZED SOLUTION
static int root(int x)
{

    int start =0;
    int end = x;
    int ans =-1;
    while(start<=end)
    {   
        int mid = (start+end)/2;
        int square = mid*mid;
        if(square==x)
        {
            return mid;

        }

        else{

            if(square<x)
            {
                ans = mid;
                start = mid+1;

            }
            else{

                end = mid-1;
            }
        }

       




    }

    return ans;

    

}

    public static void main(String[] args) {

        int x = 35;
        System.out.println(root(x));
        
    }
    
}
