import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppleTest {


    @Test
    void testGetSize(){

        Apple apple = new Apple(100);
        assertEquals(apple.getSize(),100);
    }

    @org.junit.jupiter.api.Test
    void getSize() {
    }
}