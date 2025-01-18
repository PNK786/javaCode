package src.collections;

import java.util.Arrays;

public class BubbleSort {
    /*public static void main(String[] args) {
        int[] arr = {18, 5, 3, 5, 1, 8, 44, 12, 25};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println(arr[i] + " ");
        }

        maxMin(arr);
    }

    public static void maxMin(int[] intarr) {
        int maxNum = intarr[0];
//        18,4,5,3,1,8,4,12,25

        for (int j = 0; j < intarr.length - 1; j++) {
            if (intarr[j] < intarr[j + 1]) {
                if (maxNum < intarr[j + 1]) {
                    maxNum = intarr[j + 1];
                }
            } else if (intarr[j] == intarr[j + 1]) {
                if (intarr[j] > maxNum) {
                    maxNum = intarr[j];
                } else if (intarr[j] < maxNum) {
                    maxNum = maxNum;
                }
            }
        }
        System.out.println("max Num is " + maxNum);

    }*/


        public static void main(String[] args) {
            int[] intarr = {18, 4, 5, 3, 1, 8, 4, 12, 25};
            maxMin(intarr);
        }

        public static void maxMin(int[] intarr) {
            int maxNum = intarr[0];
            int minNum = intarr[0];

            for (int j = 1; j < intarr.length; j++) {
                if (intarr[j] > maxNum) {
                    maxNum = intarr[j];
                }
                if (intarr[j] < minNum) {
                    minNum = intarr[j];
                }
            }

            System.out.println("Max number is: " + maxNum);
            System.out.println("Min number is: " + minNum);
        }
    }


