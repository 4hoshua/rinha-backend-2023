package com.rinhapackage.rinha_backend_2023.repositories;


import com.rinhapackage.rinha_backend_2023.entities.People;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface PeopleRepository extends JpaRepository<People, UUID> {

    @Query("select id from People where name = ?1")
    UUID findByName(String nome);


    @Query(value = "select id from pessoas where nome = ?1", nativeQuery = true)
    UUID findByName2(String nome);
}
