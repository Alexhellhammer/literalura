package com.libralex.literalura.repository;

import com.libralex.literalura.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {
    Autor findByNombreIgnoreCase(String nombre);

    @Query("SELECT a FROM Autor a WHERE a.fechaNacimiento <= :year AND :year < a.fechaMuerte OR a.fechaMuerte = 0 ")
    List<Autor> autorVivosEnDeterminadoYear(@Param("year") int year);
}