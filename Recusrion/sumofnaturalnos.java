package Recusrion;

public class sumofnaturalnos {
    
    static int sum(int n)
    {
        if(n==1) return 1;

        return n+sum(n-1);

    }

    static int sum2(int n)
    {
        //direct formula
        return n*(n+1)/2;
    }

    public static void main(String[] args) {
        
        System.err.println(sum(5));
        System.out.println(sum2(5));
    }
}
