public class Maximum {

    //Integers
    public static int getMaximumInteger(Integer[] i) {
        Integer max = i[0];
        for (Integer element : i) {
            if (element.compareTo(max) > 0)
                max = element;
        }
        System.out.println("Largest element is:" + max);
        return max;
    }

    //Float
    public static float getMaximumFloat(Float[] i) {
        Float max = i[0];
        for (Float element : i) {
            if (element.compareTo(max) > 0)
                max = element;
        }
        System.out.println("Largest element is:" + max);
        return max;
    }

    //String
    public static String getMaximumString(String[] i) {
        String max = i[0];
        for (String element : i) {
            if (element.compareToIgnoreCase(max) > 0)
                max = element;
        }
        System.out.println("Largest element is:" + max);
        return max;
    }

    //Generic
    public static <E extends Comparable> E getMaximumGeneric(E[] i){
        E max = i[0];
        for (E element : i)
        { if (element.compareTo(max)>0)
            max = element; }
        System.out.println("Largest element is:"+max);
        return max;
    }
}
