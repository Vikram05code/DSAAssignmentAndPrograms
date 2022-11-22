package skill.vikram;

public class SumUsingWhile {
    public static void main(String[] args){
        int sum = 0;
        int num=1;
        do{
            sum+=num;
            num++;
        }while(num<=10);
        System.out.println(sum);
    }
}
