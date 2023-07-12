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
    static void pattern16(int n)
    {
        for(int i=65;i<65+n;i++)
        {
            for(int j=65;j<=i;j++)
            {
                System.out.print((char)i+" ");
            }
            System.out.println();
        }
    }
    static void pattern17(int n)
    {
        int start=65;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print((char)start++);
            start--;
            for(int j=i;j>1;j--)
                System.out.print((char)--start);
            System.out.println();
                
        }
    }
    static void pattern18(int n)
    {
        for(int i=n;i>=1;i--)
        {
            int start=64+i;
            for(int j=0;j<n-(i-1);j++)
                System.out.print((char)start++);
            System.out.println();
        }
    }
    static void pattern19(int n)
    {
        int space=0;
        
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            for(int j=0;j<space;j++)
                System.out.print(" ");
            space+=4;
            for(int j=i;j>=1;j--)
                System.out.print("* ");
            System.out.println();
        }
        space-=4;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            for(int j=0;j<space;j++)
                System.out.print(" ");
            space-=4;
            for(int j=i;j>=1;j--)
                System.out.print("* ");
            System.out.println();
        }
    }
    static void pattern20(int n)
    {
        int space=(2*n)-2;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print("*");
            for(int j=0;j<space;j++)
                System.out.print(" ");
            space-=2;
            for(int j=i;j>=1;j--)
                System.out.print("*");
            System.out.println();
        }
        space+=4;
        for(int i=n-1;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
                System.out.print("*");
            for(int j=0;j<space;j++)
                System.out.print(" ");
            space+=2;
            for(int j=1;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
    }
    static void pattern21(int n)
    {
        for(int i=1;i<=n;i++)
        {
            if(i==1 || i==n)
            {
                for(int j=1;j<=n;j++)
                    System.out.print("*");
                // System.out.println();
            }
            
            else
            {
                for(int j=1;j<=n;j++)
                {
                    if(j==1 || j==n)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
