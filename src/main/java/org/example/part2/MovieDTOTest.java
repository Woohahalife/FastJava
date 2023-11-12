package org.example.part2;

import org.example.part2.model.MovieDTO;

public class MovieDTOTest {
    public static void main(String[] args) {
        MovieDTO dto = new MovieDTO(
                "아바타", "2022-12-14", "제이크 설리","액션", 192.0f, 12);

        System.out.println(dto.toString());

//        MovieDTO[] dto = new MovieDTO[3];
//        dto[0] = new MovieDTO(
//                "아바타", "2022-12-14", "제이크 설리1", "액션1", 192.0f, 12);
//        dto[1] = new MovieDTO(
//                "아바타1", "2022-12-14", "제이크 설리2", "액션2", 192.0f, 12);
//        dto[2] = new MovieDTO(
//                "아바타2", "2022-12-14", "제이크 설리3", "액션3", 192.0f, 12);
//
//        for (MovieDTO i : dto) {
//            System.out.println(i);
//        }
    }
}
