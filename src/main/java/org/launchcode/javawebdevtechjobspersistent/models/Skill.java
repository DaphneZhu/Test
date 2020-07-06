package org.launchcode.javawebdevtechjobspersistent.models;


import javax.persistence.Entity;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @Size(min = 1, max = 100)
    private String skill;

    public Skill (){}


}