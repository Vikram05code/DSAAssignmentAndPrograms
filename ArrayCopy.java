package skill.vikram;
import java.util.Arrays;
public class ArrayCopy {
    public static void main(String[] args){
        int[] arr1 = {1, 4, 5, 8, 12, 15};
        int[] arr2 = Arrays.copyOf(arr1, 6);
        arr2[0] = 20;
        //original array
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i] +" ");
        }
        System.out.println();
        //copy array
        for(int j=0; j<arr2.length; j++){
            System.out.print(arr2[j] +" ");
        }
    }
}
