/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.orz.pascal.jl2.sql;

import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.stream.Collectors;
import org.dbunit.IDatabaseTester;
import org.dbunit.JdbcDatabaseTester;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.operation.DatabaseOperation;
import org.h2.tools.RunScript;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * Query Stream Test.
 *
 * @author koduki
 */
public class QueryStreamTest {

    private static final String JDBC_DRIVER = org.h2.Driver.class.getName();
    private static final String JDBC_URL = "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1";
    private static final String USER = "sa";
    private static final String PASSWORD = "";

    @Before
    public void setUp() throws Exception {
        RunScript.execute(DriverManager.getConnection(JDBC_URL, USER, PASSWORD), new FileReader("src/test/resources/data/schema.sql"));
        IDataSet dataSet = new FlatXmlDataSetBuilder().build(new File("src/test/resources/data/setup_dataset.xml"));
        IDatabaseTester databaseTester = new JdbcDatabaseTester(JDBC_DRIVER, JDBC_URL, USER, PASSWORD);
        databaseTester.setSetUpOperation(DatabaseOperation.CLEAN_INSERT);
        databaseTester.setDataSet(dataSet);
        databaseTester.onSetup();

        Class.forName(JDBC_DRIVER);
    }

    public QueryStreamTest() {
    }

    @Test
    public void testOf() throws Exception {
        try (
                Connection con = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
                PreparedStatement pt = con.prepareStatement("select * from persons ");) {
            List<String> ids = QueryStream.of(pt.executeQuery())
                    .map(r -> r.getString(1))
                    .collect(Collectors.toList());

            assertThat(ids.size(), is(4));
            assertThat(ids.get(0), is("1"));
            assertThat(ids.get(1), is("2"));
            assertThat(ids.get(2), is("3"));
            assertThat(ids.get(3), is("4"));
        }
    }
}
