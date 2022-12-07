import java.util.Scanner;

public class Bai_6_5 {
    public static Scanner scanner = new Scanner(System.in);

    public static void sortasc(int []array, int n)
    {
        for(int i = 0; i < n-1 ; i++)
            for(int j = i+1; j < n-1; j++)
            {
                if(array[i] > array[j])
                {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
    }

    public static void main(String[] args)
    {
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();

        int []array = new int [n];
        int sum = 0;
        System.out.println("Nhap cac phan tu cua mang:");
        for(int i = 0; i < n; i++)
        {
            System.out.printf("array[%d] = ", i);
            array[i] = scanner.nextInt();
            sum += array[i];

        }

        sortasc(array, n);
        
        System.out.print("Sap xep theo thu tu tang dan: ");

        for(int i = 0; i < n; i++)
        {
            System.out.printf("%d ", array[i]);
        }
        
        System.out.printf("\nTong cac gia tri cua mang la: %d", sum);
        System.out.print("\n");
        System.out.printf("Gia tri trung binh cua mang la: %.2f", (float) sum/n);


    }
}
