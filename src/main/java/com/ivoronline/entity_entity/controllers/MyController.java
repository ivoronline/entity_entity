package com.ivoronline.entity_entity.controllers;

import com.ivoronline.entity_entity.entities.PersonEntity;
import com.ivoronline.entity_entity.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

  @Autowired
  PersonRepository personRepository;

  @ResponseBody
  @RequestMapping("/addPerson")
  public String addPerson() {

    //CREATE ENTITY OBJECT
    PersonEntity personEntity      = new PersonEntity();
                 personEntity.id   = 1;
                 personEntity.name = "John";
                 personEntity.age  = 20;

    //STORE ENTITY OBJECT INTO DB
    personRepository.save(personEntity);

    //RETURN SOMETHING TO BROWSER
    return personEntity.name + " was stored into DB";

  }

}
