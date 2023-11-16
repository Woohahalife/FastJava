package org.example.part4.db;

public interface Connection {
    // DB연결동작
    public void getConnection(String url, String username, String password);
}
