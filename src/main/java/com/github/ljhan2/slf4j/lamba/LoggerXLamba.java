package com.github.ljhan2.slf4j.lamba;

import java.util.function.Supplier;

import org.slf4j.Logger;
import org.slf4j.Marker;

import com.github.ljhan2.slf4j.lamba.api.LoggerX;

public class LoggerXLamba implements LoggerX {

    private Logger actualLogger;

    private LoggerXLamba(Logger logger) {
        actualLogger = logger;
    }

    public static LoggerXLamba.Builder builder() {
        return new LoggerXLamba.Builder();
    }

    public static class Builder {

        private Logger logger;

        public Builder logger(Logger logger) {
            this.logger = logger;
            return this;
        }

        public LoggerXLamba build() {
            return new LoggerXLamba(this.logger);
        }
    }

    @Override
    public void isTraceEnabled(Supplier<?> argSupplier) {
        if (isTraceEnabled()) {
            actualLogger.trace(argSupplier.get().toString());
        }
    }

    @Override
    public void isDebugEnabled(Supplier<?> argSupplier) {
        if (isDebugEnabled()) {
            actualLogger.debug(argSupplier.get().toString());
        }
    }

    @Override
    public void isInfoEnabled(Supplier<?> argSupplier) {
        if (isInfoEnabled()) {
            actualLogger.info(argSupplier.get().toString());
        }
    }

    @Override
    public void isWarnEnabled(Supplier<?> argSupplier) {
        if (isWarnEnabled()) {
            actualLogger.warn(argSupplier.get().toString());
        }
    }

    @Override
    public void isErrorEnabled(Supplier<?> argSupplier) {
        if (isErrorEnabled()) {
            actualLogger.error(argSupplier.get().toString());
        }
    }

    @Override
    public String getName() {
        return actualLogger.getName();
    }

    @Override
    public boolean isTraceEnabled() {
        return actualLogger.isTraceEnabled();
    }

    @Override
    public void trace(String msg) {
        actualLogger.trace(msg);
    }

    @Override
    public void trace(String format, Object arg) {
        actualLogger.trace(format, arg);
    }

    @Override
    public void trace(String format, Object arg1, Object arg2) {
        actualLogger.trace(format, arg1, arg2);
    }

    @Override
    public void trace(String format, Object... arguments) {
        actualLogger.trace(format, arguments);
    }

    @Override
    public void trace(String msg, Throwable t) {
        actualLogger.trace(msg, t);
    }

    @Override
    public boolean isTraceEnabled(Marker marker) {
        return actualLogger.isTraceEnabled(marker);
    }

    @Override
    public void trace(Marker marker, String msg) {
        actualLogger.trace(marker, msg);
    }

    @Override
    public void trace(Marker marker, String format, Object arg) {
        actualLogger.trace(marker, format, arg);
    }

    @Override
    public void trace(Marker marker, String format, Object arg1, Object arg2) {
        actualLogger.trace(marker, format, arg1, arg2);
    }

    @Override
    public void trace(Marker marker, String format, Object... argArray) {
        actualLogger.trace(marker, format, argArray);
    }

    @Override
    public void trace(Marker marker, String msg, Throwable t) {
        actualLogger.trace(marker, msg, t);
    }

    @Override
    public boolean isDebugEnabled() {
        return actualLogger.isDebugEnabled();
    }

    @Override
    public void debug(String msg) {
        actualLogger.debug(msg);
    }

    @Override
    public void debug(String format, Object arg) {
        actualLogger.debug(format, arg);
    }

    @Override
    public void debug(String format, Object arg1, Object arg2) {
        actualLogger.debug(format, arg1, arg2);
    }

    @Override
    public void debug(String format, Object... arguments) {
        actualLogger.debug(format, arguments);
    }

    @Override
    public void debug(String msg, Throwable t) {
        actualLogger.debug(msg, t);
    }

    @Override
    public boolean isDebugEnabled(Marker marker) {
        return actualLogger.isDebugEnabled(marker);
    }

    @Override
    public void debug(Marker marker, String msg) {
        actualLogger.debug(marker, msg);
    }

    @Override
    public void debug(Marker marker, String format, Object arg) {
        actualLogger.debug(marker, format, arg);

    }

    @Override
    public void debug(Marker marker, String format, Object arg1, Object arg2) {
        actualLogger.debug(marker, format, arg1, arg2);
    }

