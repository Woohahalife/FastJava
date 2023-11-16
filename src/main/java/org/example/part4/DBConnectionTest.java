package org.example.part4;

import org.example.part4.db.Connection;
import org.example.part4.db.OracleDriver;

public class DBConnectionTest {
    public static void main(String[] args) {
        Connection conn = new OracleDriver();
        conn.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "password");
    }
}
