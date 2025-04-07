package Arrays;

import java.util.*;

public class MoveZerotoEnd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 3, 0, 5};
        //0,1,2,3,4,5
        //output = {1,2,3,5,0,0} without making a copy of the same
                int k=0;
                for(int i=0;i<arr.length;i++){
                    if(arr[i]!=0){
                        int temp=arr[k];
                        arr[k]=arr[i];
                        arr[i]= temp;
                        k++;
                    }
                }
        for (int i = 0; i < arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
