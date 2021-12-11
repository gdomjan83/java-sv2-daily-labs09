package day03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CeasarTest {

    Ceasar ceasar = new Ceasar(3);

    @Test
    void testEncryption() {
        assertEquals("defg", ceasar.encrypts("abcd"));
        assertEquals("grj", ceasar.encrypts("dog"));
    }
}