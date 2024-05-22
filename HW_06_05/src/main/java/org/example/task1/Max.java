package org.example.task1;

public class Max {
    public static void main (String[] args) {
        int [][] array = null;
        System.out.println(max(array));

        int [][] a = {
                null,
                {3,7},
                {-2, -5}
        };
        System.out.println(max(a));
    }
    public static int max(int[][] a) {
        if (a == null)
            return Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == null) {
                continue;
            } else {
                for (int j = 0; j < a[i].length; j++) {
                    if (a[i][j] > max) {
                        max = a[i][j];
                    }
                }
            }
        }
        return max;
    }
}



