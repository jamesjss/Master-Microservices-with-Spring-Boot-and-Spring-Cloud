package com.jamesjss.rest.webservices.restfullwebservices.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    Integer id;

    @Size(min=2, message = "Name should have at lest 2 characters")
    private String name;

    @Past
    private Date Birthdate;
}
