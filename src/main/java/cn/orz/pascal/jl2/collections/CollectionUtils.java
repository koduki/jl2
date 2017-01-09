/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.orz.pascal.jl2.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Collection utilities.
 *
 * @author koduki
 */
public class CollectionUtils {

    /**
     * Return Map.
     *
     * @param <K> Key type of this Map
     * @param <V> Value type of this Map
     * @param elements Elements pair of this Map
     * @return Map
     */
    public static <K, V> java.util.Map<K, V> map(Tuples.Tuple2<K, V>... elements) {
        java.util.Map<K, V> map = new HashMap<>(elements.length);
        for (Tuples.Tuple2<K, V> x : elements) {
            map.put(x._1(), x._2());
        }
        return map;
    }

    /**
     * Return ImmutableMap.
     *
     * @param <K> Key type of this Map
     * @param <V> Value type of this Map
     * @param elements Elements pair of this Map
     * @return ImmutableMap
     */
    public static <K, V> ImmutableMap<K, V> mapi(Tuples.Tuple2<K, V>... elements) {
        return new ImmutableMap<>(map(elements));
    }

    /**
     * Return fixed size set.
     *
     * @param <T> the class of the objects in the array
     * @param elements the array by which the set will be backed
     * @return a set view of the specified array
     */
    public static <T> Set<T> set(T... elements) {
        return new HashSet<>(Arrays.asList(elements));
    }

    /**
     * Return fixed size list.
     *
     * @param <T> the class of the objects in the array
     * @param elements the array by which the list will be backed
     * @return a list view of the specified array
     */
    public static <T> List<T> list(T... elements) {
        return Arrays.asList(elements);
    }

    /**
     * Concat two sets as new set object.
     *
     * @param <T> the class of the objects in the set
     * @param xs1 first set
     * @param xs2 second set
     * @return new set contains all of the element of set1 and set2.
     */
    public static <T> Set<T> concat(Set<T> xs1, Set<T> xs2) {
        Set<T> xs = new HashSet<>();
        xs.addAll(xs1);
        xs.addAll(xs2);

        return xs;
    }

    /**
     * Concat two sets as new list object.
     *
     * @param <T> the class of the objects in the list
     * @param xs1 first list
     * @param xs2 second list
     * @return new set contains all of the element of list1 and list2.
     */
    public static <T> List<T> concat(List<T> xs1, List<T> xs2) {
        List<T> xs = new ArrayList<>();
        xs.addAll(xs1);
        xs.addAll(xs2);

        return xs;
    }
}
