/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.nklab.jl2.utils;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

/**
 * File utilities.
 *
 * @author koduki
 */
public class FileUtils {

    /**
     * Read all lines from a file as a {@code Stream}.
     *
     * @param path the path to the file
     * @param cs the charset to use for decoding
     * @return the lines from the file as a {@code Stream}
     */
    public static Stream<String> lines(Path path, Charset cs) {
        try {
            return Files.lines(path, cs);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    /**
     * Read all lines from a file as a {@code Stream}.
     *
     * @param path the path to the file
     * @return the lines from the file as a {@code Stream}
     */
    public static Stream<String> lines(Path path) {
        return FileUtils.lines(path, Charset.defaultCharset());
    }

    /**
     * Return directory chidren.
     *
     * @param dir dir path
     * @return stream of directory children.
     */
    public static Stream<Path> list(Path dir) {
        try {
            return Files.list(dir);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }
}
