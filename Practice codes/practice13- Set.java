import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class practice{
    public static void main(String[] args){
        Set<String> hashset = new HashSet<>();
        hashset.add("Apple");
        hashset.add("Banana");
        hashset.add("Orange");
        hashset.add("Berry");
        System.out.println("HashSet (Unsorted): " + hashset);
        Set<String> treeset = new TreeSet<>();
        treeset.add("One");
        treeset.add("Two");
        treeset.add("Three");
        treeset.add("Four");
        System.out.println("TreeSet (sorted): " + treeset);
    }
}
