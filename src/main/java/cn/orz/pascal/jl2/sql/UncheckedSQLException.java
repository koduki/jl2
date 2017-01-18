/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.orz.pascal.jl2.sql;

import java.sql.SQLException;

/**
 *
 * @author koduki
 */
public class UncheckedSQLException extends RuntimeException {

    public UncheckedSQLException() {
    }

    public UncheckedSQLException(String message) {
        super(message);
    }

    public UncheckedSQLException(SQLException cause) {
        super(cause);
    }

    public UncheckedSQLException(String message, SQLException cause) {
        super(message, cause);
    }

}
