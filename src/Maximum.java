public class Maximum<E extends Comparable> {
    E x,y,z;

    public Maximum(E x, E y, E z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public E testMaximum()
    {
        return testMaximum(x,y,z);
    }

    public static <E extends Comparable> E testMaximum(E x,E y,E z)
    {
        if(x.compareTo(y)>0 && x.compareTo(z)>0)
            return x;
        else if(y.compareTo(x)>0 && y.compareTo(z)>0)
            return y;
        else
            return z;
    }
}
