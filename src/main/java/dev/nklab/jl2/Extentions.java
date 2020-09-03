/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.nklab.jl2;

import dev.nklab.jl2.collections.ImmutableMap;
import dev.nklab.jl2.collections.Tuples;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * This is Extentions for basic methods.
 *
 * @author koduki
 */
public class Extentions {

    /**
     * Type inference simulation for function.
     *
     * @param <T> bind type
     * @param <U> return type
     * @param value bind instance
     * @param function callback function
     * @return result of function
     */
    public static <T, U> U let(T value, Function<T, U> function) {
        return function.apply(value);
    }

    /**
     *
     * @param <T> bind type
     * @param value bind instance
     * @param consumer callback function
     */
    public static <T> void let(T value, Consumer<T> consumer) {
        consumer.accept(value);
    }

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
    public static <K, V> ImmutableMap<K, V> imap(Tuples.Tuple2<K, V>... elements) {
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
     * Return range list.
     *
     * @param startInclusive start number
     * @param endExclusive end number
     * @return a list of range
     */
    public static List<Integer> range(int startInclusive, int endExclusive) {
        List<Integer> xs = new ArrayList<>();
        for (int i = startInclusive; i <= endExclusive; i++) {
            xs.add(i);
        }
        return xs;
    }

    /**
     * Create Tuple2.
     *
     * @param <T1> Type 1 of this Tuple
     * @param <T2> Type 2 of this Tuple
     * @param _1 Element 1 of this Tuple
     * @param _2 Element 2 of this Tuple
     * @return Tuple(_1, _2)
     */
    public static <T1, T2> Tuples.Tuple2<T1, T2> $(T1 _1, T2 _2) {
        return new Tuples.Tuple2<>(_1, _2);
    }

    /**
     * Create Tuple3.
     *
     * @param <T1> Type 1 of this Tuple
     * @param <T2> Type 2 of this Tuple
     * @param <T3> Type 3 of this Tuple
     * @param _1 Element 1 of this Tuple
     * @param _2 Element 2 of this Tuple
     * @param _3 Element 3 of this Tuple
     * @return Tuple(_1, _2, _3)
     */
    public static <T1, T2, T3> Tuples.Tuple3<T1, T2, T3> $(T1 _1, T2 _2, T3 _3) {
        return new Tuples.Tuple3<>(_1, _2, _3);
    }

    /**
     * Create Tuple4.
     *
     * @param <T1> Type 1 of this Tuple
     * @param <T2> Type 2 of this Tuple
     * @param <T3> Type 3 of this Tuple
     * @param <T4> Type 4 of this Tuple
     * @param _1 Element 1 of this Tuple
     * @param _2 Element 2 of this Tuple
     * @param _3 Element 3 of this Tuple
     * @param _4 Element 4 of this Tuple
     * @return Tuple(_1, _2, _3, _4)
     */
    public static <T1, T2, T3, T4> Tuples.Tuple4<T1, T2, T3, T4> $(T1 _1, T2 _2, T3 _3, T4 _4) {
        return new Tuples.Tuple4<>(_1, _2, _3, _4);
    }

    /**
     * Create Tuple5.
     *
     * @param <T1> Type 1 of this Tuple
     * @param <T2> Type 2 of this Tuple
     * @param <T3> Type 3 of this Tuple
     * @param <T4> Type 4 of this Tuple
     * @param <T5> Type 5 of this Tuple
     * @param _1 Element 1 of this Tuple
     * @param _2 Element 2 of this Tuple
     * @param _3 Element 3 of this Tuple
     * @param _4 Element 4 of this Tuple
     * @param _5 Element 5 of this Tuple
     * @return Tuple(_1, _2, _3, _4, _5)
     */
    public static <T1, T2, T3, T4, T5> Tuples.Tuple5<T1, T2, T3, T4, T5> $(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5) {
        return new Tuples.Tuple5<>(_1, _2, _3, _4, _5);
    }

    /**
     * Create Tuple6.
     *
     * @param <T1> Type 1 of this Tuple
     * @param <T2> Type 2 of this Tuple
     * @param <T3> Type 3 of this Tuple
     * @param <T4> Type 4 of this Tuple
     * @param <T5> Type 5 of this Tuple
     * @param <T6> Type 6 of this Tuple
     * @param _1 Element 1 of this Tuple
     * @param _2 Element 2 of this Tuple
     * @param _3 Element 3 of this Tuple
     * @param _4 Element 4 of this Tuple
     * @param _5 Element 5 of this Tuple
     * @param _6 Element 6 of this Tuple
     * @return Tuple(_1, _2, _3, _4, _5, _6)
     */
    public static <T1, T2, T3, T4, T5, T6> Tuples.Tuple6<T1, T2, T3, T4, T5, T6> $(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6) {
        return new Tuples.Tuple6<>(_1, _2, _3, _4, _5, _6);
    }

    /**
     * Create Tuple7.
     *
     * @param <T1> Type 1 of this Tuple
     * @param <T2> Type 2 of this Tuple
     * @param <T3> Type 3 of this Tuple
     * @param <T4> Type 4 of this Tuple
     * @param <T5> Type 5 of this Tuple
     * @param <T6> Type 6 of this Tuple
     * @param <T7> Type 7 of this Tuple
     * @param _1 Element 1 of this Tuple
     * @param _2 Element 2 of this Tuple
     * @param _3 Element 3 of this Tuple
     * @param _4 Element 4 of this Tuple
     * @param _5 Element 5 of this Tuple
     * @param _6 Element 6 of this Tuple
     * @param _7 Element 7 of this Tuple
     * @return Tuple(_1, _2, _3, _4, _5, _6, _7)
     */
    public static <T1, T2, T3, T4, T5, T6, T7> Tuples.Tuple7<T1, T2, T3, T4, T5, T6, T7> $(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7) {
        return new Tuples.Tuple7<>(_1, _2, _3, _4, _5, _6, _7);
    }

    /**
     * Create Tuple8.
     *
     * @param <T1> Type 1 of this Tuple
     * @param <T2> Type 2 of this Tuple
     * @param <T3> Type 3 of this Tuple
     * @param <T4> Type 4 of this Tuple
     * @param <T5> Type 5 of this Tuple
     * @param <T6> Type 6 of this Tuple
     * @param <T7> Type 7 of this Tuple
     * @param <T8> Type 8 of this Tuple
     * @param _1 Element 1 of this Tuple
     * @param _2 Element 2 of this Tuple
     * @param _3 Element 3 of this Tuple
     * @param _4 Element 4 of this Tuple
     * @param _5 Element 5 of this Tuple
     * @param _6 Element 6 of this Tuple
     * @param _7 Element 7 of this Tuple
     * @param _8 Element 8 of this Tuple
     * @return Tuple(_1, _2, _3, _4, _5, _6, _7, _8)
     */
    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuples.Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> $(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8) {
        return new Tuples.Tuple8<>(_1, _2, _3, _4, _5, _6, _7, _8);
    }

    /**
     * Create Tuple9.
     *
     * @param <T1> Type 1 of this Tuple
     * @param <T2> Type 2 of this Tuple
     * @param <T3> Type 3 of this Tuple
     * @param <T4> Type 4 of this Tuple
     * @param <T5> Type 5 of this Tuple
     * @param <T6> Type 6 of this Tuple
     * @param <T7> Type 7 of this Tuple
     * @param <T8> Type 8 of this Tuple
     * @param <T9> Type 9 of this Tuple
     * @param _1 Element 1 of this Tuple
     * @param _2 Element 2 of this Tuple
     * @param _3 Element 3 of this Tuple
     * @param _4 Element 4 of this Tuple
     * @param _5 Element 5 of this Tuple
     * @param _6 Element 6 of this Tuple
     * @param _7 Element 7 of this Tuple
     * @param _8 Element 8 of this Tuple
     * @param _9 Element 9 of this Tuple
     * @return Tuple(_1, _2, _3, _4, _5, _6, _7, _8, _9)
     */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9> Tuples.Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9> $(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9) {
        return new Tuples.Tuple9<>(_1, _2, _3, _4, _5, _6, _7, _8, _9);
    }

    /**
     * Create Tuple10.
     *
     * @param <T1> Type 1 of this Tuple
     * @param <T2> Type 2 of this Tuple
     * @param <T3> Type 3 of this Tuple
     * @param <T4> Type 4 of this Tuple
     * @param <T5> Type 5 of this Tuple
     * @param <T6> Type 6 of this Tuple
     * @param <T7> Type 7 of this Tuple
     * @param <T8> Type 8 of this Tuple
     * @param <T9> Type 9 of this Tuple
     * @param <T10> Type 10 of this Tuple
     * @param _1 Element 1 of this Tuple
     * @param _2 Element 2 of this Tuple
     * @param _3 Element 3 of this Tuple
     * @param _4 Element 4 of this Tuple
     * @param _5 Element 5 of this Tuple
     * @param _6 Element 6 of this Tuple
     * @param _7 Element 7 of this Tuple
     * @param _8 Element 8 of this Tuple
     * @param _9 Element 9 of this Tuple
     * @param _10 Element 10 of this Tuple
     * @return Tuple(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10)
     */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> Tuples.Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> $(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10) {
        return new Tuples.Tuple10<>(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10);
    }

    /**
     * Create Tuple11.
     *
     * @param <T1> Type 1 of this Tuple
     * @param <T2> Type 2 of this Tuple
     * @param <T3> Type 3 of this Tuple
     * @param <T4> Type 4 of this Tuple
     * @param <T5> Type 5 of this Tuple
     * @param <T6> Type 6 of this Tuple
     * @param <T7> Type 7 of this Tuple
     * @param <T8> Type 8 of this Tuple
     * @param <T9> Type 9 of this Tuple
     * @param <T10> Type 10 of this Tuple
     * @param <T11> Type 11 of this Tuple
     * @param _1 Element 1 of this Tuple
     * @param _2 Element 2 of this Tuple
     * @param _3 Element 3 of this Tuple
     * @param _4 Element 4 of this Tuple
     * @param _5 Element 5 of this Tuple
     * @param _6 Element 6 of this Tuple
     * @param _7 Element 7 of this Tuple
     * @param _8 Element 8 of this Tuple
     * @param _9 Element 9 of this Tuple
     * @param _10 Element 10 of this Tuple
     * @param _11 Element 11 of this Tuple
     * @return Tuple(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11)
     */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> Tuples.Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> $(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10, T11 _11) {
        return new Tuples.Tuple11<>(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11);
    }

    /**
     * Create Tuple12.
     *
     * @param <T1> Type 1 of this Tuple
     * @param <T2> Type 2 of this Tuple
     * @param <T3> Type 3 of this Tuple
     * @param <T4> Type 4 of this Tuple
     * @param <T5> Type 5 of this Tuple
     * @param <T6> Type 6 of this Tuple
     * @param <T7> Type 7 of this Tuple
     * @param <T8> Type 8 of this Tuple
     * @param <T9> Type 9 of this Tuple
     * @param <T10> Type 10 of this Tuple
     * @param <T11> Type 11 of this Tuple
     * @param <T12> Type 12 of this Tuple
     * @param _1 Element 1 of this Tuple
     * @param _2 Element 2 of this Tuple
     * @param _3 Element 3 of this Tuple
     * @param _4 Element 4 of this Tuple
     * @param _5 Element 5 of this Tuple
     * @param _6 Element 6 of this Tuple
     * @param _7 Element 7 of this Tuple
     * @param _8 Element 8 of this Tuple
     * @param _9 Element 9 of this Tuple
     * @param _10 Element 10 of this Tuple
     * @param _11 Element 11 of this Tuple
     * @param _12 Element 12 of this Tuple
     * @return Tuple(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12)
     */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> Tuples.Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> $(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10, T11 _11, T12 _12) {
        return new Tuples.Tuple12<>(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12);
    }

    /**
     * Create Tuple13.
     *
     * @param <T1> Type 1 of this Tuple
     * @param <T2> Type 2 of this Tuple
     * @param <T3> Type 3 of this Tuple
     * @param <T4> Type 4 of this Tuple
     * @param <T5> Type 5 of this Tuple
     * @param <T6> Type 6 of this Tuple
     * @param <T7> Type 7 of this Tuple
     * @param <T8> Type 8 of this Tuple
     * @param <T9> Type 9 of this Tuple
     * @param <T10> Type 10 of this Tuple
     * @param <T11> Type 11 of this Tuple
     * @param <T12> Type 12 of this Tuple
     * @param <T13> Type 13 of this Tuple
     * @param _1 Element 1 of this Tuple
     * @param _2 Element 2 of this Tuple
     * @param _3 Element 3 of this Tuple
     * @param _4 Element 4 of this Tuple
     * @param _5 Element 5 of this Tuple
     * @param _6 Element 6 of this Tuple
     * @param _7 Element 7 of this Tuple
     * @param _8 Element 8 of this Tuple
     * @param _9 Element 9 of this Tuple
     * @param _10 Element 10 of this Tuple
     * @param _11 Element 11 of this Tuple
     * @param _12 Element 12 of this Tuple
     * @param _13 Element 13 of this Tuple
     * @return Tuple(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13)
     */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> Tuples.Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> $(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10, T11 _11, T12 _12, T13 _13) {
        return new Tuples.Tuple13<>(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13);
    }

    /**
     * Create Tuple14.
     *
     * @param <T1> Type 1 of this Tuple
     * @param <T2> Type 2 of this Tuple
     * @param <T3> Type 3 of this Tuple
     * @param <T4> Type 4 of this Tuple
     * @param <T5> Type 5 of this Tuple
     * @param <T6> Type 6 of this Tuple
     * @param <T7> Type 7 of this Tuple
     * @param <T8> Type 8 of this Tuple
     * @param <T9> Type 9 of this Tuple
     * @param <T10> Type 10 of this Tuple
     * @param <T11> Type 11 of this Tuple
     * @param <T12> Type 12 of this Tuple
     * @param <T13> Type 13 of this Tuple
     * @param <T14> Type 14 of this Tuple
     * @param _1 Element 1 of this Tuple
     * @param _2 Element 2 of this Tuple
     * @param _3 Element 3 of this Tuple
     * @param _4 Element 4 of this Tuple
     * @param _5 Element 5 of this Tuple
     * @param _6 Element 6 of this Tuple
     * @param _7 Element 7 of this Tuple
     * @param _8 Element 8 of this Tuple
     * @param _9 Element 9 of this Tuple
     * @param _10 Element 10 of this Tuple
     * @param _11 Element 11 of this Tuple
     * @param _12 Element 12 of this Tuple
     * @param _13 Element 13 of this Tuple
     * @param _14 Element 14 of this Tuple
     * @return Tuple(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13,
     * _14)
     */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> Tuples.Tuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> $(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10, T11 _11, T12 _12, T13 _13, T14 _14) {
        return new Tuples.Tuple14<>(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14);
    }

    /**
     * Create Tuple15.
     *
     * @param <T1> Type 1 of this Tuple
     * @param <T2> Type 2 of this Tuple
     * @param <T3> Type 3 of this Tuple
     * @param <T4> Type 4 of this Tuple
     * @param <T5> Type 5 of this Tuple
     * @param <T6> Type 6 of this Tuple
     * @param <T7> Type 7 of this Tuple
     * @param <T8> Type 8 of this Tuple
     * @param <T9> Type 9 of this Tuple
     * @param <T10> Type 10 of this Tuple
     * @param <T11> Type 11 of this Tuple
     * @param <T12> Type 12 of this Tuple
     * @param <T13> Type 13 of this Tuple
     * @param <T14> Type 14 of this Tuple
     * @param <T15> Type 15 of this Tuple
     * @param _1 Element 1 of this Tuple
     * @param _2 Element 2 of this Tuple
     * @param _3 Element 3 of this Tuple
     * @param _4 Element 4 of this Tuple
     * @param _5 Element 5 of this Tuple
     * @param _6 Element 6 of this Tuple
     * @param _7 Element 7 of this Tuple
     * @param _8 Element 8 of this Tuple
     * @param _9 Element 9 of this Tuple
     * @param _10 Element 10 of this Tuple
     * @param _11 Element 11 of this Tuple
     * @param _12 Element 12 of this Tuple
     * @param _13 Element 13 of this Tuple
     * @param _14 Element 14 of this Tuple
     * @param _15 Element 15 of this Tuple
     * @return Tuple(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13,
     * _14, _15)
     */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> Tuples.Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> $(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10, T11 _11, T12 _12, T13 _13, T14 _14, T15 _15) {
        return new Tuples.Tuple15<>(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15);
    }

    /**
     * Create Tuple16.
     *
     * @param <T1> Type 1 of this Tuple
     * @param <T2> Type 2 of this Tuple
     * @param <T3> Type 3 of this Tuple
     * @param <T4> Type 4 of this Tuple
     * @param <T5> Type 5 of this Tuple
     * @param <T6> Type 6 of this Tuple
     * @param <T7> Type 7 of this Tuple
     * @param <T8> Type 8 of this Tuple
     * @param <T9> Type 9 of this Tuple
     * @param <T10> Type 10 of this Tuple
     * @param <T11> Type 11 of this Tuple
     * @param <T12> Type 12 of this Tuple
     * @param <T13> Type 13 of this Tuple
     * @param <T14> Type 14 of this Tuple
     * @param <T15> Type 15 of this Tuple
     * @param <T16> Type 16 of this Tuple
     * @param _1 Element 1 of this Tuple
     * @param _2 Element 2 of this Tuple
     * @param _3 Element 3 of this Tuple
     * @param _4 Element 4 of this Tuple
     * @param _5 Element 5 of this Tuple
     * @param _6 Element 6 of this Tuple
     * @param _7 Element 7 of this Tuple
     * @param _8 Element 8 of this Tuple
     * @param _9 Element 9 of this Tuple
     * @param _10 Element 10 of this Tuple
     * @param _11 Element 11 of this Tuple
     * @param _12 Element 12 of this Tuple
     * @param _13 Element 13 of this Tuple
     * @param _14 Element 14 of this Tuple
     * @param _15 Element 15 of this Tuple
     * @param _16 Element 16 of this Tuple
     * @return Tuple(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13,
     * _14, _15, _16)
     */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> Tuples.Tuple16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> $(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10, T11 _11, T12 _12, T13 _13, T14 _14, T15 _15, T16 _16) {
        return new Tuples.Tuple16<>(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16);
    }

    /**
     * Create Tuple17.
     *
     * @param <T1> Type 1 of this Tuple
     * @param <T2> Type 2 of this Tuple
     * @param <T3> Type 3 of this Tuple
     * @param <T4> Type 4 of this Tuple
     * @param <T5> Type 5 of this Tuple
     * @param <T6> Type 6 of this Tuple
     * @param <T7> Type 7 of this Tuple
     * @param <T8> Type 8 of this Tuple
     * @param <T9> Type 9 of this Tuple
     * @param <T10> Type 10 of this Tuple
     * @param <T11> Type 11 of this Tuple
     * @param <T12> Type 12 of this Tuple
     * @param <T13> Type 13 of this Tuple
     * @param <T14> Type 14 of this Tuple
     * @param <T15> Type 15 of this Tuple
     * @param <T16> Type 16 of this Tuple
     * @param <T17> Type 17 of this Tuple
     * @param _1 Element 1 of this Tuple
     * @param _2 Element 2 of this Tuple
     * @param _3 Element 3 of this Tuple
     * @param _4 Element 4 of this Tuple
     * @param _5 Element 5 of this Tuple
     * @param _6 Element 6 of this Tuple
     * @param _7 Element 7 of this Tuple
     * @param _8 Element 8 of this Tuple
     * @param _9 Element 9 of this Tuple
     * @param _10 Element 10 of this Tuple
     * @param _11 Element 11 of this Tuple
     * @param _12 Element 12 of this Tuple
     * @param _13 Element 13 of this Tuple
     * @param _14 Element 14 of this Tuple
     * @param _15 Element 15 of this Tuple
     * @param _16 Element 16 of this Tuple
     * @param _17 Element 17 of this Tuple
     * @return Tuple(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13,
     * _14, _15, _16, _17)
     */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> Tuples.Tuple17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> $(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10, T11 _11, T12 _12, T13 _13, T14 _14, T15 _15, T16 _16, T17 _17) {
        return new Tuples.Tuple17<>(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17);
    }

    /**
     * Create Tuple18.
     *
     * @param <T1> Type 1 of this Tuple
     * @param <T2> Type 2 of this Tuple
     * @param <T3> Type 3 of this Tuple
     * @param <T4> Type 4 of this Tuple
     * @param <T5> Type 5 of this Tuple
     * @param <T6> Type 6 of this Tuple
     * @param <T7> Type 7 of this Tuple
     * @param <T8> Type 8 of this Tuple
     * @param <T9> Type 9 of this Tuple
     * @param <T10> Type 10 of this Tuple
     * @param <T11> Type 11 of this Tuple
     * @param <T12> Type 12 of this Tuple
     * @param <T13> Type 13 of this Tuple
     * @param <T14> Type 14 of this Tuple
     * @param <T15> Type 15 of this Tuple
     * @param <T16> Type 16 of this Tuple
     * @param <T17> Type 17 of this Tuple
     * @param <T18> Type 18 of this Tuple
     * @param _1 Element 1 of this Tuple
     * @param _2 Element 2 of this Tuple
     * @param _3 Element 3 of this Tuple
     * @param _4 Element 4 of this Tuple
     * @param _5 Element 5 of this Tuple
     * @param _6 Element 6 of this Tuple
     * @param _7 Element 7 of this Tuple
     * @param _8 Element 8 of this Tuple
     * @param _9 Element 9 of this Tuple
     * @param _10 Element 10 of this Tuple
     * @param _11 Element 11 of this Tuple
     * @param _12 Element 12 of this Tuple
     * @param _13 Element 13 of this Tuple
     * @param _14 Element 14 of this Tuple
     * @param _15 Element 15 of this Tuple
     * @param _16 Element 16 of this Tuple
     * @param _17 Element 17 of this Tuple
     * @param _18 Element 18 of this Tuple
     * @return Tuple(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13,
     * _14, _15, _16, _17, _18)
     */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> Tuples.Tuple18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> $(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10, T11 _11, T12 _12, T13 _13, T14 _14, T15 _15, T16 _16, T17 _17, T18 _18) {
        return new Tuples.Tuple18<>(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18);
    }

    /**
     * Create Tuple19.
     *
     * @param <T1> Type 1 of this Tuple
     * @param <T2> Type 2 of this Tuple
     * @param <T3> Type 3 of this Tuple
     * @param <T4> Type 4 of this Tuple
     * @param <T5> Type 5 of this Tuple
     * @param <T6> Type 6 of this Tuple
     * @param <T7> Type 7 of this Tuple
     * @param <T8> Type 8 of this Tuple
     * @param <T9> Type 9 of this Tuple
     * @param <T10> Type 10 of this Tuple
     * @param <T11> Type 11 of this Tuple
     * @param <T12> Type 12 of this Tuple
     * @param <T13> Type 13 of this Tuple
     * @param <T14> Type 14 of this Tuple
     * @param <T15> Type 15 of this Tuple
     * @param <T16> Type 16 of this Tuple
     * @param <T17> Type 17 of this Tuple
     * @param <T18> Type 18 of this Tuple
     * @param <T19> Type 19 of this Tuple
     * @param _1 Element 1 of this Tuple
     * @param _2 Element 2 of this Tuple
     * @param _3 Element 3 of this Tuple
     * @param _4 Element 4 of this Tuple
     * @param _5 Element 5 of this Tuple
     * @param _6 Element 6 of this Tuple
     * @param _7 Element 7 of this Tuple
     * @param _8 Element 8 of this Tuple
     * @param _9 Element 9 of this Tuple
     * @param _10 Element 10 of this Tuple
     * @param _11 Element 11 of this Tuple
     * @param _12 Element 12 of this Tuple
     * @param _13 Element 13 of this Tuple
     * @param _14 Element 14 of this Tuple
     * @param _15 Element 15 of this Tuple
     * @param _16 Element 16 of this Tuple
     * @param _17 Element 17 of this Tuple
     * @param _18 Element 18 of this Tuple
     * @param _19 Element 19 of this Tuple
     * @return Tuple(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13,
     * _14, _15, _16, _17, _18, _19)
     */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> Tuples.Tuple19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> $(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10, T11 _11, T12 _12, T13 _13, T14 _14, T15 _15, T16 _16, T17 _17, T18 _18, T19 _19) {
        return new Tuples.Tuple19<>(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19);
    }

    /**
     * Create Tuple20.
     *
     * @param <T1> Type 1 of this Tuple
     * @param <T2> Type 2 of this Tuple
     * @param <T3> Type 3 of this Tuple
     * @param <T4> Type 4 of this Tuple
     * @param <T5> Type 5 of this Tuple
     * @param <T6> Type 6 of this Tuple
     * @param <T7> Type 7 of this Tuple
     * @param <T8> Type 8 of this Tuple
     * @param <T9> Type 9 of this Tuple
     * @param <T10> Type 10 of this Tuple
     * @param <T11> Type 11 of this Tuple
     * @param <T12> Type 12 of this Tuple
     * @param <T13> Type 13 of this Tuple
     * @param <T14> Type 14 of this Tuple
     * @param <T15> Type 15 of this Tuple
     * @param <T16> Type 16 of this Tuple
     * @param <T17> Type 17 of this Tuple
     * @param <T18> Type 18 of this Tuple
     * @param <T19> Type 19 of this Tuple
     * @param <T20> Type 20 of this Tuple
     * @param _1 Element 1 of this Tuple
     * @param _2 Element 2 of this Tuple
     * @param _3 Element 3 of this Tuple
     * @param _4 Element 4 of this Tuple
     * @param _5 Element 5 of this Tuple
     * @param _6 Element 6 of this Tuple
     * @param _7 Element 7 of this Tuple
     * @param _8 Element 8 of this Tuple
     * @param _9 Element 9 of this Tuple
     * @param _10 Element 10 of this Tuple
     * @param _11 Element 11 of this Tuple
     * @param _12 Element 12 of this Tuple
     * @param _13 Element 13 of this Tuple
     * @param _14 Element 14 of this Tuple
     * @param _15 Element 15 of this Tuple
     * @param _16 Element 16 of this Tuple
     * @param _17 Element 17 of this Tuple
     * @param _18 Element 18 of this Tuple
     * @param _19 Element 19 of this Tuple
     * @param _20 Element 20 of this Tuple
     * @return Tuple(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13,
     * _14, _15, _16, _17, _18, _19, _20)
     */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> Tuples.Tuple20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> $(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10, T11 _11, T12 _12, T13 _13, T14 _14, T15 _15, T16 _16, T17 _17, T18 _18, T19 _19, T20 _20) {
        return new Tuples.Tuple20<>(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20);
    }

    /**
     * Create Tuple21.
     *
     * @param <T1> Type 1 of this Tuple
     * @param <T2> Type 2 of this Tuple
     * @param <T3> Type 3 of this Tuple
     * @param <T4> Type 4 of this Tuple
     * @param <T5> Type 5 of this Tuple
     * @param <T6> Type 6 of this Tuple
     * @param <T7> Type 7 of this Tuple
     * @param <T8> Type 8 of this Tuple
     * @param <T9> Type 9 of this Tuple
     * @param <T10> Type 10 of this Tuple
     * @param <T11> Type 11 of this Tuple
     * @param <T12> Type 12 of this Tuple
     * @param <T13> Type 13 of this Tuple
     * @param <T14> Type 14 of this Tuple
     * @param <T15> Type 15 of this Tuple
     * @param <T16> Type 16 of this Tuple
     * @param <T17> Type 17 of this Tuple
     * @param <T18> Type 18 of this Tuple
     * @param <T19> Type 19 of this Tuple
     * @param <T20> Type 20 of this Tuple
     * @param <T21> Type 21 of this Tuple
     * @param _1 Element 1 of this Tuple
     * @param _2 Element 2 of this Tuple
     * @param _3 Element 3 of this Tuple
     * @param _4 Element 4 of this Tuple
     * @param _5 Element 5 of this Tuple
     * @param _6 Element 6 of this Tuple
     * @param _7 Element 7 of this Tuple
     * @param _8 Element 8 of this Tuple
     * @param _9 Element 9 of this Tuple
     * @param _10 Element 10 of this Tuple
     * @param _11 Element 11 of this Tuple
     * @param _12 Element 12 of this Tuple
     * @param _13 Element 13 of this Tuple
     * @param _14 Element 14 of this Tuple
     * @param _15 Element 15 of this Tuple
     * @param _16 Element 16 of this Tuple
     * @param _17 Element 17 of this Tuple
     * @param _18 Element 18 of this Tuple
     * @param _19 Element 19 of this Tuple
     * @param _20 Element 20 of this Tuple
     * @param _21 Element 21 of this Tuple
     * @return Tuple(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13,
     * _14, _15, _16, _17, _18, _19, _20, _21)
     */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> Tuples.Tuple21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> $(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10, T11 _11, T12 _12, T13 _13, T14 _14, T15 _15, T16 _16, T17 _17, T18 _18, T19 _19, T20 _20, T21 _21) {
        return new Tuples.Tuple21<>(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20, _21);
    }

}
