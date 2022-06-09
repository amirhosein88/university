package com.example.springdbconfig.Model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;


@Getter
@Setter
@Data
@Entity
public class Professor {

    @Id
    public long Id;
    public String name;
    public String Address;
    public String Age;
    public String phoneNumber;


}
