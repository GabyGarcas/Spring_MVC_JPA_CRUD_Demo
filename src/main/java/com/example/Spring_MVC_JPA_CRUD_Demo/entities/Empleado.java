package com.example.Spring_MVC_JPA_CRUD_Demo.entities;

import java.io.Serializable;
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
@Table(name = "empleados")


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor



public class Empleado implements Serializable{

    private static final long serialVersionUID = 1L;


//Para señalar que id es el primary key
@Id
//Para que sea autoincremental
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;
    private String primerApellido;
    private String segundoApellido;

//Hay que señalar los campos de fecha y hora
@DateTimeFormat (pattern = "yyyy-MM-dd")
    private LocalDate fechaDeAlta;

    private double salario;

//Con esto ya me toma el nombre, 
@Enumerated(EnumType.STRING)
    private Genero genero;


    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)  //de muchos empleados a un departamento
    // queremos que no este asociando empleados con departamento. luego como queremos que se propague el cambio en este caso, cascade
    private Departamento departamento;

}
