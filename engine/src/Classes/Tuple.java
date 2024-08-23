package Classes;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

public class Tuple{
    Hashtable<String, Object> htblColNameValue;

    @Override
    public String toString() {
        String out = "";
        Enumeration<Object> e = this.htblColNameValue.elements();
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

