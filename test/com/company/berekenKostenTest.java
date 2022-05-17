package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class berekenKostenTest {
    @Test
    void testKostenBerekening() {
        Vliegtuig Boeing = new Vliegtuig(-1);
        Vliegtuig Boeing1 = new Vliegtuig(999);
        Vliegtuig Boeing2 = new Vliegtuig(1000);
        Vliegtuig Boeing3 = new Vliegtuig(1001);
        Vliegtuig Boeing4 = new Vliegtuig(4999);
        Vliegtuig Boeing5 = new Vliegtuig(5000);
        Vliegtuig Boeing6 = new Vliegtuig(5001);

        // Equivalent
        assertEquals(100, Boeing.berekenPrijs(1,false,false)); // -1
        assertEquals(100,Boeing1.berekenPrijs(1,false,false)); // 999
        assertEquals(500, Boeing2.berekenPrijs(1,false,false)); // 1000
        assertEquals(500, Boeing3.berekenPrijs(1,false,false)); // 1001
        assertEquals(500, Boeing4.berekenPrijs(1,false,false)); // 4999
        assertEquals(2500, Boeing5.berekenPrijs(1,false,false)); // 5000
        assertEquals(2500, Boeing6.berekenPrijs(1,false,false)); // 5001
        assertEquals(500, Boeing2.berekenPrijs(1,false,false)); // 1000 - 1
        assertEquals(500, Boeing2.berekenPrijs(2,false,false)); // 1000 - 2
        assertEquals(750, Boeing2.berekenPrijs(3,false,false)); // 1000 - 3

        // Pairwise
        assertEquals(1089, Boeing1.berekenPrijs(1,true,true)); // -1
        assertEquals(150, Boeing1.berekenPrijs(3,false,false)); // 999
        assertEquals(605, Boeing3.berekenPrijs(1,false,true)); // 1000
        assertEquals(1550, Boeing3.berekenPrijs(3,true,false)); // 1001
        assertEquals(3300, Boeing6.berekenPrijs(1,true,false)); // 4999
        assertEquals(4537, Boeing6.berekenPrijs(3,false,true)); // 5000



    }

}