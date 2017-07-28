/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.orz.pascal.jl2.sql;

import java.io.Closeable;
import java.io.InputStream;
import java.math.BigDecimal;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Result Set wrapper for lambda.
 *
 * This class throws UncheckedSQLException instead of SQLException.
 *
 * @author koduki
 */
public class UncheckedResultSet implements Closeable {

    private final ResultSet rs;

    /**
     * Constructs an wrapped ResultSet.
     *
     * @param resultset a data source.
     */
    public UncheckedResultSet(ResultSet resultset) {
        this.rs = resultset;
    }

    @Override
    public void close() {
        try {
            this.rs.close();
        } catch (SQLException ex) {
            throw new UncheckedSQLException(ex);
        }
    }

    public ResultSet getResultSet() {
        return this.rs;
    }

    public int getRow() {
        try {
            return this.rs.getRow();
        } catch (SQLException ex) {
            throw new UncheckedSQLException(ex);
        }
    }

    public int getType() {
        try {
            return this.rs.getType();
        } catch (SQLException ex) {
            throw new UncheckedSQLException(ex);
        }
    }

    public ResultSetMetaData getMetaData() {
        try {
            return this.rs.getMetaData();
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

    public boolean getBoolean(int columnIndex) {
        try {
            return this.rs.getBoolean(columnIndex);
        } catch (SQLException ex) {
            throw new UncheckedSQLException(ex);
        }
    }

    public boolean getBoolean(String columnLabel) {
        try {
            return this.rs.getBoolean(columnLabel);
        } catch (SQLException ex) {
            throw new UncheckedSQLException(ex);
        }
    }

    public byte getByte(int columnIndex) {
        try {
            return this.rs.getByte(columnIndex);
        } catch (SQLException ex) {
            throw new UncheckedSQLException(ex);
        }
    }

    public byte getByte(String columnLabel) {
        try {
            return this.rs.getByte(columnLabel);
        } catch (SQLException ex) {
            throw new UncheckedSQLException(ex);
        }
    }

    public short getShort(int columnIndex) {
        try {
            return this.rs.getShort(columnIndex);
        } catch (SQLException ex) {
            throw new UncheckedSQLException(ex);
        }
    }

    public short getShort(String columnLabel) {
        try {
            return this.rs.getShort(columnLabel);
        } catch (SQLException ex) {
            throw new UncheckedSQLException(ex);
        }
    }

    public int getInt(int columnIndex) {
        try {
            return this.rs.getInt(columnIndex);
        } catch (SQLException ex) {
            throw new UncheckedSQLException(ex);
        }
    }

    public int getInt(String columnLabel) {
        try {
            return this.rs.getInt(columnLabel);
        } catch (SQLException ex) {
            throw new UncheckedSQLException(ex);
        }
    }

    public long getLong(int columnIndex) {
        try {
            return this.rs.getLong(columnIndex);
        } catch (SQLException ex) {
            throw new UncheckedSQLException(ex);
        }
    }

    public long getLong(String columnLabel) {
        try {
            return this.rs.getLong(columnLabel);
        } catch (SQLException ex) {
            throw new UncheckedSQLException(ex);
        }
    }

    public float getFloat(int columnIndex) {
        try {
            return this.rs.getFloat(columnIndex);
        } catch (SQLException ex) {
            throw new UncheckedSQLException(ex);
        }
    }

    public float getFloat(String columnLabel) {
        try {
            return this.rs.getFloat(columnLabel);
        } catch (SQLException ex) {
            throw new UncheckedSQLException(ex);
        }
    }

    public double getDouble(int columnIndex) {
        try {
            return this.rs.getDouble(columnIndex);
        } catch (SQLException ex) {
            throw new UncheckedSQLException(ex);
        }
    }

    public double getDouble(String columnLabel) {
        try {
            return this.rs.getDouble(columnLabel);
        } catch (SQLException ex) {
            throw new UncheckedSQLException(ex);
        }
    }

    public BigDecimal getBigDecimal(int columnIndex) {
        try {
            return this.rs.getBigDecimal(columnIndex);
        } catch (SQLException ex) {
            throw new UncheckedSQLException(ex);
        }
    }

    public BigDecimal getBigDecimal(String columnLabel) {
        try {
            return this.rs.getBigDecimal(columnLabel);
        } catch (SQLException ex) {
            throw new UncheckedSQLException(ex);
        }
    }

    public byte[] getBytes(int columnIndex) {
        try {
            return this.rs.getBytes(columnIndex);
        } catch (SQLException ex) {
            throw new UncheckedSQLException(ex);
        }
    }

    public byte[] getBytes(String columnLabel) {
        try {
            return this.rs.getBytes(columnLabel);
        } catch (SQLException ex) {
            throw new UncheckedSQLException(ex);
        }
    }

    public Date getDate(int columnIndex) {
        try {
            return this.rs.getDate(columnIndex);
        } catch (SQLException ex) {
            throw new UncheckedSQLException(ex);
        }
    }

    public Date getDate(String columnLabel) {
        try {
            return this.rs.getDate(columnLabel);
        } catch (SQLException ex) {
            throw new UncheckedSQLException(ex);
        }
    }

    public Time getTime(int columnIndex) {
        try {
            return this.rs.getTime(columnIndex);
        } catch (SQLException ex) {
            throw new UncheckedSQLException(ex);
        }
    }

    public Time getTime(String columnLabel) {
        try {
            return this.rs.getTime(columnLabel);
        } catch (SQLException ex) {
            throw new UncheckedSQLException(ex);
        }
    }

    public Timestamp getTimestamp(int columnIndex) {
        try {
            return this.rs.getTimestamp(columnIndex);
        } catch (SQLException ex) {
            throw new UncheckedSQLException(ex);
        }
    }

    public Timestamp getTimestamp(String columnLabel) {
        try {
            return this.rs.getTimestamp(columnLabel);
        } catch (SQLException ex) {
            throw new UncheckedSQLException(ex);
        }
    }

    public InputStream getAsciiStream(int columnIndex) {
        try {
            return this.rs.getAsciiStream(columnIndex);
        } catch (SQLException ex) {
            throw new UncheckedSQLException(ex);
        }
    }

    public InputStream getAsciiStream(String columnLabel) {
        try {
            return this.rs.getAsciiStream(columnLabel);
        } catch (SQLException ex) {
            throw new UncheckedSQLException(ex);
        }
    }

    public InputStream getUnicodeStream(int columnIndex) {
        try {
            return this.rs.getUnicodeStream(columnIndex);
        } catch (SQLException ex) {
            throw new UncheckedSQLException(ex);
        }
    }

    public InputStream getUnicodeStream(String columnLabel) {
        try {
            return this.rs.getUnicodeStream(columnLabel);
        } catch (SQLException ex) {
            throw new UncheckedSQLException(ex);
        }
    }

    public InputStream getBinaryStream(int columnIndex) {
        try {
            return this.rs.getBinaryStream(columnIndex);
        } catch (SQLException ex) {
            throw new UncheckedSQLException(ex);
        }
    }

    public InputStream getBinaryStream(String columnLabel) {
        try {
            return this.rs.getBinaryStream(columnLabel);
        } catch (SQLException ex) {
            throw new UncheckedSQLException(ex);
        }
    }

    public Object getObject(int columnIndex) {
        try {
            return this.rs.getObject(columnIndex);
        } catch (SQLException ex) {
            throw new UncheckedSQLException(ex);
        }
    }

    public Object getObject(String columnLabel) {
        try {
            return this.rs.getObject(columnLabel);
        } catch (SQLException ex) {
            throw new UncheckedSQLException(ex);
        }
    }

    public Blob getBlob(int columnIndex) {
        try {
            return this.rs.getBlob(columnIndex);
        } catch (SQLException ex) {
            throw new UncheckedSQLException(ex);
        }
    }

    public Blob getBlob(String columnLabel) {
        try {
            return this.rs.getBlob(columnLabel);
        } catch (SQLException ex) {
            throw new UncheckedSQLException(ex);
        }
    }

    public Clob getClob(int columnIndex) {
        try {
            return this.rs.getClob(columnIndex);
        } catch (SQLException ex) {
            throw new UncheckedSQLException(ex);
        }
    }

    public Clob getClob(String columnLabel) {
        try {
            return this.rs.getClob(columnLabel);
        } catch (SQLException ex) {
            throw new UncheckedSQLException(ex);
        }
    }

    public Array getArray(int columnIndex) {
        try {
            return this.rs.getArray(columnIndex);
        } catch (SQLException ex) {
            throw new UncheckedSQLException(ex);
        }
    }

    public Array getArray(String columnLabel) {
        try {
            return this.rs.getArray(columnLabel);
        } catch (SQLException ex) {
            throw new UncheckedSQLException(ex);
        }
    }
}
