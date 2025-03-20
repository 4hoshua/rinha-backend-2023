package com.rinhapackage.rinha_backend_2023.repositories;


import com.rinhapackage.rinha_backend_2023.entities.People;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface PeopleRepository extends JpaRepository<People, UUID> {


}
