

import java.util.Scanner;
public class Bai7 {

    public static float[] importData(float[] arrays) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrays.length; i++) {
            System.out.print("nhap cac phan tu " + (i + 1) + ": ");
            arrays[i] = scanner.nextFloat();
        }
        return arrays;
    }

    public static void printData(float[] arrays) {
        System.out.print("mang hien tai: ");
        for (float num : arrays) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static float findMax2(float[] arrays) {
        float max = Float.NEGATIVE_INFINITY;
        float secondMax = Float.NEGATIVE_INFINITY;

        for (float num : arrays) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        return (secondMax == Float.NEGATIVE_INFINITY) ? Float.NaN : secondMax;
    }

    public static void deleteOddNumber(float[] arrays) {
        System.out.print("mang sau khi xoa cac phan tu le: ");
        for (float num : arrays) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("nhap kich thuoc cua mang: ");
        int size = scanner.nextInt();
        
        float[] arrays = new float[size];

        arrays = importData(arrays);
        
       
        printData(arrays);
        
   
        float secondMax = findMax2(arrays);
        if (Float.isNaN(secondMax)) {
            System.out.println("khong co phan tu thu 2.");
        } else {
            System.out.println("phan tu lon thu 2: " + secondMax);
        }
        
        
        deleteOddNumber(arrays);
        
        scanner.close();
    }
}
