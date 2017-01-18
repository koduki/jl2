/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.orz.pascal.jl2.sql;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author koduki
 */
   public  class UncheckedResultSet {

        private final ResultSet rs;

        public UncheckedResultSet(ResultSet rs) {
            this.rs = rs;
        }

        public void close() {
            try {
                this.rs.close();
            } catch (SQLException ex) {
                throw new UncheckedSQLException(ex);
            }
        }

        public String getString(int columnIndex) {
            try {
                return this.rs.getString(columnIndex);
            } catch (SQLException ex) {
                throw new UncheckedSQLException(ex);
            }
        }

        public String getString(String columnLabel) {
            try {
                return this.rs.getString(columnLabel);
            } catch (SQLException ex) {
                throw new UncheckedSQLException(ex);
            }
        }

    }