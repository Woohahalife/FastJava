package org.example.part4;

import org.example.part4.model.MovieDTO;

import java.util.ArrayList;

public class ListApiTest {
    public static void main(String[] args) {
        ArrayList<MovieDTO> list = new ArrayList<MovieDTO>();

        list.add(new MovieDTO("괴물", "봉준호", "2006", "한국"));
        list.add(new MovieDTO("기생충", "봉준호", "2019", "한국"));
        list.add(1 ,new MovieDTO("완벽한타인", "이재규", "2018", "한국"));
        list.add(2, new MovieDTO("고사", "unknown", "2012", "한국"));

        System.out.println("+----------------+--------+----+------");
        System.out.println("+영화제목          |감독     |개봉연도|국가|");
        System.out.println("+----------------+--------+----+------");
        for(MovieDTO m : list) {
            System.out.printf("|%-16s|%-8s|%4s|5-6s|%n",
                    m.getTitle(), m.getDirector(), m.getYear(), m.getCountry());
        }
        System.out.println("+----------------+--------+----+------");

        // ArrayList에서 Movie 객체 검색
        String searchTitle = "기생충";

        // 순차검색
        for(MovieDTO m : list) {
            if(m.getTitle().equals(searchTitle)) {
                System.out.println("검색결과 : " + m);
                break;
            }
        }
    }
}
