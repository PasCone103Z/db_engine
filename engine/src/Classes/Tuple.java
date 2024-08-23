package Classes;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.LinkedHashMap;

public class Tuple{
    LinkedHashMap<String, Object> htblColNameValue;

    public Tuple(LinkedHashMap<String, Object> htblColNameValue) {
        this.htblColNameValue = htblColNameValue;
    }



    @Override
    public String toString() {
        String out = "";
        Enumeration<Object> e = this.htblColNameValue.values();
        while (e.hasMoreElements()){
            String in = "";
            in.concat(out);
            out.concat(e.nextElement().toString());
            out.concat("," + in);
        }
        System.out.print(out);
        return out;
    }
}

