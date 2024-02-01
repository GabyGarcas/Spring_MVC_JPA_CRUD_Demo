package com.example.Spring_MVC_JPA_CRUD_Demo.entities;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "correos")

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Correo implements Serializable {
 
    private static final long serialVersionUID = 1L; // el serializado
 
    @Id // La variable que vaya despues de esta anotaciòn será la PrimaryKey
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String correo;
 
    // Cada empleado va a tener muchos telefonos
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
    // @JoinColumn(name = "idEmpleado") // Aqui lo que le digo es que nombre quiero que tenga el campo de relación
    private Empleado empleado; // Esta es la que me genera la relación, el crea un campo para relacionar las dos tablas
 
 
}
