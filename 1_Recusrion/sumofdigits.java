package Recusrion;

public class sumofdigits {
    

        static int sum(int num)
        {

            if(num%10==0)
            {
                return 0;
            }
            

            return num%10+sum(num/10);
        }

    public static void main(String[] args) {
        
        System.out.println(sum(113));

    }
}