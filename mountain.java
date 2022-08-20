import java.util.Scanner;

public class mountain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=1;
        int space=n-1;
        while (row<=n){
            //star
            int i=1;
            while (i<=star){
                System.out.print(i+" ");
                i++;
            }
            //space
            int j=1;
            while (j<=space){
                System.out.print("  ");
                j++;
            }

            //space+1
            int k=2;
            while (k<=space){
                System.out.print("  ");
                k++;
            }
            //star
            int m;
            if (row==n){
                m=row-1;
            }
            else
                 m=row;

            while( m>=1){
                if (m==n);
                System.out.print(m+" ");
                m--;
            }

            row++;
            space--;
            star++;
            System.out.println();
        }
    }
}
