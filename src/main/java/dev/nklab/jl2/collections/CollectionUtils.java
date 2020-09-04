/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.nklab.jl2.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * Collection utilities.
 *
 * @author koduki
 */
public interface CollectionUtils {

    /**
     * Transform iterator to stream.
     *
     * @param <T> the class of the objects in the set
     * @param interator original iterator
     * @return stream which is wrapped original iterator.
     */
    public static <T> Stream<T> toStream(Iterator<T> interator) {
        var spliterator = Spliterators.spliteratorUnknownSize(interator, 0);
        return StreamSupport.stream(spliterator, false);
    }

    /**
     * Transform iterator to stream.
     *
     * @param <T> the class of the objects in the set
     * @param iterable original iterator
     * @return stream which is wrapped original iterator.
     */
    public static <T> Stream<T> toStream(Iterable<T> iterable) {
        return StreamSupport.stream(iterable.spliterator(), false);
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
        Set<T> xs = new HashSet<T>();
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

    /**
     * Concat two sets as new map object.
     *
     * @param <T> the class of the objects in the list
     * @param xs1 first map
     * @param xs2 second map
     * @return new set contains all of the element of map1 and map2.
     */
    public static <K, V> Map<K, V> concat(Map<K, V> xs1, Map<K, V> xs2) {
        var xs = new HashMap<K, V>();
        xs.putAll(xs1);
        xs.putAll(xs2);

        return xs;
    }
}
