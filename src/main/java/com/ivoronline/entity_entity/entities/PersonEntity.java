package com.ivoronline.entity_entity.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PersonEntity {

  @Id
  public Integer id;
  public String  name;
  public Integer age;

}





