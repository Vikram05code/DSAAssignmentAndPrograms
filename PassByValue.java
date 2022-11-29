package skill.vikram;

public class PassByValue {

    static void changeValue(int a){
        a *=100;
        System.out.println("In the change method : "+ a);
    }

    public static void main(String[] args){
        int a = 10;
        System.out.println("Before called function : "+ a);
        changeValue(a);
        System.out.println("After change value called : "+a);

    }
}
