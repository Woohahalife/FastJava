package org.example.part4.db;

public class MSSQLDriver implements Connection{

    @Override
    public void getConnection(String url, String username, String password) {
        System.out.println("Oracle DB연결 시도");
    }
}
