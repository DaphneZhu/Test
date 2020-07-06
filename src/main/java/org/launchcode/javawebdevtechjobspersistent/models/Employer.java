package org.launchcode.javawebdevtechjobspersistent.models;


import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @NotEmpty
    @Size(min = 1, max = 120)
    private String location;

    public Employer () {}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
