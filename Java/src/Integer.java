
    /**
     * Created by shafai on 2017-04-04.
*/
    public class Integer {

        private int value;

        public Integer(int value){
            this.value = value;
        }

        public boolean lessThan(Integer p){

            return this.value < p.value;
        }
        public String toString(){

            return "<"+this.value +">";
        }
        public static Integer[] filter(Integer[] v , Integer p){
            int countInt = 0;
            for( int i = 0; i < v.length; i ++){
                if(v[i].lessThan(p)){
                    countInt++;
                }
            }
            Integer[] w = new Integer[countInt];
            int companionVar = 0;
            for(int i = 0;  i < v.length; i ++){
                if( v[i].lessThan(p)){
                    w[companionVar++] = v[i];
                }
            }
            return w;
        }
        public static void main(String[] args){
            Integer[] INT = {new Integer(100),
                    new Integer(10),
                    new Integer(50),
                    new Integer(110),
                    new Integer(40),

            };
            Integer one = new Integer(90);

            Integer[] w = filter(INT, one);
            for(int i = 0; i < w.length; i++)
                System.out.print( (w[i]));
        }
    }




