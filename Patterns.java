public class MyClass {
    public static void main(String args[]) {
      
        pattern14(5);
    }
    static void pattern10(int n)
    {
        int j=1;
        for(int i=1;i<2*n;i++)
        {
            if(i<=n)
            {
                for(j=1;j<=i;j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
            else
            {
                for(j=i;j<2*n;j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
    static void pattern11(int n)
    {
        for(int i=1;i<=n;i++)
        {
            int res=i%2==0?0:1;
            for(int j=1;j<=i;j++)
            {
                System.out.print(res+" ");
                res=res==0?1:0;
            }
            System.out.println();
        }
    }
    static void pattern12(int n)
    {
        
        int space=(n-1)*4;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            space-=4;
            System.out.println();
        }
        
    }
    
    static void pattern13(int n)
    {
        int temp=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++){
                System.out.print(temp++ + " ");
            }
            System.out.println();
        }
    }
    static void pattern14(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
    static void pattern15(int n)
    {
        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
}
