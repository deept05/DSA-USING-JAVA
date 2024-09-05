import java.util.ArrayList;
import java.util.Collections;
public class arraylist {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<Integer>();

        // Add elements:
        list.add(0);
        list.add(2);
        list.add(5);
        list.add(6);

        System.out.println(list);

        //get elements:
        int element1 = list.get(0);
        System.out.println(element1);


        //add in between:
        list.add(1,3);
        System.out.println(list);

        //set element:
        list.set(0,4);
        System.out.println(list);

        //delete element:
        list.remove(2);
        System.out.println(list);

        //size of element:
        list.size();

        //loop:
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i));
        }
        System.out.println();
        //sorting:
        Collections.sort(list);
        System.out.println(list);

    }
}
