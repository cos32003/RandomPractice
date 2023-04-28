package com.practiceinterface;

import com.practiceinterface1.interface1;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Usage {
    @Contract(value = " -> new", pure = true)
    public static interface1 method1(){
        return new ImplementInterface1();
    }

    public static interface1 method2(){
        return new ImplementInterface2();
    }
}
