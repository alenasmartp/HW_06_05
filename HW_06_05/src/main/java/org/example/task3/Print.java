package org.example.task3;

public class Print {
        public static void main (String[] args) {
            int [][] a = {
                    null,
                    {3,7},
                    {-2, -5}
            };
            print(a);
        }
    public static void print(int[][] a) {
         System.out.println("[");
         if (a == null) {
         System.out.println("null");
         } else {
         for (int i = 0; i < a.length; i++) {
             System.out.println(Arrays.toString(a[i]));
         }
         }     System.out.println("]"); }
    }


