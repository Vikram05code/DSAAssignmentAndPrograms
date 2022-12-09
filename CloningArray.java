package skill.vikram;

public class CloningArray {
    public static void main(String[] args){
        int[] arr1 = {1, 5, 6, 7, 8};
        int[] arr2 = arr1.clone();
        arr2[0] = 10;

        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i] +" ");
        }
        System.out.println();

        for(int j=0; j<arr2.length; j++){
            System.out.print(arr2[j]+" ");
        }
    }
}
