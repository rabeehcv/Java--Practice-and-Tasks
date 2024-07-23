import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class practice{
    public static void main(String[] args){
        List<String> arraylist = new ArrayList<>();
        arraylist.add("One");
        arraylist.add("Two");
        arraylist.add("Three");
        arraylist.add("Four");
        arraylist.add("One");//allows duplication
        System.out.println("ArrayList: " + arraylist);

        List<String> linkedlist = new LinkedList<>();
        linkedlist.add("X");
        linkedlist.add("Y");
        linkedlist.add("Z");
        linkedlist.add("P");
        System.out.println("LinkedList: " + linkedlist);
    }
}
