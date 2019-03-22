package day09;

import java.util.Scanner;

public class ´òÓ¡Ê®×ÖÍ¼ {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        char a[][] = new char[n * 4 + 5][n * 4 + 5];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = '.';
            }
        }
        int t = 0;
        for (int i = 0; i < n; i++, t += 2) {
            for (int j = t + 2; j < a.length - t - 2; j++) {
                a[t][j] = '$';
                a[j][t] = '$';
                a[a.length - t - 1][j] = '$';
                a[j][a.length - t - 1] = '$';
            }
            for (int j = t; j <= t + 2; j++) {
                a[j][t + 2] = '$';
                a[t + 2][j] = '$';
                a[a.length - t - 3][j] = '$';
                a[j][a.length - t - 3] = '$';
            }
            for (int j = a.length - 1 - t - 2; j <= a.length - 1 - t; j++) {
                a[j][t + 2] = '$';
                a[t + 2][j] = '$';
                a[a.length - 1 - t - 2][j] = '$';
                a[j][a.length - 1 - t - 2] = '$';
            }
        }
        int m = a.length / 2;
        for (int j = a.length / 2 - 2; j <= m + 2; j++) {
            a[j][m] = a[m][j] = '$';
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