    @Override
    public void debug(Marker marker, String format, Object... arguments) {
        actualLogger.debug(marker, format, arguments);
    }

    @Override
    public void debug(Marker marker, String msg, Throwable t) {
        actualLogger.debug(marker, msg, t);
    }

    @Override
    public boolean isInfoEnabled() {
        return actualLogger.isInfoEnabled();
    }

    @Override
    public void info(String msg) {
        actualLogger.info(msg);
    }

    @Override
    public void info(String format, Object arg) {
        actualLogger.info(format, arg);
    }

    @Override
    public void info(String format, Object arg1, Object arg2) {
        actualLogger.info(format, arg1, arg2);
    }

    @Override
    public void info(String format, Object... arguments) {
        actualLogger.info(format, arguments);
    }

    @Override
    public void info(String msg, Throwable t) {
        actualLogger.info(msg, t);
    }

    @Override
    public boolean isInfoEnabled(Marker marker) {
        return actualLogger.isInfoEnabled(marker);
    }

    @Override
    public void info(Marker marker, String msg) {
        actualLogger.info(marker, msg);
    }

    @Override
    public void info(Marker marker, String format, Object arg) {
        actualLogger.info(marker, format, arg);
    }

    @Override
    public void info(Marker marker, String format, Object arg1, Object arg2) {
        actualLogger.info(marker, format, arg1, arg2);
    }

    @Override
    public void info(Marker marker, String format, Object... arguments) {
        actualLogger.info(marker, format, arguments);
    }

    @Override
    public void info(Marker marker, String msg, Throwable t) {
        actualLogger.info(marker, msg, t);
    }

    @Override
    public boolean isWarnEnabled() {
        return actualLogger.isWarnEnabled();
    }

    @Override
    public void warn(String msg) {
        actualLogger.warn(msg);
    }

    @Override
    public void warn(String format, Object arg) {
        actualLogger.warn(format, arg);
    }

    @Override
    public void warn(String format, Object... arguments) {
        actualLogger.warn(format, arguments);
    }

    @Override
    public void warn(String format, Object arg1, Object arg2) {
        actualLogger.warn(format, arg1, arg2);
    }

    @Override
    public void warn(String msg, Throwable t) {
        actualLogger.warn(msg, t);
    }

    @Override
    public boolean isWarnEnabled(Marker marker) {
        return actualLogger.isWarnEnabled(marker);
    }

    @Override
    public void warn(Marker marker, String msg) {
        actualLogger.warn(marker, msg);
    }

    @Override
    public void warn(Marker marker, String format, Object arg) {
        actualLogger.warn(marker, format, arg);
    }

    @Override
    public void warn(Marker marker, String format, Object arg1, Object arg2) {
        actualLogger.warn(marker, format, arg1, arg2);
    }

    @Override
    public void warn(Marker marker, String format, Object... arguments) {
        actualLogger.warn(marker, format, arguments);
    }

    @Override
    public void warn(Marker marker, String msg, Throwable t) {
        actualLogger.warn(marker, msg, t);
    }

    @Override
    public boolean isErrorEnabled() {
        return actualLogger.isErrorEnabled();
    }

    @Override
    public void error(String msg) {
        actualLogger.error(msg);
    }

    @Override
    public void error(String format, Object arg) {
        actualLogger.error(format, arg);
    }

    @Override
    public void error(String format, Object arg1, Object arg2) {
        actualLogger.error(format, arg1, arg2);
    }

    @Override
    public void error(String format, Object... arguments) {
        actualLogger.error(format, arguments);
    }

    @Override
    public void error(String msg, Throwable t) {
        actualLogger.error(msg, t);

    }

    @Override
    public boolean isErrorEnabled(Marker marker) {
        return actualLogger.isErrorEnabled(marker);
    }

    @Override
    public void error(Marker marker, String msg) {
        actualLogger.error(marker, msg);
    }

    @Override
    public void error(Marker marker, String format, Object arg) {
        actualLogger.error(marker, format, arg);
    }

    @Override
    public void error(Marker marker, String format, Object arg1, Object arg2) {
        actualLogger.error(marker, format, arg1, arg2);
    }

    @Override
    public void error(Marker marker, String format, Object... arguments) {
        actualLogger.error(marker, format, arguments);
    }

    @Override
    public void error(Marker marker, String msg, Throwable t) {
        actualLogger.error(marker, msg, t);
    }
}
