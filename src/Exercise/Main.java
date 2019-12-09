package Exercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int  arr[]= new int[56];
            arr[1]=1;
            arr[2]=2;
            arr[3]=3;
            arr[4]=4;
            for (int i = 5; i < arr.length; i++) {
                arr[i] = arr[i-1]+arr[i-3];
            }
            int n =sc.nextInt();
            if (n==0) {
                break;
            }
            System.out.println(arr[n]);

        }

    }
}

