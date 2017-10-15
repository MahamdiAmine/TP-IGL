
import code.MinMax;
import code.VectorHelper;

import static org.junit.Assert.*;
/**
 * <b> VectorHelperTest: pour effectuer les testes unitaires sur les methodes de la classe VectorHelper</b>
 * @see VectorHelper
 * @author Mahamdi Mohammed
 * @version 1.0.4
 */
public class VectorHelperTest {
    @org.junit.Test
    public void tri() throws Exception {
        int[] vect = new int[]{1, 5, 3, 7, 2, 4, 88, 100005};
        VectorHelper.tri(vect);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 7, 88, 100005}, vect);
    }

    @org.junit.Test
    public void sommeVec() throws Exception {
        int[] vect1 = new int[]{1, 5, 3, 7, 2, 4, 88, 100005};
        int[] vect2 = new int[]{9, 5, 7, 2, 7, 2, 11, 5};
        int[] vect3;
        vect3=VectorHelper.sommeVec(vect1,vect2);
        assertArrayEquals(new int[]{10,10,10,9,9,6,99,100010},vect3);
    }


    @org.junit.Test
    public void reverse() throws Exception {
        int[] vect = new int[]{9, 5, 7, 2, 7, 2, 11, 5};
        int[] vect2;
        vect2=VectorHelper.reverse(vect);
        assertArrayEquals(new int[]{5,11,2,7,2,7,5,9},vect2);
    }

    @org.junit.Test
    public void minMax() throws Exception {
        MinMax minmax;
        int[] vect = new int[]{9, 5, 7, 2, 7, 2, 11, 5};
        minmax= VectorHelper.minMax(vect);
        int tab[]=new int [2];
        tab[0]=minmax.getMin();
        tab[1]=minmax.getMax();
        assertArrayEquals(new int[]{2,11},tab);
    }

    @org.junit.Test
    public void puissance() throws Exception {
        int[] vect = new int[]{9, 5, 7, 2, 7, 2, 11, 5};
        int p=2;
        int []vect2=VectorHelper.puissance(vect,2);
        assertArrayEquals(new int[]{81, 25, 49, 4, 49, 4, 121, 25},vect2);
    }

}