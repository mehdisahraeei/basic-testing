package com.my.testing;

import com.my.testing.Computers.Microsoft;
import org.junit.Test;
import static org.junit.Assert.*;

public class MicrosoftTest {

    private Microsoft microsoft;

    public MicrosoftTest() {
        microsoft=new Microsoft();
    }

    @Test
    public void establishment() {
        int establishment=microsoft.Establishment(microsoft.TwoDigits());
        assertEquals(establishment,46);
    }

    @Test
    public void companyName() {
        String companyName=microsoft.companyName("microsoft");
        assertEquals(companyName,"microsoft");
    }

    @Test
    public void developLanguage() {
        String developLanguage=microsoft.DevelopLanguage("C");
        assertEquals(developLanguage,"C");
    }

    @Test
    public void oprationSystem() {
        String oprationSystem=microsoft.OprationSystem("windows");
        assertEquals(oprationSystem,"windows");
    }

}