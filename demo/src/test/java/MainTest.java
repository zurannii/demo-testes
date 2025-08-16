import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.example.Main;

public class MainTest {
    @Test 
    public void helloTest(){
        Main m = new Main();
        String resultado = m.hello();
        assertEquals("hello, world", resultado);
    }
}
