package com.github.ljhan2.slf4j.lamba.api;

import java.util.function.Supplier;

import org.slf4j.Logger;
import org.slf4j.Marker;

import com.github.ljhan2.slf4j.lamba.LoggerXUtils;
import com.github.ljhan2.slf4j.lamba.LoggerXWrapper;

public interface LoggerX extends Logger {

    public static LoggerX wrapper(Logger logger) {
        return LoggerXWrapper.wrapper(logger);
    }

    void isTraceEnabled(Supplier<?> argSupplier);

    void isDebugEnabled(Supplier<?> argSupplier);

    void isInfoEnabled(Supplier<?> argSupplier);

    void isWarnEnabled(Supplier<?> argSupplier);

    void isErrorEnabled(Supplier<?> argSupplier);

    default void trace(String format, Supplier<?> argSupplier) {
        if (isTraceEnabled()) {
            trace(format, argSupplier.get());
        }
    }

    default void trace(String format, Supplier<?> arg1Supplier, Supplier<?> arg2Supplier) {
        if (isTraceEnabled()) {
            trace(format, arg1Supplier.get(), arg2Supplier.get());
        }
    }

    default void trace(String format, Supplier<?>... argumentSuppliers) {
        if (isTraceEnabled()) {
            trace(format, LoggerXUtils.supplierArray2ObjectArray(argumentSuppliers));
        }
    }

    default void trace(Marker marker, String format, Supplier<?> argSupplier) {
        if (isTraceEnabled()) {
            trace(marker, format, argSupplier.get());
        }
    }

    default void trace(Marker marker, String format, Supplier<?> arg1Supplier, Supplier<?> arg2Supplier) {
        if (isTraceEnabled()) {
            trace(marker, format, arg1Supplier.get(), arg2Supplier.get());
        }
    }

    default void trace(Marker marker, String format, Supplier<?>... argArraySupplier) {
        if (isTraceEnabled()) {
            trace(marker, format, LoggerXUtils.supplierArray2ObjectArray(argArraySupplier));
        }
    }

    default void debug(String format, Supplier<?> argSupplier) {
        if (isDebugEnabled()) {
            debug(format, argSupplier.get());
        }
    }

    default void debug(String format, Supplier<?> arg1Supplier, Supplier<?> arg2Supplier) {
        if (isDebugEnabled()) {
            debug(format, arg1Supplier.get(), arg2Supplier.get());
        }
    }

    default void debug(String format, Supplier<?>... argumentsSupplier) {
        if (isDebugEnabled()) {
            debug(format, LoggerXUtils.supplierArray2ObjectArray(argumentsSupplier));
        }
    }

    default void debug(Marker marker, String format, Supplier<?> argSupplier) {
        if (isDebugEnabled()) {
            debug(marker, format, argSupplier.get());
        }

    }

    default void debug(Marker marker, String format, Supplier<?> arg1Supplier, Supplier<?> arg2Supplier) {
        if (isDebugEnabled()) {
            debug(marker, format, arg1Supplier.get(), arg2Supplier.get());
        }
    }

    default void debug(Marker marker, String format, Supplier<?>... argumentsSupplier) {
        if (isDebugEnabled()) {
            debug(marker, format, LoggerXUtils.supplierArray2ObjectArray(argumentsSupplier));
        }
    }

    default void info(String format, Supplier<?> argSupplier) {
        if (isInfoEnabled()) {
            info(format, argSupplier.get());
        }
    }

    default void info(String format, Supplier<?> arg1Supplier, Supplier<?> arg2Supplier) {
        if (isInfoEnabled()) {
            info(format, arg1Supplier.get(), arg2Supplier.get());
        }
    }

    default void info(String format, Supplier<?>... argumentsSupplier) {
        if (isInfoEnabled()) {
            info(format, LoggerXUtils.supplierArray2ObjectArray(argumentsSupplier));
        }
    }

    default void info(Marker marker, String format, Supplier<?> argSupplier) {
        if (isInfoEnabled()) {
            info(marker, format, argSupplier.get());
        }
    }

    default void info(Marker marker, String format, Supplier<?> arg1Supplier, Supplier<?> arg2Supplier) {
        if (isInfoEnabled()) {
            info(marker, format, arg1Supplier.get(), arg2Supplier.get());
        }
    }

    default void info(Marker marker, String format, Supplier<?>... argumentsSupplier) {
        if (isInfoEnabled()) {
            info(marker, format, LoggerXUtils.supplierArray2ObjectArray(argumentsSupplier));
        }
    }

    default void warn(String format, Supplier<?> argSupplier) {
        if (isWarnEnabled()) {
            warn(format, argSupplier.get());
        }
    }

    default void warn(String format, Supplier<?>... argumentsSupplier) {
        if (isWarnEnabled()) {
            warn(format, LoggerXUtils.supplierArray2ObjectArray(argumentsSupplier));
        }
    }

    default void warn(String format, Supplier<?> arg1Supplier, Supplier<?> arg2Supplier) {
        if (isWarnEnabled()) {
            warn(format, arg1Supplier.get(), arg2Supplier.get());
        }
    }

    default void warn(Marker marker, String format, Supplier<?> argSupplier) {
        if (isWarnEnabled()) {
            warn(marker, format, argSupplier.get());
        }
    }

    default void warn(Marker marker, String format, Supplier<?> arg1Supplier, Supplier<?> arg2Supplier) {
        if (isWarnEnabled()) {
            warn(marker, format, arg1Supplier.get(), arg2Supplier.get());
        }
    }

    default void warn(Marker marker, String format, Supplier<?>... argumentsSupplier) {
        if (isWarnEnabled()) {
            warn(marker, format, LoggerXUtils.supplierArray2ObjectArray(argumentsSupplier));
        }
    }

    default void error(String format, Supplier<?> argSupplier) {
        if (isErrorEnabled()) {
            error(format, argSupplier.get());
        }
    }

    default void error(String format, Supplier<?> arg1Supplier, Supplier<?> arg2Supplier) {
        if (isErrorEnabled()) {
            error(format, arg1Supplier.get(), arg2Supplier.get());
        }
    }

    default void error(String format, Supplier<?>... argumentsSupplier) {
        if (isErrorEnabled()) {
            error(format, LoggerXUtils.supplierArray2ObjectArray(argumentsSupplier));
        }
    }

    default void error(Marker marker, String format, Supplier<?> argSupplier) {
        if (isErrorEnabled()) {
            error(marker, format, argSupplier.get());
        }
    }

    default void error(Marker marker, String format, Supplier<?> arg1Supplier, Supplier<?> arg2Supplier) {
        if (isErrorEnabled()) {
            error(marker, format, arg1Supplier.get(), arg2Supplier.get());
        }
    }

    default void error(Marker marker, String format, Supplier<?>... argumentsSupplier) {
        if (isErrorEnabled()) {
            error(marker, format, LoggerXUtils.supplierArray2ObjectArray(argumentsSupplier));
        }
    }

}
