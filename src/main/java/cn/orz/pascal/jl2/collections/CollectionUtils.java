/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.orz.pascal.jl2.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Collection utilities.
 *
 * @author koduki
 */
public interface CollectionUtils {

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
