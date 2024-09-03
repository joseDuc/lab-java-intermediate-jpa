package com.lab_java_intermediate_jpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@MappedSuperclass
public abstract class Names {
    String firstName;
    String lastName;
    String middleName;
    String salutation;
}
