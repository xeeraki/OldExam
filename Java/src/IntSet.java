/**
 * Created by shafai on 2017-03-28.
 */
public class IntSet {

    private int[] elements = null;

    public IntSet(int[] elements) {
        this.elements = new int[elements.length];
        for (int pos = 0; pos < elements.length; pos++) {
            this.elements[pos] = elements[pos];
        }
    }



    // toString returns a string representation of the set
    public String toString() {
        String s = "{";
        if (elements.length == 0)
            s = s + "}";
        else {
            for (int pos = 0; pos < elements.length - 1; pos++)
                s = s + elements[pos] + ", ";
            s = s + elements[elements.length - 1] + "}";
        }

        return s;
    }

    // contains returns true if the given element
    // is a member of the set, and false otherwise.
    public boolean contains(int element) {

        for (int i = 0; i < this.elements.length; i++) {
            if (this.elements[i] == element)
                return true;
        }
        return false;
    }


    // intersection returns a set which contains the elements
    // in the set that are also members of the given set
    public IntSet intersection(IntSet set) {
        // code is missing here
        // use the method contains
        int members = 0;
        for (int i = 0; i < elements.length; i++) {
            if (set.contains(elements[i]))
                members++;
        }

        int[] newMembers = new int [members];
        int position = 0;
            for(int i = 0; i < elements.length; i++){
                if(set.contains(elements[i]))
                newMembers[position++] = this.elements[i];
                //position++ this is a question for stackoverflow
            }
       return new IntSet(newMembers);
    }

    //Some instances of the class IntSet are created and used like this:
    public static void main(String[] args) {
    int[] numbers1 = {9, 1, 4, 3, 7, 5};
    IntSet set1 = new IntSet(numbers1);
    int[] numbers2 = {4, 2, 8, 5, 7};
    IntSet set2 = new IntSet(numbers2);
        System.out.println(set1);
        System.out.println(set2);

    IntSet set = set1.intersection(set2);
        System.out.println(set);
    //When this code fragment is executed, the following printout is produced:
    //{9, 1, 4, 3, 7, 5}
    //{4, 2, 8, 5, 7}
    //{4, 7, 5}
    }
}
