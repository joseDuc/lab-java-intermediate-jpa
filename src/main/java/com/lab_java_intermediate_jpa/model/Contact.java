package com.lab_java_intermediate_jpa.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Contact extends Names {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    Long id;
    private String title;
    private String company;
}
