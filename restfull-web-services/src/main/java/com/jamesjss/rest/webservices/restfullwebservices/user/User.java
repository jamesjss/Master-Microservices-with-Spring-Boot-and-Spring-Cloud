package com.jamesjss.rest.webservices.restfullwebservices.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    Integer id;
    private String name;
    private Date Birthdate;
}
