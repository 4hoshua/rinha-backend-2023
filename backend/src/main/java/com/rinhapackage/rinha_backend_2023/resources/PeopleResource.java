package com.rinhapackage.rinha_backend_2023.resources;


import com.rinhapackage.rinha_backend_2023.dto.PeopleDTO;
import com.rinhapackage.rinha_backend_2023.entities.People;
import com.rinhapackage.rinha_backend_2023.services.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping(value = "/pessoas")
public class PeopleResource {

    @Autowired
    private PeopleService peopleService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<PeopleDTO> findById(@PathVariable UUID id) {
        PeopleDTO people = peopleService.findById(id);
        return ResponseEntity.ok().body(people);
    }


}
