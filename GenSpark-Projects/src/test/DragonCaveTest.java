import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class DragonCaveTest {
    DragonCave dc = new DragonCave();

    @Test
    void caveChoice() {
        assertEquals("You die.", dc.caveChoice(1));
        assertEquals("You live.", dc.caveChoice(2));
    }

    @Test
    void intro() {
        assertEquals("""
                You are in a land full of dragons. In front of you, you see two caves. In one cave, the dragon is friendly
                and will share his treasure with you. The other dragon is greedy and hungry and will eat you on sight.
                Which cave will you go into?: 
                """, dc.intro());
    }
}