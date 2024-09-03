package com.lab_java_intermediate_jpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "BillableTask")
public class BillableTask extends Task{
double hourlyRate;
}
