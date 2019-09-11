package com.github.ljhan2.slf4j.lamba;

import org.slf4j.Logger;

import com.github.ljhan2.slf4j.lamba.api.LoggerX;

public abstract class LoggerXWrapper {

    public static LoggerX wrapper(Logger logger) {
        LoggerXLamba lambaLogger = LoggerXLamba.builder().logger(logger).build();
        return lambaLogger;
    }

}
