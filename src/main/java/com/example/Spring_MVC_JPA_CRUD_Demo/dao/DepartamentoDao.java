package com.example.Spring_MVC_JPA_CRUD_Demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Spring_MVC_JPA_CRUD_Demo.entities.Departamento;

@Repository
public interface DepartamentoDao extends JpaRepository <Departamento, Integer> {

}
