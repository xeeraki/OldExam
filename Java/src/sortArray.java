import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by shafai on 2017-04-07.
 */
    public class sortArray {
        public static void sort (String[] str)
        {
            int lastPos = str.length - 1;
            int minPos = 0;
            String s = "";
            for (int i = 0; i < lastPos; i++)
            {
                minPos = i;
                for (int j = i + 1; j <= lastPos; j++)
                    if (str[j].compareTo (str[minPos]) < 0)
                        minPos = j;
                if (minPos != i)
                {
                    s = str[i];
                    str[i] = str[minPos];
                    str[minPos] = s;
                }
            }
        }

        public static void main(String[] args){
            String[] str = {"H", "B", "D", "G","F", "E", "A", "C"};
            sort(str);
            System.out.println(Arrays.toString(str));
        }
    }
