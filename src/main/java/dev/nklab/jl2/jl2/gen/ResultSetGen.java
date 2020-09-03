/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.nklab.jl2.jl2.gen;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This is a code generator. So it is not production code.
 *
 * @author koduki
 */
class ResultSetGen {

    public static void main(String[] args) {
        List<String> cols = Arrays.asList(
                "String,getString",
                "boolean,getBoolean",
                "byte,getByte",
                "short,getShort",
                "int,getInt",
                "long,getLong",
                "float,getFloat",
                "double,getDouble",
                "BigDecimal,getBigDecimal",
                "byte[],getBytes",
                "Date,getDate",
                "Time,getTime",
                "Timestamp,getTimestamp",
                "InputStream,getAsciiStream",
                "InputStream,getUnicodeStream",
                "InputStream,getBinaryStream",
                "Object,getObject",
                "Blob,getBlob",
                "Clob,getClob",
                "Array,getArray"
        );
        List<String> other = Arrays.asList(
                "int,getRow",
                "int,getType",
                "ResultSetMetaData,getMetaData"
        );
        String src1 = String.join("\n", cols.stream().map(x -> x.split(",")).map(xs -> {
            String get1 = "public %s %s (int columnIndex) {        try {            return this.rs.%s(columnIndex);        } catch (SQLException ex) {            throw new UncheckedSQLException(ex);        }}";
            String get2 = "public %s %s (String columnLabel) {        try {            return this.rs.%s(columnLabel);        } catch (SQLException ex) {            throw new UncheckedSQLException(ex);        }}";
            return String.format(get1, xs[0], xs[1], xs[1]) + "\n" + String.format(get2, xs[0], xs[1], xs[1]);
        }).collect(Collectors.toList()));

        String src2 = String.join("\n", other.stream().map(x -> x.split(",")).map(xs -> {
            String get1 = "public %s %s () {        try {            return this.rs.%s();        } catch (SQLException ex) {            throw new UncheckedSQLException(ex);        }}";
            return String.format(get1, xs[0], xs[1], xs[1]);
        }).collect(Collectors.toList()));

        System.out.println(src2 + "\n" + src1);
    }
}
