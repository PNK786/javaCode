package src.collections;

import java.util.Arrays;

public class BubbleSort
{
    public static void main(String[] args) {
        int[] arr={18,4,5,3,1,8,4,12,25};

        for(int i=0;i<arr.length-1;i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i=0;i<arr.length-1;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}
