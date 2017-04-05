import java.util.ArrayList;
/**
 * Created by shafai on 2017-04-04.
 */
public class IntegerList {

    private int value;

    public IntegerList(int value){
        this.value = value;
    }

    public boolean lessThan(IntegerList p){

        return this.value < p.value;
    }
    public String toString(){

        return "<"+this.value +">";
    }
    public static IntegerList[] filter(IntegerList[] v , IntegerList p){
        ArrayList<IntegerList> w = new ArrayList<>();
        for(IntegerList i:w){
            if(i.lessThan(p)){
                w.add(i);
            }
        }
        return w.toArray(new IntegerList[w.size()]);
    }
    public static void main(String[] args){
        IntegerList[] INT = {new IntegerList(100),
                new IntegerList(10),
                new IntegerList(50),
                new IntegerList(110),
                new IntegerList(40),

        };
        IntegerList one = new IntegerList(90);

        IntegerList[] w = filter(INT, one);
        for(int i = 0; i < w.length; i++)
            System.out.print( (w[i]));
    }
}



