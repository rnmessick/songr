package com.potionsbyfreya.songr;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HomeControllerTest {

    @Test
    public void testReverseWordOrder() {
        assertEquals("Baldr dog my love I", HomeController.reverseOrderOfWords("I love my dog Baldr"));
    }
}
