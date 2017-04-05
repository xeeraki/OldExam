/**
 * Created by shafai on 2017-04-04.
 */
public class forLoop {
    public static void main(String[] args){
        int[] u = new int [6];
        int m = 1;
        for( int i = 0; i < u.length; i++){
            u[i]=m;
            m = (m+1) % 5;
            System.out.println(u[i]);
        }
    }


}
