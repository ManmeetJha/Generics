public class Maximum<E extends Comparable> {

    public static <E extends Comparable> E testMaximum(E...z)
    {
        E max=z[0];
        for(E element: z)
        {
            if(element.compareTo(max)>0)
                max=element;
        }
        return max;
    }
}
