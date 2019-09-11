package com.github.ljhan2.slf4j.lamba;

import java.util.function.Supplier;

public abstract class LoggerXUtils {

    public static Object[] supplierArray2ObjectArray(Supplier<?>... argumentsSupplier) {
        Object[] arguments = new Object[argumentsSupplier.length];
        for (int i = 0; i < argumentsSupplier.length; i++) {
            arguments[i] = argumentsSupplier[i].get();
        }
        return arguments;
    }

}
