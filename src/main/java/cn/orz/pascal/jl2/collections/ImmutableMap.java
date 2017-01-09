/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.orz.pascal.jl2.collections;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Immutable Map.
 *
 * @author koduki
 */
public class ImmutableMap<K, V> implements Serializable {

    private HashMap<K, V> src = new HashMap<>();

    public ImmutableMap() {
    }

    public ImmutableMap(Map src) {
        this.src = new HashMap<>(src);
    }

    public V get(K key) {
        return this.src.get(key);
    }

    public boolean containsKey(K key) {
        return this.src.containsKey(key);
    }

    public int size() {
        return this.src.size();
    }

    public ImmutableMap<K, V> put(K key, V value) {
        Map<K, V> tmp = toMap();
        tmp.put(key, value);
        return new ImmutableMap<>(tmp);
    }

    public ImmutableMap<K, V> remove(K key) {
        Map<K, V> tmp = toMap();
        tmp.remove(key);
        return new ImmutableMap<>(tmp);
    }

    public Map<K, V> toMap() {
        return (Map<K, V>) src.clone();
    }

    @Override
    public String toString() {
        return this.src.toString();
    }

}
