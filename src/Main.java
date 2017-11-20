import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in=new Scanner(System.in);
        int x;
        x=in.nextInt();
        for (int i=1;i<=x;i++)
        {
            for (int j=1;j<=i;j++)
                System.out.print("x");
            System.out.println();
            }
        }
    }
