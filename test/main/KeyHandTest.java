public package main;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.awt.Button;
import java.awt.Component;
import java.awt.event.KeyEvent;

public class KeyHandTest {

    @Test
    public void testKeyPressedW() {
    
        KeyHand keyH = new KeyHand();
        Component dummyComponent = new Button(); 
        
        
        KeyEvent pressW = new KeyEvent(dummyComponent, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_W, 'W');

        
        keyH.keyPressed(pressW);

        
        assertTrue(keyH.upPress, "La variable upPress debería ser true al presionar W");
        assertFalse(keyH.downPress, "La variable downPress debería ser false al presionar W");
    }
} {
    
}
