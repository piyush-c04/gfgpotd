package Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {12,13,15,15,10,10};
        int max = -1;
        int max2 = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != max && max2 < arr[i])
            {
                max2 = arr[i];
            }
        }

        if(max2<max)
        {
            System.out.println(max2);
        }
        else{
            System.out.println(-1);
        }
    }
}
