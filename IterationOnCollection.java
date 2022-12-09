package skill.vikram;
import java.util.ArrayList;
import java.util.Iterator;

public class IterationOnCollection {
    public static void main(String[] args){
        ArrayList<Integer> item = new ArrayList<Integer>();
        item.add(13);
        item.add(40);
        item.add(5);
        item.add(36);
        item.add(22);
        item.add(8);

        Iterator<Integer> it = item.iterator();

        while(it.hasNext()){
            Integer i = it.next();
            if(i<10){
                it.remove();
            }
        }
        System.out.print(item);
    }

}
