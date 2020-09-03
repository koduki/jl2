/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.nklab.jl2.collections;

import static dev.nklab.jl2.Extentions.$;
import static dev.nklab.jl2.Extentions.let;
import java.util.ArrayList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/**
 *
 * @author koduki
 */
public class LetTest {

    public LetTest() {
    }

    @Test
    public void testConsumer() {
        let($(1, $("A", "B")), x -> {
            assertThat(x._1(), is(1));
            assertThat(x._2()._1(), is("A"));
            assertThat(x._2()._2(), is("B"));
        });
    }

    @Test
    public void testFunction() {
        int size = let(new ArrayList<String>(), xs -> {
            return xs.size();
        });
        assertThat(size, is(0));
    }
}
