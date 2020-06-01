import java.util.*;

public class comparatorTest {

    public static void main(String args[]){
        TreeSet<String> ts = new TreeSet(new Comparator<String>() {
            @Override
            // o1 is always the new element.
            public int compare(String o1, String o2) {
                System.out.println("o1 = " + o1);
                System.out.println("o2 = " + o2);
                return o2.compareTo(o1);
            }
        });

        //C is the start string so comparision will always start from C when inserting a new string.
        //If compareTo is positive the new item goes to right of the element else it goes to left.

        ts.add("C");
        ts.add("B");
        ts.add("E");
        ts.add("D");
        System.out.println(ts);

        System.out.println(Collections.min(ts));

        Vector<String> v = new Vector<>();
        v.add("Ravi");
        v.add("Sharma");

        Iterator i  = v.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        Enumeration e = v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
