/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.orz.pascal.jl2.collections;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static cn.orz.pascal.jl2.collections.Tuples.*;
import static cn.orz.pascal.jl2.Extentions.*;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

/**
 * Tuples Test.
 *
 * @author koduki
 */
public class TupleTest {

    public TupleTest() {
    }

    @Test
    public void testTuple2() {
        Tuple2<Integer, String> x = $(1, "A");
        assertThat(x._1(), is(1));
        assertThat(x._2(), is("A"));
    }

    @Test
    public void testTuple3() {
        Tuple3<Integer, String, String> x = $(1, "A", "B");
        assertThat(x._1(), is(1));
        assertThat(x._2(), is("A"));
        assertThat(x._3(), is("B"));

    }

    @Test
    public void testTuple4() {
        Tuple4<Integer, String, Boolean, List<Integer>> x = $(1, "A", true, Arrays.asList(2));
        assertThat(x._1(), is(1));
        assertThat(x._2(), is("A"));
        assertThat(x._3(), is(true));
        assertThat(x._4().get(0), is(2));

    }

}
