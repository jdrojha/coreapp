import java.util.HashMap;
import java.util.Map;

public class ResearchCore {
    public static void main(String[] args) {
        System.out.println("Hello ->");
        Map<String, Integer> ob = new HashMap<String, Integer>();
         Integer val =  ob.put("rj", 123);
        System.out.println("Hello2 ->"+val);

        Integer val3 = ob.put("rj2", 123);
        System.out.println("Hello3 ->"+val3);

        Integer val4 = ob.put("jr", 123);
        System.out.println("Hello3 ->"+val4);




    }
}
