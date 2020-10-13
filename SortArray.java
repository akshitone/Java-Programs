import java.util.Arrays;
public class SortArray{
    public static void main(String args[]){
        int arr[] = {5,7,3,10,4};
        Arrays.sort(arr);
        for(int i=0;i<5;i++)
        {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("");
        System.out.println(Arrays.binarySearch(arr, 7)); 
    }
}