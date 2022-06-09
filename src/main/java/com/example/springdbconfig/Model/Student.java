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
public class Student {

    @Id
    public long Id;
    public String Name;
    public String phoneNum;
    public int age;
    public String Address;


}
