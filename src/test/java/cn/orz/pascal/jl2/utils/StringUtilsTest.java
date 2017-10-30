/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.orz.pascal.jl2.utils;

import static cn.orz.pascal.jl2.Extentions.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * String Utility Test.
 *
 * @author koduki
 */
public class StringUtilsTest {

    public StringUtilsTest() {
    }

    @Test
    public void join() {
        assertEquals("a,1", StringUtils.join(",", $("a", 1)));
        assertEquals("a,1,c", StringUtils.join(",", $("a", 1, "c")));
    }
}
