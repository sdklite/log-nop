package com.sdklite.log.nop;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sdklite.log.Level;
import com.sdklite.log.Logger;
import com.sdklite.log.LoggerFactory;

public class TestNopLogger {

    @Test
    public void test_logger_binding() {
        final Logger logger = LoggerFactory.getLogger("Nop");
        assertNotNull(logger);
        assertEquals("Nop", logger.getName());
        assertEquals(Level.OFF, logger.getLevel());
    }

}
