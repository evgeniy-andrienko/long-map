package de.comparus.opensource.longmap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LongMapTest {

    @Test
    void initLongMapWithDefaultParams() {
        new LongMapImpl<>();
    }

    @Test
    void initLongMapWithCustomInitialCapacity() {
        new LongMapImpl<>(100500);
    }

    @Test
    void initLongMapWithIllegalCustomInitialCapacity() {
        IllegalArgumentException illegalArgumentException = assertThrows(
            IllegalArgumentException.class,
            () -> new LongMapImpl<>(-1));

        assertTrue(illegalArgumentException.getMessage().startsWith("Illegal initial capacity: "));
    }

    @Test
    void initLongMapWithIllegalLoadFactor() {
        IllegalArgumentException illegalArgumentException = assertThrows(
            IllegalArgumentException.class,
            () -> new LongMapImpl<>(100500, 0.0F));

        assertTrue(illegalArgumentException.getMessage().startsWith("Illegal load factor: "));
    }

}