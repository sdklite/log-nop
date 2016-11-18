package com.sdklite.log.nop;

import com.sdklite.log.AbstractLogger;
import com.sdklite.log.Level;
import com.sdklite.log.Logger;

/**
 * A silent logger which do nothing
 * 
 * @author johnsonlee
 *
 */
public class NopLogger extends AbstractLogger {

    private final String name;

    public NopLogger(final String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Logger println(final Level level, final String msg, final Object... args) {
        return this;
    }

}
