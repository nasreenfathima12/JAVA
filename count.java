import java.util.*;
public class count {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  the size");
        int size=sc.nextInt();
        System.out.println("Enter the elements");
        int find[]=new int[size];
        for(int i=0;i<size;find[i++]=sc.nextInt());
        System.out.println("Enter the value to be count");
        int findx=sc.nextInt();
        int count=0;
        for(int i=0;i<size;i++)
        if(find[i]==findx){
        count++;
        }
        System.out.println("occurrence of given value="+count);
        sc.close();
    }
    
    
}

/* OUTPUT
Enter  the size
5
Enter the elements
1
2
3
4
4
Enter the value to be count
4
occurrence of given value=2  */
 

