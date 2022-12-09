package skill.vikram;

public class ConvertListOfStrings {
    public static void main(String[] args){
        String[] list = {"ab","bc","cd","de","ef","fg","gh"};

        for(int i=0; i<list.length; i++){
            if(i % 2 == 1){
                System.out.println(list[i]);
            }
        }
    }
}
