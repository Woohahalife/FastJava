package org.example.part4.db;

public class OracleDriver implements Connection{

    @Override
    public void getConnection(String url, String username, String password) {
        System.out.println("Oracle DB연결 시도");
    }
}
