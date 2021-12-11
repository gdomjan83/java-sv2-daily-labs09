package day03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CeasarTest {

    Ceasar ceasar = new Ceasar(3);

    @Test
    void testEncryption() {
        assertEquals("defg", ceasar.encrypts("abcd"));
        assertEquals("grz", ceasar.encrypts("dow"));
        assertEquals("gra", ceasar.encrypts("dox"));
        assertEquals("grb", ceasar.encrypts("doy"));
        assertEquals("grc", ceasar.encrypts("doz"));
        assertEquals("gr c", ceasar.encrypts("do z"));
    }
}