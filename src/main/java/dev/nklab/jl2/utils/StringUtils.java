/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.nklab.jl2.utils;

import static dev.nklab.jl2.collections.Tuples.*;
import static java.util.Comparator.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * String Utilities
 *
 * @author koduki
 */
public class StringUtils {

    /**
     * Returns a new {@code String} composed of copies of joined elemetns.
     *
     * @param delimiter a sequence of characters that is used to separate each
     * elements.
     * @param elements that will have its joined together.
     * @return joined new String.
     */
    public static String join(CharSequence delimiter, Tuple elements) {
        List<String> cols = Arrays.asList(elements.getClass().getMethods())
                .stream()
                .filter(m -> m.getName().startsWith("_"))
                .sorted(comparing(Method::getName))
                .map(m -> {
                    try {
                        return m.invoke(elements);
                    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(x -> {
                    if (x instanceof String) {
                        return (String) x;
                    } else {
                        return String.valueOf(x);
                    }
                }).collect(Collectors.toList());

        return String.join(delimiter, cols);
    }
}
