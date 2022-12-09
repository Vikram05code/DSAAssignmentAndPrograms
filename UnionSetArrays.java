package skill.vikram;
import java.util.HashSet;
public class UnionSetArrays {
    public static void main(String[] args){
      int[] a = {1,2,5,6,2,3,5,7,3};
      int[] b = {2,4,5,6,8,9,4,6,5,4};

      getUnion(a, 9, b, 10);

    }
    static void getUnion(int[] a, int n, int[] b, int m){

        //Defining set container list
        HashSet<Integer> list = new HashSet<Integer>();

        //inserting array elements in list
        for(int i=0; i<n; i++){
            list.add(a[i]);
        }

        for(int j=0; j<m; j++){
            list.add(b[j]);
        }

        System.out.println("Numbers of elements after union operation: "+list.size());
        System.out.println("The union set of both arrays is : ");
        System.out.print(list.toString() + " ");
    }
}