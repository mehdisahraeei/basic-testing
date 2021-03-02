package com.my.testing;

import com.my.testing.Computers.apple;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppleTest {

    private apple apple;

    public AppleTest() {
        apple = new apple();
    }

    @Test
    public void establishment() {
        int establishment = apple.Establishment(apple.TwoDigits());
        assertEquals(establishment, 45);
    }

    @Test
    public void companyName() {
        String companyName = apple.companyName("apple");
        assertEquals(companyName, "apple");
    }

    @Test
    public void developLanguage() {
        String developLanguage = apple.DevelopLanguage("Objective C");
        assertEquals(developLanguage, "Objective C");
    }

    @Test
    public void oprationSystem() {
        String oprationSystem = apple.OprationSystem("windows");
        assertEquals(oprationSystem, "windows");
    }

}