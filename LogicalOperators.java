package skill.vikram;

public class LogicalOperators{
    public static void main(String[] args){
        int p=10, q=25, r=5;
        System.out.println((p < q && q > r));
        System.out.println((p < r || q > p));
        System.out.println(!(p > r && q < p));
    }

}
