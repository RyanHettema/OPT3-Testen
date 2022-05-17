package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VliegtuigTest {
    @Test
    public void conditionOpstijgenTest() {
        Vliegtuig Cessa = new Vliegtuig(40);
        Vliegtuig Cessa2 = new Vliegtuig(1100);
        assertTrue(Cessa.opstijgen(true, 50));
        assertFalse(Cessa2.opstijgen(false, 60));
    }
@Test
    public void decisionOpstijgTest() {
        Vliegtuig Cessa = new Vliegtuig(40);
        assertTrue(Cessa.opstijgen(true, 50));
        assertFalse(Cessa.opstijgen(false, 50));

    }

    @Test

    public void conditionDecisionOpstijgTest() {
        Vliegtuig Cessa = new Vliegtuig(420);
        Vliegtuig Cessa2 = new Vliegtuig(1454541140);
        assertTrue(Cessa.opstijgen(true, 50));
        assertFalse(Cessa2.opstijgen(false, 10));
    }

    @Test
    public void modifiedDecisionConditionTest() {
        Vliegtuig Cessa = new Vliegtuig(4110);
        Vliegtuig Cessa2 = new Vliegtuig(110);
        assertFalse(Cessa.opstijgen(false, 20));
        assertTrue(Cessa2.opstijgen(true, 20));
        assertTrue(Cessa.opstijgen(true, 60));

    }

    @Test
    public void multipleConditionTest() {
        Vliegtuig zwaar = new Vliegtuig(4110);
        Vliegtuig licht = new Vliegtuig(110);
        assertFalse(zwaar.opstijgen(false, 10)); // 0 0 1
        assertFalse(zwaar.opstijgen(true, 10)); // 0 1 0
        assertTrue(zwaar.opstijgen(true, 60)); // 0 1 1
        assertFalse(licht.opstijgen(false, 20)); // 1 0 0
        assertTrue(licht.opstijgen(true, 20)); // 1 1 0
        assertTrue(licht.opstijgen(true, 60)); // 1 1 1
        assertFalse(licht.opstijgen(false, 60)); // 1 0 1
        assertFalse(zwaar.opstijgen(false, 10)); // 0 0 0
    }


}