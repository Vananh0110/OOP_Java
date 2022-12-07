import java.util.Scanner;

public class Bai_6_3 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input height of the triangle: ");
        int tHeight = input.nextInt();
        for(int i = 0; i < tHeight; i++)
        {
            for(int j = 0; j < tHeight + i; j++)
            {
                if(j < tHeight-i-1) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
