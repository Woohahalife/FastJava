package org.example.part2;

import org.example.part2.model.MovieDTO;

public class MovieDTOTest {
    public static void main(String[] args) {
        MovieDTO dto = new MovieDTO(
                "아바타", "2022-12-14", "제이크 설리","액션", 192.0f, 12);

        System.out.println(dto.toString());

    }
}
