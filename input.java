import java.util.ArrayList;
import java.util.Scanner;

public class input {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0 ;

        while(sum>=0)
        {
            int n = sc.nextInt();
            sum = sum + n;
            if(sum>=0)
            {
                list.add(n);
            }
            else
            {
                for(int i = 0; i<list.size(); i++)
                {
                    System.out.println(list.get(i));
                }
                break;
            }
        }

    }
}