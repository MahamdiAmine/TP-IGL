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

}