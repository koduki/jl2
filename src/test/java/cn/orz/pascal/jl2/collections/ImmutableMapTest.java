/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.orz.pascal.jl2.collections;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static cn.orz.pascal.jl2.collections.CollectionUtils.*;
import static cn.orz.pascal.jl2.collections.Tuples.*;
import org.junit.Test;

/**
 * ImmutableMap Test.
 *
 * @author koduki
 */
public class ImmutableMapTest {

    public ImmutableMapTest() {
    }

    @Test
    public void testPutWithNewKey() {
        ImmutableMap<String, String> map1 = mapi($("k1", "v1"), $("k2", "v2"));
        ImmutableMap<String, String> result = map1.put("k3", "v3");

        assertThat(map1.size(), is(2));
        assertThat(map1.containsKey("k3"), is(false));

        assertThat(result.size(), is(3));
        assertThat(result.get("k3"), is("v3"));
    }

    @Test
    public void testPutWithExistKey() {
        ImmutableMap<String, String> map1 = mapi($("k1", "v1"), $("k2", "v2"));
        ImmutableMap<String, String> result = map1.put("k2", "new");

        assertThat(map1.size(), is(2));
        assertThat(map1.get("k2"), is("v2"));

        assertThat(result.size(), is(2));
        assertThat(result.get("k2"), is("new"));
    }

    @Test
    public void testRemove() {
        ImmutableMap<String, String> map1 = mapi($("k1", "v1"), $("k2", "v2"));
        ImmutableMap<String, String> result = map1.remove("k2");

        assertThat(map1.size(), is(2));
        assertThat(map1.get("k2"), is("v2"));

        assertThat(result.size(), is(1));
        assertThat(result.containsKey("k2"), is(false));
    }
}
