package skill.vikram;

public class CheckLogicalOperator {
    public static void main(String[] args){
        int a=55, b=70;
        if(a<50 && a<b){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        if(a<50 || a < b){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
