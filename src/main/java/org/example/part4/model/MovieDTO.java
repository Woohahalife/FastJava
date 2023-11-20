package org.example.part4.model;

public class MovieDTO {
    private String title;
    private String director;
    private String year;
    private String country;

    public MovieDTO() {

    }

    public MovieDTO(String title, String director, String year, String country) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.country = country;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public String getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "MovieDTO{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", year='" + year + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
