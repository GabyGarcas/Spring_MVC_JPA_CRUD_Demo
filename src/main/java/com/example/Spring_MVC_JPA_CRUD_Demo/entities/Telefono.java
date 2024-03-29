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
@Table( name =  "telefonos")

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Telefono implements Serializable {

    private static final long serialVersionUID = 1L;
    //Serializar: Convertimos un objeto en un flujo.


    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
private int id;
private String nombre;



@ManyToOne (fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
private Empleado empleado;
}
