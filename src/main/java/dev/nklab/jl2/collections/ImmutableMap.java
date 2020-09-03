/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.nklab.jl2.collections;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Immutable Map.
 *
 * @author koduki
 * @param <K> the type of keys maintained by this map
 * @param <V> the type of mapped values
 */
public class ImmutableMap<K, V> implements Serializable {

    private HashMap<K, V> src = new HashMap<>();

    /**
     * Constructs an empty ImmutableMap.
     */
    public ImmutableMap() {
    }

    /**
     * Constructs by Map.
     *
     * @param src
     */
    public ImmutableMap(Map src) {
        this.src = new HashMap<>(src);
    }

    /**
     * Returns the value to which the specified key is mapped.
     *
     * @param key the key whose associated value is to be returned.
     * @return the value to which the specified key is mapped, or null if this
     * map contains no mapping for the key.
     */
    public V get(K key) {
        return this.src.get(key);
    }

    /**
     * Returns true if this map contains a mapping for the specified key.
     *
     * @param key key whose presence in this map is to be tested.
     * @return true if this map contains a mapping for the specified key.
     */
    public boolean containsKey(K key) {
        return this.src.containsKey(key);
    }

    /**
     * Returns size.
     *
     * @return collection size.
     */
    public int size() {
        return this.src.size();
    }

    /**
     * Returns a new instance which is added key/value pairs.
     *
     * @param key key with which the specified value is to be associated.
     * @param value value to be associated with the specified key.
     * @return a new instance which is added key/value pairs.
     */
    public ImmutableMap<K, V> put(K key, V value) {
        Map<K, V> tmp = toMap();
        tmp.put(key, value);
        return new ImmutableMap<>(tmp);
    }

    /**
     * Returns a new instance which is removed key/value pairs.
     *
     * @param key key with which the specified value is to be associated.
     * @return a new instance which is removed key/value pairs.
     */
    public ImmutableMap<K, V> remove(K key) {
        Map<K, V> tmp = toMap();
        tmp.remove(key);
        return new ImmutableMap<>(tmp);
    }

    /**
     * Returns java.lang.Map.
     *
     * @return java.lang.Map.
     */
    public Map<K, V> toMap() {
        return (Map<K, V>) src.clone();
    }

    @Override
    public String toString() {
        return this.src.toString();
    }

}
