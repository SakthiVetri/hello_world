package shen.hello_world;

import org.junit.Test;
import sun.misc.Unsafe;

import java.lang.reflect.Field;

import static junit.framework.TestCase.assertNotNull;

/**
 * Created by shenb on 2/04/2018.
 */
public class UnsafeTest {

    @Test
    public void testUnsafe() throws NoSuchFieldException, IllegalAccessException {
        Field unsafeField = Unsafe.class.getDeclaredField("theUnsafe");
        unsafeField.setAccessible(true);

        Unsafe unsafe = (Unsafe) unsafeField.get(null);

        assertNotNull(unsafe);
    }
}
