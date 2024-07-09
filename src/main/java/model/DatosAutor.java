package model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DatosAutor(

        @JsonAlias("name") String nombre,
        @JsonAlias("birth_year") String FechaNacimiento,
        @JsonAlias("death_year") String FechaMuerte

) {
}