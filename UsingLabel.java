package skill.vikram;

public class UsingLabel {
    public static void main(String[] args){
       /* first:
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(i==1 && j==1){
                    continue first;
                }
                System.out.println(i+" "+j);
            }
        } */

        second:
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(i==1 && j==1){
                    break second;
                }
                System.out.println(i+" "+j);
            }
        }

    }
}
