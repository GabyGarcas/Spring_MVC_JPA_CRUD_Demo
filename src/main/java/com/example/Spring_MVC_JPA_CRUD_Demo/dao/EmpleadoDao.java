package com.example.Spring_MVC_JPA_CRUD_Demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Spring_MVC_JPA_CRUD_Demo.entities.Empleado;

import java.util.List;



@Repository
public interface EmpleadoDao extends JpaRepository <Empleado, Integer>{
List<Empleado> findByNombre(String nombre);
}

