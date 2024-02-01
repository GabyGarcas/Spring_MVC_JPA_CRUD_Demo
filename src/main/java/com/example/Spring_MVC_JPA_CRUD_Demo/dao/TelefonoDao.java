package com.example.Spring_MVC_JPA_CRUD_Demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Spring_MVC_JPA_CRUD_Demo.entities.Empleado;
import com.example.Spring_MVC_JPA_CRUD_Demo.entities.Telefono;
import java.util.List;



@Repository
public interface TelefonoDao extends JpaRepository <Telefono, Integer>{
List<Telefono> findByEmpleado(Empleado empleado);
void deleteByEmpleado(Empleado empleado);
}
