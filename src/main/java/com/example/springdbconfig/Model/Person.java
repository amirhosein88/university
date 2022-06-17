package com.example.springdbconfig.Model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Person {
    @Id
    public long Id;
    public String name;
}
