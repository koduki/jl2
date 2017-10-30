/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.orz.pascal.jl2.collections;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static cn.orz.pascal.jl2.collections.CollectionUtils.*;
import static cn.orz.pascal.jl2.Extentions.*;
import org.junit.Test;
import java.util.Set;

/**
 * CollectionUtils Test.
 *
 * @author koduki
 */
public class CollectionUtilsTest {

    public CollectionUtilsTest() {
    }

    @Test
    public void testConcatSet1() {
        Set<String> set1 = set("a", "b");
        Set<String> set2 = set("c", "d");
        Set<String> result = concat(set1, set2);

        assertThat(set1.size(), is(2));
        assertThat(set2.size(), is(2));

        assertThat(result.size(), is(4));
        assertTrue(result.contains("a"));
        assertTrue(result.contains("b"));
        assertTrue(result.contains("c"));
        assertTrue(result.contains("d"));
    }

    @Test
    public void testConcatSet2() {
        Set<Integer> set1 = set(1, 2);
        Set<Integer> set2 = set(3);
        Set<Integer> result = concat(set1, set2);

        assertThat(set1.size(), is(2));
        assertThat(set2.size(), is(1));

        assertThat(result.size(), is(3));
        assertTrue(result.contains(1));
        assertTrue(result.contains(2));
        assertTrue(result.contains(3));
    }

    @Test
    public void testConcatSetWithEmpty() {
        Set<Integer> result = concat(set(), set());
        assertTrue(result.isEmpty());
    }

    @Test
    public void testRange() {
        assertEquals(list(1, 2, 3), range(1, 3));
    }
}
