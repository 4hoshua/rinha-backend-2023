package com.rinhapackage.rinha_backend_2023.resources;


import com.rinhapackage.rinha_backend_2023.dto.PeopleDTO;
import com.rinhapackage.rinha_backend_2023.entities.People;
import com.rinhapackage.rinha_backend_2023.services.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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

    @PostMapping
    public ResponseEntity<PeopleDTO> postPeople(@RequestBody PeopleDTO dto) {

        dto = peopleService.insert(dto);

        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(dto.getId()).toUri();

        return ResponseEntity.created(uri).body(dto);
    }

}
