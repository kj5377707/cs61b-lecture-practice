public class Lists1Exercises {
    /** Returns an IntList identical to L, but with
      * each element incremented by x. L is not allowed
      * to change. */
    public static IntList incrList(IntList L, int x) {
        // generate a new list by L
        IntList l2 = new IntList(0, null);
        IntList temp = l2;
        while (L != null) {
            temp.first = L.first + x;
            // check if this the last node, if yes, don't allocate new node in new list
            if (L.rest != null) {
                temp.rest = new IntList(0, null);
                temp = temp.rest;
            }
            L = L.rest;
        }
        return l2;
    }

    /** Returns an IntList identical to L, but with
      * each element incremented by x. Not allowed to use
      * the 'new' keyword. */
    public static IntList dincrList(IntList L, int x) {
        IntList Q = L, temp = Q;
        while (temp != null) {
            temp.first -= x;
            temp = temp.rest;
        }
        return Q;
    }

    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L.rest = new IntList(7, null);
        L.rest.rest = new IntList(9, null);

        // System.out.println(L.size());
        // System.out.println(L.iterativeSize());

        // test for incrList
        // IntList L2 = incrList(L, 3);
        // int size = L2.iterativeSize();
        // System.out.println(size);

        IntList L3 = dincrList(L, 2);
        if (L3 == L)
            System.out.println("L3 == L");
        L3.iterativeSize();
        L.iterativeSize();

        // Test your answers by uncommenting. Or copy and paste the
        // code for incrList and dincrList into IntList.java and
        // run it in the visualizer.
        // System.out.println(L.get(1));
        // System.out.println(L.get(2));
        System.out.println(incrList(L, 3));
        // System.out.println(dincrList(L, 3));        
    }
}