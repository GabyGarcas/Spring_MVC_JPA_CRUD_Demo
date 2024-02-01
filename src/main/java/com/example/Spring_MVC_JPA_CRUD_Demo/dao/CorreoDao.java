package com.example.Spring_MVC_JPA_CRUD_Demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Spring_MVC_JPA_CRUD_Demo.entities.Correo;
import com.example.Spring_MVC_JPA_CRUD_Demo.entities.Empleado;


@Repository
public interface CorreoDao extends JpaRepository <Correo, Integer>{
List<Correo> findByEmpleado(Empleado empleado);
void deleteByEmpleado(Empleado empleado);
}
