package com.sdklite.log.bind;

import com.sdklite.log.Level;
import com.sdklite.log.Logger;
import com.sdklite.log.nop.NopLogger;

/**
 * A stub class for logger implementation binding, the logger implementation
 * must implements the stub methods.
 * 
 * @author johnsonlee
 *
 */
public class LoggerBinder {

    public static final LoggerBinder getInstance() {
        return Internal.BINDER;
    }

    private LoggerBinder() {
    }

    public Logger getLogger(final String name) {
        return new NopLogger(name);
    }

    public Level getDefaultLevel() {
        return Level.OFF;
    }

    private static final class Internal {
        private static final LoggerBinder BINDER = new LoggerBinder();
    }
}
