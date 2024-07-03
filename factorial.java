import java.util.Scanner;
public class factorial{
    public static void main(String[] args){
        
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the number:");
            long number=sc.nextLong();
            long fact=1;
            for(int i=2;i<=number;i++){
                fact*=i;
            }
            System.out.print("factorial:"+fact);
            sc.close();
        
    }  
}

/*OUTPUT

  Enter the number:5
  factorial:120
  
 */