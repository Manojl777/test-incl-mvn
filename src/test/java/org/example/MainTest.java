package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

        @Test
        public void testAdd() {
            int result = Main.add(2, 3);
            System.out.println(result);
            assertEquals(5, result);
        }
}
