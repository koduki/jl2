/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.orz.pascal.jl2.sql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * Stream API Wrapper for JDBC.
 *
 * @author koduki
 */
public class QueryStream {

    /**
     * Iterator for ResultSet.
     */
    public static class ResultSetIterator implements Iterable<UncheckedResultSet>, Iterator<UncheckedResultSet> {

        private final ResultSet rs;
        private boolean hasNext = false;
        private boolean isNotNext = true;

        public ResultSetIterator(ResultSet rs) {
            this.rs = rs;
        }

        @Override
        public Iterator<UncheckedResultSet> iterator() {
            return this;
        }

        @Override
        public boolean hasNext() {
            try {
                if (isNotNext) {
                    hasNext = rs.next();
                    isNotNext = false;
                }
                if (!hasNext) {
                    rs.close();
                }
            } catch (SQLException ex) {
                throw new UncheckedSQLException(ex);
            }
            return hasNext;
        }

        @Override
        public UncheckedResultSet next() {
            hasNext();
            isNotNext = true;
            return new UncheckedResultSet(rs);
        }

    }

    /**
     * Returns Stream with wrapping ResultSet. This iterator doesn't support
     * parallel stream.
     *
     * @param resultset A data source.
     * @return Wrapped ResultSet
     * @throws SQLException
     */
    public static Stream<UncheckedResultSet> of(ResultSet resultset) throws SQLException {
        ResultSetIterator iterator = new ResultSetIterator(resultset);
        return StreamSupport.stream(iterator.spliterator(), false);
    }
}
