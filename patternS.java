public class patternS {
    public static void main(String[] args){
        int n=9;
        for(int i=0;i<n;i++,System.out.println())
        for(int j=0;j<n;j++)
        if(i==0 || i==n/2 || i==n-1 || j==0 && i<=n/2 || j==n-1 && i>n/2)
        System.out.print("*  ");
        else
        System.out.print("   ");

    }
    
}

/*OUTPUT
*  *  *  *  *  *  *  *  *  
*
*
*
*  *  *  *  *  *  *  *  *  
                        *  
                        *  
                        *  
*  *  *  *  *  *  *  *  *  */