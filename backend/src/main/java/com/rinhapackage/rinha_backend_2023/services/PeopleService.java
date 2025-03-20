package com.rinhapackage.rinha_backend_2023.services;

import com.rinhapackage.rinha_backend_2023.dto.PeopleDTO;
import com.rinhapackage.rinha_backend_2023.entities.People;
import com.rinhapackage.rinha_backend_2023.repositories.PeopleRepository;
import org.hibernate.Hibernate;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PeopleService {

    @Autowired
    private PeopleRepository peopleRepository;

    @Transactional
    public PeopleDTO insert(PeopleDTO dto) {
        People entity = new People();

        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setNick(dto.getNick());
        entity.setBirthDate(dto.getBirthDate());

        entity.getStack().clear();

        for (String stack : dto.getStack()) {
            entity.getStack().add(stack);
        }

        entity = peopleRepository.save(entity);

        return new PeopleDTO(entity);
    }

    @Transactional(readOnly = true)
    public PeopleDTO findById(UUID id) {
        Optional<People> obj = peopleRepository.findById(id);
        People people = obj.get();
        return new PeopleDTO(people, people.getStack());
    }

    @Transactional(readOnly = true)
    public PeopleDTO findByName(String nome) {
        UUID uuid = peopleRepository.findByName(nome);
        Optional<People> entity = peopleRepository.findById(uuid);

        People people = entity.get();
        return new PeopleDTO(people, people.getStack());
    }
}
