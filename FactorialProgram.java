package skill.vikram;
import java.util.Scanner;

public class FactorialProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = 1;
        if(num == 0){
            fact = 1;
        }else{
            for(int i=1; i<=num; i++){
                fact *=i;
            }
        }
        System.out.println(fact);

    }
}
