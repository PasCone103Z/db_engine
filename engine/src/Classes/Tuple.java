package Classes;

import java.util.*;

public class Tuple{
    LinkedHashMap<String, Object> htblColNameValue;

    public Tuple(LinkedHashMap<String, Object> htblColNameValue) {
        this.htblColNameValue = htblColNameValue;
    }



    @Override
    public String toString() {
        String out = "";
        Collection<Object> e = this.htblColNameValue.values();
        while (!e.isEmpty()){
            String in = "";
            in.concat(out);
            out.concat(e.stream().iterator().next().toString());
            out.concat("," + in);
        }
        System.out.print(out);
        return out;
    }
}

