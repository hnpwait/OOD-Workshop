import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloTest {
    @Test
    @DisplayName("เริ่มเทส ...")
    public void case01() {
        Hello hello = new Hello();
        String name = "hattaya";
        //Act
        String actualResult = hello.sawasdee(name);
        //Assert
        assertEquals("Hello hattaya", actualResult);
    }
}
