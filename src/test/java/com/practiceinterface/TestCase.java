package com.practiceinterface;

import com.practiceinterface1.interface1;
import org.testng.annotations.Test;

public class TestCase {
@Test
    public void testcase1(){
       interface1 ref1 = Usage.method1();
       ref1.printAnything();
       ref1.printSomething();

    }
    @Test
    public void testcase2(){
    interface1 ref2 = Usage.method2();
    ref2.printSomething();
    ref2.printAnything();
    }


}
