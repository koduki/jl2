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
 *
 * @author koduki
 */
public class QueryStream {

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

    public static Stream<UncheckedResultSet> of(ResultSet rs) throws SQLException {
        ResultSetIterator iterator = new ResultSetIterator(rs);
        return StreamSupport.stream(iterator.spliterator(), false);
    }
}
