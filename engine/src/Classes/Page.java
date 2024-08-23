package Classes;

public class Page {
    int max = 0;
    Tuple[] tuples = new Tuple[max];

    public void init(int n){
        max = n;
    }
    public Page(int maxNo){
        max = maxNo;
        tuples = new Tuple[maxNo];
    }

    @Override
    public String toString() {
        String out = "";
        for (Tuple t : tuples){
            out.concat(t.toString());
        }
        return out;
    }

    public boolean isOverflow(){
        return (tuples.length == max);
    }



}
